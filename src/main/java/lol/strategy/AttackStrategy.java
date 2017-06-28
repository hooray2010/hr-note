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
public class AttackStrategy implements Strategy {
  
  @Override
  public void chooseHeroes() throws Exception {
    
    SummonerSkill flash = SummonerSkillFactory.getSkillSS(SummonerSkillName.FLASH);
    SummonerSkill ignite = SummonerSkillFactory.getSkillSS(SummonerSkillName.IGNITE);
    SummonerSkill revive = SummonerSkillFactory.getSkillSS(SummonerSkillName.IGNITE);
    SummonerSkill heal = SummonerSkillFactory.getSkillSS(SummonerSkillName.HEAL);
    
    Hero top = HeroFactory.getHero(HeroName.JAX, flash, ignite);
    Hero jungle = HeroFactory.getHero(HeroName.RUMBLE, flash, revive);
    Hero mid = HeroFactory.getHero(HeroName.FIZZ, flash, ignite);
    Hero ad = HeroFactory.getHero(HeroName.EZREAL, flash, heal);
    Hero support = HeroFactory.getHero(HeroName.THRESH, flash, ignite);
    
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
