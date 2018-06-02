package com.hr.note.model.insurance;


import com.hr.note.model.SexEnum;

import java.io.Serializable;

/**
 * Created by hurui on 2017/5/23.
 */
public class Insurer implements Cloneable, Serializable {

  private String name;

  private SexEnum sexEnum;

  private String mobile;

  private Policy policy;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SexEnum getSexEnum() {
    return sexEnum;
  }

  public void setSexEnum(SexEnum sexEnum) {
    this.sexEnum = sexEnum;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public Policy getPolicy() {
    return policy;
  }

  public void setPolicy(Policy policy) {
    this.policy = policy;
  }

  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
