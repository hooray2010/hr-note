package lol;

import lol.factory.HeroFactory;
import lol.factory.SummonerSkillFactory;
import lol.model.HeroName;
import lol.model.SummonerSkillName;
import lol.model.hero.Hero;
import lol.model.skill.SummonerSkill;
import lol.model.team.EdgTeam;
import lol.model.team.SamsungEdgTeam;
import lol.model.team.SktTeam;
import lol.model.team.Team;
import lol.strategy.AttackStrategy;
import lol.strategy.Strategy;
import org.junit.Test;

/**
 * Created by hurui on 2017/6/27.
 */
public class LeagueClient {

  public static void main(String[] args) throws Exception {
    //selectHero();
    //selectLineup();
  }

  /**
   * 选择阵容 —— 策略模式
   *
   * @throws Exception
   */
  @Test
  public void selectStrategy() throws Exception {
//    Strategy attackStrategy = new AttackStrategy();
//    attackStrategy.chooseHeroes();
//
//    System.out.println("——————————");
//
//    Strategy defendStrategy = new DefendStrategy();
//    defendStrategy.chooseHeroes();


//    StrategyExecutor strategyExecutor = new StrategyExecutor(new AttackStrategy());
//    strategyExecutor.executeStrategy();

    Strategy strategy = new AttackStrategy();

    Team skt = new SktTeam();
    skt.selectStrategy(strategy);
    skt.adjustStrategy();
    skt.executeStrategy();

    Team edg = new EdgTeam();
    edg.selectStrategy(strategy);
    edg.adjustStrategy();
    edg.executeStrategy();

    Team samsungEdg = new SamsungEdgTeam(edg);
    samsungEdg.adjustStrategy();
    samsungEdg.executeStrategy();
  }

  /**
   * 选择英雄 —— 工厂模式
   * 召唤师技能 —— 策略模式
   *
   * @throws Exception
   */
  @Test
  public void selectHero() throws Exception {
    SummonerSkill dSS = SummonerSkillFactory.getSkillSS(SummonerSkillName.FLASH);
    SummonerSkill fSS = SummonerSkillFactory.getSkillSS(SummonerSkillName.IGNITE);

    Hero fizz = HeroFactory.getHero(HeroName.FIZZ, dSS, fSS);
    fizz.q();
    fizz.w();
    fizz.e();
    fizz.r();
    fizz.d();
    fizz.f();

    System.out.println("——————————");

    Hero jax = HeroFactory.getHero(HeroName.JAX, dSS, fSS);
    jax.q();
    jax.w();
    jax.e();
    jax.r();
    jax.d();
    jax.f();
  }

}
