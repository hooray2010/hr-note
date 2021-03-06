package com.hr.note.pattern.lol.model.hero;

import com.hr.note.pattern.lol.model.skill.SummonerSkill;

/**
 * Created by hurui on 2017/6/27.
 */
public class JaxHero extends Hero {

  public JaxHero(SummonerSkill d, SummonerSkill f) {
    super("Jax",d, f);
  }

  @Override
  public void q() {
    System.out.println("Jax Q");
  }

  @Override
  public void w() {
    System.out.println("Jax W");
  }

  @Override
  public void e() {
    System.out.println("Jax E");
  }

  @Override
  public void r() {
    System.out.println("Jax R");
  }

}
