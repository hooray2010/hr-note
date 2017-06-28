package lol.model.hero;

import lol.model.HeroName;
import lol.model.skill.SummonerSkill;

/**
 * Created by hurui on 2017/6/27.
 */
public class EzrealHero extends Hero {
  
  public EzrealHero(SummonerSkill d, SummonerSkill f) {
    super(HeroName.EZREAL, d, f);
  }
  
  @Override
  public void q() {
    System.out.println("Ezreal Q");
  }
  
  @Override
  public void w() {
    System.out.println("Ezreal W");
  }
  
  @Override
  public void e() {
    System.out.println("Ezreal E");
  }
  
  @Override
  public void r() {
    System.out.println("Ezreal R");
  }
}
