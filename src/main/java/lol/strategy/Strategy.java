package lol.strategy;

import lol.factory.HeroFactory;
import lol.factory.SummonerSkillFactory;

/**
 * Created by hurui on 2017/6/27.
 */
public interface Strategy {

  HeroFactory heroFactory = new HeroFactory();
  SummonerSkillFactory ssFactory = new SummonerSkillFactory();

  void chooseHeroes() throws Exception;

}
