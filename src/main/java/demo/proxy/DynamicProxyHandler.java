package demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by hurui on 2017/11/9.
 */
public class DynamicProxyHandler implements InvocationHandler {

//  private Object proxied;
//
//  public DynamicProxyHandler(SomeObject someObject) {
//    this.proxied = someObject;
//  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("invoke...");
    //return method.invoke(proxied, args);
    return "invoke do something";
  }

}
