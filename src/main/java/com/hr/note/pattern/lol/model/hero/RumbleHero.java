package com.hr.note.pattern.lol.model.hero;

import com.hr.note.pattern.lol.model.skill.SummonerSkill;

/**
 * Created by hurui on 2017/6/27.
 */
public class RumbleHero extends Hero {

  public RumbleHero(SummonerSkill d, SummonerSkill f) {
    super("Rumble", d, f);
  }

  @Override
  public void q() {
    System.out.println("Rumble Q");
  }

  @Override
  public void w() {
    System.out.println("Rumble W");
  }

  @Override
  public void e() {
    System.out.println("Rumble E");
  }

  @Override
  public void r() {
    System.out.println("Rumble R");
  }
}
