package lol.strategy;

import lol.factory.HeroFactory;
import lol.factory.SummonerSkillFactory;
import lol.model.HeroName;
import lol.model.SummonerSkillName;
import lol.model.hero.Hero;
import lol.model.skill.SummonerSkill;

/**
 * Created by hurui on 2017/6/27.
 */
public class DefendStrategy implements Strategy {
  
  @Override
  public void chooseHeroes() throws Exception {
    
    SummonerSkill flash = SummonerSkillFactory.getSkillSS(SummonerSkillName.FLASH);
    SummonerSkill teleport = SummonerSkillFactory.getSkillSS(SummonerSkillName.TELEPORT);
    SummonerSkill exhaust = SummonerSkillFactory.getSkillSS(SummonerSkillName.EXHAUST);
    SummonerSkill revive = SummonerSkillFactory.getSkillSS(SummonerSkillName.REVIVE);
    SummonerSkill heal = SummonerSkillFactory.getSkillSS(SummonerSkillName.HEAL);
    
    Hero top = HeroFactory.getHero(HeroName.RUMBLE, flash, teleport);
    Hero jungle = HeroFactory.getHero(HeroName.JAX, flash, revive);
    Hero mid = HeroFactory.getHero(HeroName.VIKTOR, flash, teleport);
    Hero ad = HeroFactory.getHero(HeroName.EZREAL, flash, heal);
    Hero support = HeroFactory.getHero(HeroName.THRESH, flash, exhaust);
    
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
