package main.java.lol.hero;

import main.java.lol.skill.SummonerSkill;

/**
 * Created by hurui on 2017/6/27.
 */
public abstract class Hero {
  
  public SummonerSkill dSS;
  public SummonerSkill fSS;
  
  public Hero(SummonerSkill d, SummonerSkill f) {
    dSS = d;
    fSS = f;
  }
  
  public abstract void q();
  
  public abstract void w();
  
  public abstract void e();
  
  public abstract void r();
  
  public void d() {
    dSS.releaseSS();
  }
  
  public void f() {
    fSS.releaseSS();
  }
  
  public void farm() {
    System.out.println("Gold + 30");
  }
  
}
