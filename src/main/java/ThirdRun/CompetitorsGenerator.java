package ThirdRun;

// With the class `CompetitorsGenerator` we can randomly generate drivers (with firstname, last name) and
// related vehicles (with manufacturer and model) as a `Competitor`.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CompetitorsGenerator {

  // VARIABLES
  private static int startingNumber=0; // VAR mit statischem Initialwert.

  // CONSTRUCTOR


  // METHODS

  // (1) Getter method for the VAR getRandomDrivers of type Driver:
  // get(int index): Returns the element at the specified position in this list.
  private Driver getRandomDriver() {
    // What is this? Array, List, Arrays.asList, Interface
    //
    List<String> driverFirstnames = Arrays.asList("Michael", "Niki", "Fernando", "Lewis", "Alain");
    List<String> driverLastnames = Arrays.asList("Schumacher", "Lauda", "Alonso", "Hamilton", "Prost");

    // Generate a Random object in order to use it for random operations.
    Random rand = new Random();

    // Select randomly a firstname for a driver:
    // Take the list driverFirstnames and choose a firstname with get(int index)-method. Pass to the get()-method
    // as an index a randomly selected number from the size of the list. Store the returned result in a string VAR.
    String randomDriverFirstname = driverFirstnames.get(rand.nextInt(driverFirstnames.size()));

    // Select randomly a lastname for a driver: see above!
    String randomDriverLastname = driverLastnames.get(rand.nextInt(driverLastnames.size()));

    startingNumber++;

    // As return statement pass all three randomly choosen elements as parameter values to the Constructor "Driver".
    // This constructor returns an object from typ Driver with the given values.
    // Becuse a new Driver object will be generated, we need the new-operator.
    return new Driver(randomDriverFirstname, randomDriverLastname, startingNumber);
  }

  // (2) Getter method for the VAR getRandomVehicle of type Vehicle:
  private Vehicle getRandomVehicle() {
    // Define a list of manufacturer and models.
    List<String> manufacturer = Arrays.asList("Dodge", "Ford", "Porsche", "Mercedes");
    List<String> model = Arrays.asList("Challenger", "GT20", "CarreraGT4", "Silberpfeil");
    List<Integer> horsepower = Arrays.asList(379, 400, 323, 395);

    // Generate a Random object "rand" in order to use it for random operations.
    Random rand = new Random();

    // Select randomly a manufacturer for a Vehicle object:
    // Take the list "manufacturer" and choose a manufacturer with get(int index)-method. Pass to the get()-method
    // as an index a randomly selected number from the size of the list. Store the returned result in a string VAR.
    String randomManufacturer = manufacturer.get(rand.nextInt(manufacturer.size()));

    // Select randomly a model for a Vehicle object: see above!
    String randomModel = model.get(rand.nextInt(model.size()));

    // Select randomly a horsepower for a Vehicle object: see above!
    Integer randomHorsepower = horsepower.get(rand.nextInt(horsepower.size()));

    // Select randomly the engine type for a Vehicle object!
    // Because the engine type is an enum, we use this code:
    int randomEngineType = rand.nextInt(3); // The amount of alternatives in the enum engine type.
    Vehicle.EngineType type; // Declare a VAR from tpye EngineType.
    if (randomEngineType == 1){
      type = Vehicle.EngineType.diesel;
    } else if (randomEngineType ==2){
      type = Vehicle.EngineType.gasoline;
    } else {
      type = Vehicle.EngineType.electric;
    }

    //
    return new Vehicle(randomManufacturer, randomModel, randomHorsepower, type);
  }

  // (3) Getter method for competitor
  public Competitor getRandomCompetitor() {
    Driver driver = getRandomDriver();
    Vehicle vehicle = getRandomVehicle();
    int uniqueID = startingNumber;

    return new Competitor(driver, vehicle, 0, uniqueID);
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