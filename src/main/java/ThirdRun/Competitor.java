package ThirdRun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

// This class allows to generate an object competitor storing the assignment of the derived classes of "Vehicle" and "Driver"

public class Competitor {

  // VARIABLES
  private Driver driver;
  private Vehicle vehicle;
  private int points;
  private int uniqueID;

  // CONSTRUCTOR
  public Competitor(Driver driver, Vehicle vehicle, int points, int uniqueID) {
    this.driver = driver;
    this.vehicle = vehicle;
    this.points = points;
    this.uniqueID = uniqueID;
  }

  // GETTER METHODS
  // Getter method for the VAR driver of type Driver.
  // Gets an object from the class Driver (includes all VARs from Driver, e.g. firstname, lastname, starting number ...
  public Driver getDriver() {
    return driver;
  }

  // Getter method for the VAR vehicle of type Vehicle.
  // Gets an object from the class Vehicle (includes all VARs from Vehicle, e.g. manufacturer, model, engine type ...
  public Vehicle getVehicle() {
    return vehicle;
  }

  // Getter method for the VAR points of type int.
  // Returns the actual points as int.
  public int getPoints() {
    return points;
  }

  // SETTER METHODS
  // Setter Method for VAR points which contains points status. Add's points from a race to the VAR points of a competitor.
  public void setPoints(int points) {
    this.points += points;
  }

  // OVERRIDE EQUALS AND HASH-CODE
  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null || getClass() != other.getClass()) return false;
    Competitor that = (Competitor) other;
    return uniqueID == that.uniqueID;
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueID);
  }

  // OVERRIDE TO-STRING
  @Override
  public String toString() {
    return "" + points + " - " + driver.getFirstName() + " " + driver.getLastName() ;
  }
}


/*
### Exercise 13 - Racing game competitors

 Generate a CompetitorsList which holds a Competitor with a Driver and Vehicle.

  1. Create class `CompetitorsGenerator`, which randomly generates drivers and related vehicles as a `Competitor`.
  2. Create class `Competitor` storing the assigment of the derived classes of `Vehicle` and `Driver` with:
     * _getPoints()_ => returns the actual points as int
     * _addPoints(int)_ => add's points from a race
  3. Create class `CompetitorsList` storing `Competitor`:
     * _addCompetitor(Competitor competitor)_
     * _getCompetitors()_ => which returns a list of `Competitor`
     * _toString()_ => method, which concatenate the contained toString() methods. This will generate a String like '[Points] [Driver] [Vehicle]'
  4. Add useful unit tests
  5. Visualize created classes with plantuml as class diagram, inclusive associations.
 */