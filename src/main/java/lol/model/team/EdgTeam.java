package lol.model.team;

import lol.model.skill.ExhaustSS;
import lol.model.skill.TeleportSS;

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
