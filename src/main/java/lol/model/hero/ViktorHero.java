package lol.model.hero;

import lol.model.skill.SummonerSkill;

/**
 * Created by hurui on 2017/6/27.
 */
public class ViktorHero extends Hero {

  public static final String name = "Viktor";

  public ViktorHero(SummonerSkill d, SummonerSkill f) {
    super("Viktor", d, f);
  }

  @Override
  public void q() {
    System.out.println("Viktor Q");
  }

  @Override
  public void w() {
    System.out.println("Viktor W");
  }

  @Override
  public void e() {
    System.out.println("Viktor E");
  }

  @Override
  public void r() {
    System.out.println("Viktor R");
  }
}
