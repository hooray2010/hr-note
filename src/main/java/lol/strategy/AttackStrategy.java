package lol.strategy;

import lol.hero.Hero;
import lol.skill.SummonerSkill;

/**
 * Created by hurui on 2017/6/27.
 */
public class AttackStrategy implements Strategy {

  @Override
  public void chooseHeroes() throws Exception {

    SummonerSkill flash = ssFactory.getSkillSS("Flash");
    SummonerSkill ignite = ssFactory.getSkillSS("Ignite");
    SummonerSkill revive = ssFactory.getSkillSS("Revive");
    SummonerSkill heal = ssFactory.getSkillSS("Heal");

    Hero top = heroFactory.getHero("Jax", flash, ignite);
    Hero jungle = heroFactory.getHero("Rumble", flash, revive);
    Hero mid = heroFactory.getHero("Fizz", flash, ignite);
    Hero ad = heroFactory.getHero("Ezreal", flash, heal);
    Hero support = heroFactory.getHero("Thresh", flash, ignite);

    System.out.println("攻击阵容：");
    printHero(top);
    printHero(jungle);
    printHero(mid);
    printHero(ad);
    printHero(support);
  }

  private void printHero(Hero top) {
    System.out.println(top.getHeroName() + ":" + top.getDSS().ssName() + "+" + top.getDSS().ssName());
  }

}
