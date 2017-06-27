package lol.factory;

import lol.skill.*;

/**
 * Created by hurui on 2017/6/27.
 */
public class SummonerSkillFactory {

  private static final String classNameSuffix = "SS";

  public SummonerSkill getSkillSS(String ssName) throws Exception {

//    String className = ssName + classNameSuffix;
//    String packageName = SummonerSkill.class.getPackage().getName();
//    SummonerSkill ss = (SummonerSkill) Class.forName(packageName + "." + className).newInstance();

    SummonerSkill ss;
    if (ssName.equals("Flash")) {
      ss = new FlashSS();
    } else if (ssName.equals("Teleport")) {
      ss = new TeleportSS();
    } else if (ssName.equals("Heal")) {
      ss = new HealSS();
    } else {
      ss = new IgniteSS();
    }

    return ss;
  }

}
