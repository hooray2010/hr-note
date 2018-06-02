package com.hr.note.pattern.lol.model.skill;

/**
 * Created by hurui on 2017/6/28.
 */
public class ExhaustSS implements SummonerSkill {
  
  private static final String name = "虚弱";
  
  @Override
  public String ssName() {
    return name;
  }
  
  @Override
  public void releaseSS() {
    System.out.println("虚弱");
  }
  
}
