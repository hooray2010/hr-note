package com.hr.note.model.insurance;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by hurui on 2017/6/25.
 */
public class Policy implements Serializable {

  private long sumInsured;

  private String policyNo;

  private Date effectedAt;

  private Date expiredAt;

  public long getSumInsured() {
    return sumInsured;
  }

  public void setSumInsured(long sumInsured) {
    this.sumInsured = sumInsured;
  }

  public String getPolicyNo() {
    return policyNo;
  }

  public void setPolicyNo(String policyNo) {
    this.policyNo = policyNo;
  }

  public Date getEffectedAt() {
    return effectedAt;
  }

  public void setEffectedAt(Date effectedAt) {
    this.effectedAt = effectedAt;
  }

  public Date getExpiredAt() {
    return expiredAt;
  }

  public void setExpiredAt(Date expiredAt) {
    this.expiredAt = expiredAt;
  }
}
