package refactoring.chapter_3.optimized;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hurui on 2018/5/6.
 */
public class Customer {

  private String name;
  private List<Rental> rentals = new ArrayList<>();

  public Customer(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void addRental(Rental rental) {
    rentals.add(rental);
  }

  public String statement() {

    StringBuilder result = new StringBuilder("Rental Record for").append(getName()).append("\n");

    // amounts for each line
    for (Rental each : rentals) {
      // show figures for this rental
      result.append("\t").append(each.getMovie().getTitle())
              .append("\t").append(each.getCharge()).append("\n");
    }

    // add footer lines
    result.append("Amount owed is ").append(getTotalCharge()).append("\n")
            .append("Your earned ").append(getTotalFrequentRenterPoints()).append(" frequent renter points");

    return result.toString();
  }

  private double getTotalCharge() {
    double result = 0;
    for (Rental each : rentals) {
      result += each.getCharge();
    }
    return result;
  }

  private int getTotalFrequentRenterPoints() {
    int result = 0;
    for (Rental each : rentals) {
      result += each.getFrequentRenterPoints();
    }
    return result;
  }

}
