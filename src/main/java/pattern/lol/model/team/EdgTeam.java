package pattern.lol.model.team;

import pattern.lol.model.skill.ExhaustSS;
import pattern.lol.model.skill.TeleportSS;

/**
 * Created by hurui on 2017/6/28.
 */
public class EdgTeam extends Team {

  @Override
  public void adjustStrategy() throws Exception {
    strategy.getMid().setfSS(new TeleportSS());
    strategy.getSupport().setfSS(new ExhaustSS());
  }

}
