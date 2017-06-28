package lol.model.team;

import lol.model.hero.ViktorHero;
import lol.model.skill.FlashSS;
import lol.model.skill.IgniteSS;

/**
 * Created by hurui on 2017/6/28.
 */
public class SamsungEdgTeam extends Team {

  private Team team;

  public SamsungEdgTeam(Team team) {
    this.team = team;
  }

  @Override
  public void adjustStrategy() throws Exception {
    team.adjustStrategy();
    team.strategy.setMid(new ViktorHero(new FlashSS(), new IgniteSS()));
  }

  @Override
  public void executeStrategy() {
    team.strategy.printStrategy();
  }
}
