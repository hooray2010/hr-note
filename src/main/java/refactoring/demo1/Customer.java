package refactoring.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hurui on 2018/4/25.
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

    double totalAmount = 0;
    int frequentRenterPoints = 0;

    // amounts for each line
    for (Rental each : rentals) {
      double thisAmount = 0;
      switch (each.getMovie().getPriceCode()) {
        case Movie.REGULAR:
          thisAmount += 2;
          if (each.getDaysRented() > 2) {
            thisAmount += (each.getDaysRented() - 2) * 1.5;
          }
          break;
        case Movie.NEW_RELEASE:
          thisAmount += each.getDaysRented() * 3;
          break;
        case Movie.CHILDRENS:
          thisAmount += 1.5;
          if (each.getDaysRented() > 3) {
            thisAmount += (each.getDaysRented() - 3) * 1.5;
          }
          break;
      }

      // add frequent enter points
      frequentRenterPoints++;
      // add bonus for a two day new release rental
      if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1) {
        frequentRenterPoints++;
      }

      // show figures for this rental
      result.append("\t").append(each.getMovie().getTitle())
              .append("\t").append(thisAmount).append("\n");

      totalAmount += thisAmount;
    }

    // add footer lines
    result.append("Amount owed is ").append(totalAmount).append("\n")
            .append("Your earned ").append(frequentRenterPoints).append(" frequent renter points");

    return result.toString();
  }

}
