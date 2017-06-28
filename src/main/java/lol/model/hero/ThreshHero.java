package lol.model.hero;

import lol.model.skill.SummonerSkill;

/**
 * Created by hurui on 2017/6/27.
 */
public class ThreshHero extends Hero {

  public static final String name = "Thresh";

  public ThreshHero(SummonerSkill d, SummonerSkill f) {
    super("Thresh", d, f);
  }

  @Override
  public void q() {
    System.out.println("Thresh Q");
  }

  @Override
  public void w() {
    System.out.println("Thresh W");
  }

  @Override
  public void e() {
    System.out.println("Thresh E");
  }

  @Override
  public void r() {
    System.out.println("Thresh R");
  }
}
