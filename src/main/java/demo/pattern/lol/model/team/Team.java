package demo.pattern.lol.model.team;

import demo.pattern.lol.strategy.Strategy;

/**
 * Created by hurui on 2017/6/28.
 */
public abstract class Team {

  protected Strategy strategy;

  public void selectStrategy(Strategy strategy) throws Exception {
    strategy.chooseHeroes();
    this.strategy = strategy;
  }

  public abstract void adjustStrategy() throws Exception;

  public void executeStrategy() {
    strategy.printStrategy();
  }
}
