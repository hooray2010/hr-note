package demo.pattern.lol.factory;

import demo.pattern.lol.model.SummonerSkillName;
import demo.pattern.lol.model.skill.*;

/**
 * Created by hurui on 2017/6/27.
 */
public class SummonerSkillFactory {
  
  private static final String classNameSuffix = "SS";
  
  public static SummonerSkill getSkillSS(String ssName) throws Exception {

//    String className = ssName + classNameSuffix;
//    String packageName = SummonerSkill.class.getPackage().getName();
//    SummonerSkill ss = (SummonerSkill) Class.forName(packageName + "." + className).newInstance();
    
    SummonerSkill ss;
    if (ssName.equals(SummonerSkillName.FLASH)) {
      ss = new FlashSS();
    } else if (ssName.equals(SummonerSkillName.TELEPORT)) {
      ss = new TeleportSS();
    } else if (ssName.equals(SummonerSkillName.HEAL)) {
      ss = new HealSS();
    } else if (ssName.equals(SummonerSkillName.IGNITE)) {
      ss = new IgniteSS();
    } else if (ssName.equals(SummonerSkillName.EXHAUST)) {
      ss = new ExhaustSS();
    } else {
      ss = new ReviveSS();
    }
    
    return ss;
  }
  
}
