package lol.strategy;

import lol.hero.Hero;
import lol.skill.SummonerSkill;

/**
 * Created by hurui on 2017/6/27.
 */
public class DefendStrategy implements Strategy {

  @Override
  public void chooseHeroes() throws Exception {

    SummonerSkill flash = ssFactory.getSkillSS("Flash");
    SummonerSkill teleport = ssFactory.getSkillSS("Teleport");
    SummonerSkill ignite = ssFactory.getSkillSS("Ignite");
    SummonerSkill revive = ssFactory.getSkillSS("Revive");
    SummonerSkill heal = ssFactory.getSkillSS("Heal");

    Hero top = heroFactory.getHero("Rumble", flash, teleport);
    Hero jungle = heroFactory.getHero("Jax", flash, revive);
    Hero mid = heroFactory.getHero("Viktor", flash, teleport);
    Hero ad = heroFactory.getHero("Ezreal", flash, heal);
    Hero support = heroFactory.getHero("Thresh", flash, heal);

    System.out.println("防守阵容：");
    printHero(top);
    printHero(jungle);
    printHero(mid);
    printHero(ad);
    printHero(support);
  }

  private void printHero(Hero top) {
    System.out.println(top.getHeroName() + ":" + top.getDSS().ssName() + "+" + top.getFSS().ssName());
  }


}
