package com.hr.note.pattern.lol.model.hero;


import com.hr.note.pattern.lol.model.skill.SummonerSkill;
import com.hr.note.pattern.lol.model.HeroName;

/**
 * Created by hurui on 2017/6/27.
 */
public class FizzHero extends Hero {
  
  public FizzHero(SummonerSkill d, SummonerSkill f) {
    super(HeroName.FIZZ, d, f);
  }
  
  @Override
  public void q() {
    System.out.println("Fizz Q");
  }
  
  @Override
  public void w() {
    System.out.println("Fizz W");
  }
  
  @Override
  public void e() {
    System.out.println("Fizz E");
  }
  
  @Override
  public void r() {
    System.out.println("Fizz R");
  }
  
}
