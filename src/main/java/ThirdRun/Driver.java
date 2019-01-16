package ThirdRun;

public class Driver {

  // VARIABLES
  private String firstName;
  private String lastName;
  private int startingNumber;
  private String driverText;

  // GETTER METHODS
  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getName() {
    return getFirstName() + " " + getLastName();
  }

  public int getStartingNumber() {
    startingNumber++;
    return startingNumber;
  }

  // CONSTRUCTOR
  public Driver(String firstName, String lastName, int startingNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.startingNumber = 0;
    this.driverText = "(" + getStartingNumber() + ")" + " " + getFirstName() + " " + getLastName();
  }


  @Override
  public String toString() {
    return driverText;
  }
}




/*
Implement basic class lineup.

 1. Define Class `Driver` with following methods: (DONE)
    * _Constructor_ => All needed attributes
    * _getName()_ => returns Lastname, Firstname as String
    * _getStartingNumber()_ => returns the starting number as an int
    * _toString()_ => generates a String like '(1) Joe Cewl'
 2. Define Class `Vehicle` with following  methods:
    * _Constructor_ => All needed attributes
    * _getManufacturer()_ - returns the manufacturer like 'Skoda' as String
    * _getName()_ - returns the vehicle name like 'Fabia' as String
    * _getHorsepower()_ - returns the engines horsepower as int
    * _getEngineType_ - returns one of `[electric, diesel, gasoline]` as an Enum
    * _toString()_ - returns the vehicle as String like 'Skoda Fabia, gasoline, 25hps'
 3. Add useful unit tests
 4. Visualize created classes with plantuml as class diagram, inclusive associations.
*/

