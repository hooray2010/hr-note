package com.hr.note.pattern.lol.strategy;

import com.hr.note.pattern.lol.factory.SummonerSkillFactory;
import com.hr.note.pattern.lol.model.skill.SummonerSkill;
import com.hr.note.pattern.lol.factory.HeroFactory;
import com.hr.note.pattern.lol.model.HeroName;
import com.hr.note.pattern.lol.model.SummonerSkillName;

/**
 * Created by hurui on 2017/6/27.
 */
public class AttackStrategy extends Strategy {

  @Override
  public Strategy chooseHeroes() throws Exception {

    SummonerSkill flash = SummonerSkillFactory.getSkillSS(SummonerSkillName.FLASH);
    SummonerSkill ignite = SummonerSkillFactory.getSkillSS(SummonerSkillName.IGNITE);
    SummonerSkill revive = SummonerSkillFactory.getSkillSS(SummonerSkillName.IGNITE);
    SummonerSkill heal = SummonerSkillFactory.getSkillSS(SummonerSkillName.HEAL);

    top = HeroFactory.getHero(HeroName.JAX, flash, ignite);
    jungle = HeroFactory.getHero(HeroName.RUMBLE, flash, revive);
    mid = HeroFactory.getHero(HeroName.FIZZ, flash, ignite);
    ad = HeroFactory.getHero(HeroName.EZREAL, flash, heal);
    support = HeroFactory.getHero(HeroName.THRESH, flash, ignite);

    return this;
  }

}
