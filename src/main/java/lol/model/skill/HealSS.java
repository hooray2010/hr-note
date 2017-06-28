package lol.model.skill;

/**
 * Created by hurui on 2017/6/27.
 */
public class HealSS implements SummonerSkill {

  private static final String name = "治疗";

  @Override
  public String ssName() {
    return name;
  }

  @Override
  public void releaseSS() {
    System.out.println("治疗");
  }

}
