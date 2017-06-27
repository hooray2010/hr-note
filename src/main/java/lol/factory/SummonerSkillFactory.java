package main.java.lol.factory;

import main.java.lol.skill.SummonerSkill;

/**
 * Created by hurui on 2017/6/27.
 */
public class SummonerSkillFactory {
  
  private static final String classNameSuffix = "SS";
  
  public SummonerSkill getSkillSS(String ssName) throws Exception {
    
    String className = ssName + classNameSuffix;
    String packageName = SummonerSkill.class.getPackage().getName();
    SummonerSkill ss = (SummonerSkill) Class.forName(packageName + "." + className).newInstance();
    
    return ss;
  }
  
}
