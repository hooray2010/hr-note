package pattern.lol.strategy;

import pattern.lol.model.hero.Hero;

/**
 * Created by hurui on 2017/6/27.
 */
public abstract class Strategy {

  protected Hero top;
  protected Hero jungle;
  protected Hero mid;
  protected Hero ad;
  protected Hero support;

  public abstract Strategy chooseHeroes() throws Exception;

  public void printStrategy() {
    System.out.println("阵容：");
    printHero(top);
    printHero(jungle);
    printHero(mid);
    printHero(ad);
    printHero(support);
  }

  public void printHero(Hero top) {
    System.out.println(top.getHeroName() + ":" + top.getdSS().ssName() + "+" + top.getfSS().ssName());
  }

  /*
  getter and setter
   */
  public Hero getTop() {
    return top;
  }

  public void setTop(Hero top) {
    this.top = top;
  }

  public Hero getJungle() {
    return jungle;
  }

  public void setJungle(Hero jungle) {
    this.jungle = jungle;
  }

  public Hero getMid() {
    return mid;
  }

  public void setMid(Hero mid) {
    this.mid = mid;
  }

  public Hero getAd() {
    return ad;
  }

  public void setAd(Hero ad) {
    this.ad = ad;
  }

  public Hero getSupport() {
    return support;
  }

  public void setSupport(Hero support) {
    this.support = support;
  }
}
