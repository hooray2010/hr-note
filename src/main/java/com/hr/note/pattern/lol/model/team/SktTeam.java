package com.hr.note.pattern.lol.model.team;

import com.hr.note.pattern.lol.model.hero.Hero;

/**
 * Created by hurui on 2017/6/28.
 */
public class SktTeam extends Team {

  @Override
  public void adjustStrategy() throws Exception {
    Hero temp = strategy.getTop();
    strategy.setTop(strategy.getJungle());
    strategy.setJungle(temp);
  }

}
