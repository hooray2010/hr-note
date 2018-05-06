package refactoring.chapter_3.origin;

/**
 * Created by hurui on 2018/4/25.
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

}
