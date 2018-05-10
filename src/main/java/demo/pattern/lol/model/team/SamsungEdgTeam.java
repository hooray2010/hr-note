package demo.pattern.lol.model.team;

import demo.pattern.lol.model.hero.ViktorHero;
import demo.pattern.lol.model.skill.FlashSS;
import demo.pattern.lol.model.skill.IgniteSS;

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