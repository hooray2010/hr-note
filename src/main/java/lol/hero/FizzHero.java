package lol.hero;

import lol.skill.SummonerSkill;

/**
 * Created by hurui on 2017/6/27.
 */
public class FizzHero extends Hero {

  public FizzHero(SummonerSkill d, SummonerSkill f) {
    super("Fizz", d, f);
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
