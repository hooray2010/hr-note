package lol.strategy;

/**
 * Created by hurui on 2017/6/27.
 */
public class StrategyExecutor {

  private Strategy strategy;

  public StrategyExecutor(Strategy strategy) {
    this.strategy = strategy;
  }

  public void executeStrategy() throws Exception {
    strategy.chooseHeroes();
  }

}
