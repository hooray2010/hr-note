package main.java.lol;

import main.java.lol.hero.Hero;
import main.java.lol.skill.SummonerSkill;

/**
 * Created by hurui on 2017/6/27.
 */
public class LolFactory {
  
  private static final String classNameSuffix = "Hero";
  
  public Hero getHero(String heroName, SummonerSkill d, SummonerSkill f) throws Exception {
    
    String className = heroName + classNameSuffix;
    String packageName = Hero.class.getPackage().getName();
    Hero hero = (Hero) Class.forName(packageName + "." + className)
        .getConstructor(SummonerSkill.class, SummonerSkill.class)
        .newInstance(d, f);
    
    return hero;
  }
  
}
