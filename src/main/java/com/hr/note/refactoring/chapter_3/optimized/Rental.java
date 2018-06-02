package com.hr.note.refactoring.chapter_3.optimized;


/**
 * Created by hurui on 2018/5/6.
 */
public class Rental {

  private Movie movie;

  private int daysRented;

  public Rental(Movie movie, int daysRented) {
    this.movie = movie;
    this.daysRented = daysRented;
  }

  public Movie getMovie() {
    return movie;
  }

  public int getDaysRented() {
    return daysRented;
  }

  double getCharge() {
    return movie.getCharge(daysRented);
  }

  int getFrequentRenterPoints() {
    return movie.getFrequentRenterPoints(daysRented);
  }

}
