package main.java.lol;

import main.java.lol.hero.FizzHero;
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
    
    //Hero fizz = lolFactory.getHero("Fizz", flash, teleport);
    FizzHero fizzHero = new FizzHero(flash, teleport);
    
    System.out.println("1231231");
  }
  
}
