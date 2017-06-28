package lol.model.hero;

import lol.model.skill.SummonerSkill;

/**
 * Created by hurui on 2017/6/27.
 */
public abstract class Hero implements HaveSS {
  
  protected String heroName;
  protected SummonerSkill dSS;
  protected SummonerSkill fSS;
  
  public Hero(String heroName, SummonerSkill d, SummonerSkill f) {
    this.heroName = heroName;
    this.dSS = d;
    this.fSS = f;
  }
  
  public String getHeroName() {
    return this.heroName;
  }
  
  public SummonerSkill getDSS() {
    return this.dSS;
  }
  
  public SummonerSkill getFSS() {
    return this.fSS;
  }
  
  /**
   * 基本技能：Q、W、E、R
   */
  public abstract void q();
  
  public abstract void w();
  
  public abstract void e();
  
  public abstract void r();
  
  /**
   * 召唤师技能D、F
   */
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
