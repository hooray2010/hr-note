package main.java.lol;

import main.java.lol.factory.HeroFactory;
import main.java.lol.factory.SummonerSkillFactory;
import main.java.lol.hero.Hero;
import main.java.lol.skill.SummonerSkill;

/**
 * Created by hurui on 2017/6/27.
 */
public class EnterGame {
  
  private static final HeroFactory heroFactory = new HeroFactory();
  private static final SummonerSkillFactory ssFactory = new SummonerSkillFactory();
  
  public static void main(String[] args) throws Exception {
    
    SummonerSkill dSS = ssFactory.getSkillSS("Flash");
    SummonerSkill fSS = ssFactory.getSkillSS("Teleport");
    
    //简单工厂模式 —— 创建英雄
    //召唤师技能 —— 策略模式
    Hero fizz = heroFactory.getHero("Fizz", dSS, fSS);
    fizz.q();
    fizz.w();
    fizz.e();
    fizz.r();
    fizz.d();
    fizz.f();
    
    Hero jax = heroFactory.getHero("Jax", dSS, fSS);
    jax.q();
    jax.w();
    jax.e();
    jax.r();
    jax.d();
    jax.f();
  }
  
}
