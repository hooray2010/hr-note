package cn.zawa.demo.test;

import cn.zawa.demo.pojo.SimpleObject;
import cn.zawa.demo.pojo.insurance.Insurer;
import cn.zawa.demo.pojo.insurance.Policy;

import java.io.*;
import java.util.Date;

/**
 * Created by hurui on 2017/6/25.
 */
public class CloneTest {

  public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {

    //testSerialize();
    //testShadowClone();;
    testDeepClone();

  }

  /**
   * 浅克隆，复制引用
   */
  private static void testShadowClone() throws CloneNotSupportedException {
    Insurer insurer = new Insurer();
    insurer.setName("老王");
    Policy policy = new Policy();
    policy.setSumInsured(10000L);
    policy.setPolicyNo("lw001");
    policy.setEffectedAt(new Date());
    insurer.setPolicy(policy);

    Insurer cInsurer = (Insurer) insurer.clone();

    System.out.println(cInsurer.getName());
    System.out.println(insurer.equals(cInsurer));
  }

  /**
   * 深度克隆
   */
  private static void testDeepClone() throws IOException, ClassNotFoundException {
    Insurer insurer = new Insurer();
    insurer.setName("老王");
    Policy policy = new Policy();
    policy.setSumInsured(10000L);
    policy.setPolicyNo("lw001");
    policy.setEffectedAt(new Date());
    insurer.setPolicy(policy);

    //序列化
    ByteArrayOutputStream bout = new ByteArrayOutputStream();
    ObjectOutputStream out = new ObjectOutputStream(bout);
    out.writeObject(insurer);
    out.close();


    //返序列化
    ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
    ObjectInputStream in = new ObjectInputStream(bin);

    Insurer cInsurer = (Insurer) in.readObject();

    System.out.println(cInsurer.getName());
    System.out.println(insurer.equals(cInsurer));
  }

  /**
   * 说明：
   * 读取对象的顺序与写入时的顺序要一致。
   * 对象的默认序列化机制写入的内容是：对象的类，类签名，以及非瞬态和非静态字段的值。
   */
  private static void testSerialize() throws IOException, ClassNotFoundException {
    SimpleObject so = new SimpleObject();
    so.setStr("AAA");

    //序列化
    ByteArrayOutputStream bout = new ByteArrayOutputStream();
    ObjectOutputStream out = new ObjectOutputStream(bout);

    String param = "aaa";
    out.writeObject(param);
    out.writeObject(so);
    out.close();

    //返序列化
    ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
    ObjectInputStream in = new ObjectInputStream(bin);

    String param1 = (String) in.readObject();
    SimpleObject so1 = (SimpleObject) in.readObject();
    System.out.println(param1);
    System.out.println(so1.getStr());
    in.close();
  }

}