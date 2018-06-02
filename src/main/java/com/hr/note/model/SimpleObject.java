package com.hr.note.model;

import java.io.Serializable;

/**
 * Created by hurui on 2017/6/25.
 */
public class SimpleObject implements Cloneable, Serializable {

  private String str;

  public SimpleObject() {
    System.out.println("Enter SimpleObject.constructor()");
  }

  public String getStr() {
    return str;
  }

  public void setStr(String str) {
    this.str = str;
  }

  public Object colne() throws CloneNotSupportedException {
    return super.clone();
  }

}
