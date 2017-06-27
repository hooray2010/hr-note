package lol.skill;

/**
 * Created by hurui on 2017/6/27.
 */
public class IgniteSS implements SummonerSkill {

  private static final String name = "引燃";

  @Override
  public String ssName() {
    return name;
  }

  @Override
  public void releaseSS() {
    System.out.println("引燃");
  }

}
