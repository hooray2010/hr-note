package main.java.lol;

import main.java.lol.hero.Hero;
import main.java.lol.skill.FlashSS;
import main.java.lol.skill.SummonerSkill;
import main.java.lol.skill.TeleportSS;

/**
 * Created by hurui on 2017/6/27.
 */
public class EnterGame {
  
  private static final LolFactory lolFactory = new LolFactory();
  
  public static void main(String[] args) throws Exception {
    
    SummonerSkill flash = new FlashSS();
    SummonerSkill teleport = new TeleportSS();
    
    //简单工厂模式 —— 创建英雄
    //召唤师技能 —— 策略模式
    Hero fizz = lolFactory.getHero("Fizz", flash, teleport);
    //FizzHero fizzHero = new FizzHero(flash, teleport);
    fizz.d();
    fizz.f();
  }
  
}
