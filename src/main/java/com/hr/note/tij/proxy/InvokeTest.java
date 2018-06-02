package com.hr.note.tij.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by hurui on 2017/8/20.
 */
public class InvokeTest{

  //Object o = Proxy.newProxyInstance();
  public static void main(String[] args) throws NoSuchMethodException {
    //Constructor<?> constructor = InvokeTest.class.getConstructor();
    //System.out.println(constructor);
    ClassLoader classLoader = SomeInterface.class.getClassLoader();
    //Class<?>[] interfaces = SomeObject.class.getClass().getInterfaces();
    SomeInterface test = (SomeInterface)Proxy.newProxyInstance(classLoader, new Class[]{SomeInterface.class}, new DynamicProxyHandler());
    String something = test.doSomething();
    System.out.println(something);
  }
}
