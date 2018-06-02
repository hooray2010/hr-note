package com.hr.note.pattern.lol.model.skill;

/**
 * Created by hurui on 2017/6/27.
 */
public class TeleportSS implements SummonerSkill {

  private static final String name = "传送";

  @Override
  public String ssName() {
    return name;
  }

  @Override
  public void releaseSS() {
    System.out.println("传送");
  }

}
