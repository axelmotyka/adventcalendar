package week02.exercise13;

/*
  2. Create class `Competitor` storing the assigment of the derived classes of `Vehicle` and `Driver` with:
     * _getPoints()_ => returns the actual points as int
     * _addPoints(int)_ => add's points from a race
 */

public class Competitor {

  private Driver driver;
  private Vehicle vehicle;
  private int points;

  public Competitor(Driver driver, Vehicle vehicle) {
    this.driver = driver;
    this.vehicle = vehicle;
    this.points = 0;
  }

  public Driver getDriver() {
    return driver;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public int getPoints() {
    return points;
  }

  public void addPoints(int points) {
    this.points += points;
  }

  @Override
  public String toString() {
    //[Points] [Driver] [Vehicle]
    return "" + points + " " + driver.getName() + " (" + driver.getStartingNumber() + ") " + vehicle.getName();
  }
}
