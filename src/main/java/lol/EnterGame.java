package lol;

import lol.factory.HeroFactory;
import lol.factory.SummonerSkillFactory;
import lol.model.hero.Hero;
import lol.model.skill.SummonerSkill;
import lol.strategy.AttackStrategy;
import lol.strategy.StrategyExecutor;
import org.junit.Test;

/**
 * Created by hurui on 2017/6/27.
 */
public class EnterGame {
  
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
    
    StrategyExecutor strategyExecutor = new StrategyExecutor(new AttackStrategy());
    strategyExecutor.executeStrategy();
  }
  
  /**
   * 选择英雄 —— 工厂模式
   * 召唤师技能 —— 策略模式
   *
   * @throws Exception
   */
  @Test
  public void selectHero() throws Exception {
    SummonerSkill dSS = SummonerSkillFactory.getSkillSS("Flash");
    SummonerSkill fSS = SummonerSkillFactory.getSkillSS("Teleport");
    
    Hero fizz = HeroFactory.getHero("Fizz", dSS, fSS);
    fizz.q();
    fizz.w();
    fizz.e();
    fizz.r();
    fizz.d();
    fizz.f();
    
    System.out.println("——————————");
    
    Hero jax = HeroFactory.getHero("Jax", dSS, fSS);
    jax.q();
    jax.w();
    jax.e();
    jax.r();
    jax.d();
    jax.f();
  }
  
}
