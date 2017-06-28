package lol.model.skill;

/**
 * Created by hurui on 2017/6/27.
 */
public class ReviveSS implements SummonerSkill {

  private static final String name = "惩戒";

  @Override
  public String ssName() {
    return name;
  }

  @Override
  public void releaseSS() {
    System.out.println("惩戒");
  }

}
