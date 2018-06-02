package com.hr.note.pattern.lol.factory;

import com.hr.note.pattern.lol.model.hero.Hero;
import com.hr.note.pattern.lol.model.skill.SummonerSkill;

/**
 * Created by hurui on 2017/6/27.
 */
public class HeroFactory {
  
  private static final String classNameSuffix = "Hero";
  
  public static Hero getHero(String heroName, SummonerSkill d, SummonerSkill f) throws Exception {
    
    String className = heroName + classNameSuffix;
    String packageName = Hero.class.getPackage().getName();
    Hero hero = (Hero) Class.forName(packageName + "." + className)
        .getConstructor(SummonerSkill.class, SummonerSkill.class)
        .newInstance(d, f);
    
    return hero;
  }
  
}
