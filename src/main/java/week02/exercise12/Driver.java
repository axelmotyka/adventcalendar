package week02.exercise12;

/*
1. Define Class `Driver` with following methods:
    * _Constructor_ => All needed attributes
    * _getName()_ => returns Lastname, Firstname as String
    * _getStartingNumber()_ => returns the starting number as an int
    * _toString()_ => generates a String like '(1) Joe Cewl'
 */
public class Driver {
  // Declaration of variables, which will be used in this class definition:
  private String name; // returns Lastname, Firstname as String
  private int startingNumber; // returns the starting number as an int
  private String driverText; // generates a String like '(1) Joe Cewl'

  // This is a parameterized constructor "Driver" with two arguments (parameters).
  Driver(String name, int startingNumber) {
    this.name = name;
    this.startingNumber = startingNumber;
    this.driverText = "(" + startingNumber + ") " + name;
  }

  public String getName() {
    return name;
  }

  public int getStartingNumber() {
    return startingNumber;
  }

  @Override
  public String toString() {
    return driverText;
  }


}
