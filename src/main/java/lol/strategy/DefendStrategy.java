package lol.strategy;

import lol.factory.HeroFactory;
import lol.factory.SummonerSkillFactory;
import lol.model.HeroName;
import lol.model.SummonerSkillName;
import lol.model.skill.SummonerSkill;

/**
 * Created by hurui on 2017/6/27.
 */
public class DefendStrategy extends Strategy {

  @Override
  public Strategy chooseHeroes() throws Exception {

    SummonerSkill flash = SummonerSkillFactory.getSkillSS(SummonerSkillName.FLASH);
    SummonerSkill teleport = SummonerSkillFactory.getSkillSS(SummonerSkillName.TELEPORT);
    SummonerSkill exhaust = SummonerSkillFactory.getSkillSS(SummonerSkillName.EXHAUST);
    SummonerSkill revive = SummonerSkillFactory.getSkillSS(SummonerSkillName.REVIVE);
    SummonerSkill heal = SummonerSkillFactory.getSkillSS(SummonerSkillName.HEAL);

    top = HeroFactory.getHero(HeroName.RUMBLE, flash, teleport);
    jungle = HeroFactory.getHero(HeroName.JAX, flash, revive);
    mid = HeroFactory.getHero(HeroName.VIKTOR, flash, teleport);
    ad = HeroFactory.getHero(HeroName.EZREAL, flash, heal);
    support = HeroFactory.getHero(HeroName.THRESH, flash, exhaust);

    return this;
  }

}
