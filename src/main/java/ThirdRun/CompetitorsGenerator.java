package ThirdRun;

// With the class `CompetitorsGenerator` we can randomly generate drivers (with firstname, last name) and
// related vehicles (with manufacturer and model) as a `Competitor`.

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CompetitorsGenerator {

  // VARIABLES
  private static int startingNumber=0; // VAR mit statischem Initialwert.
  private List<String> drivers; // VAR für eine Liste mit allen Wettbewerbern.
  private List<String> vehicles; // VAR für eine Liste mit allen Fahrzeugen.

  // CONSTRUCTOR


  // METHODS
  // Getter method for the VAR getRandomDrivers of type Driver:
  // get(int index): Returns the element at the specified position in this list.
  public Driver getRandomDrivers() {
    // What the fuck is this? Array, List, Arrays.asList
    List<String> driverFirstnames = Arrays.asList("Michael", "Niki", "Fernando", "Lewis", "Alain");
    List<String> driverLastnames = Arrays.asList("Schumacher", "Lauda", "Alonso", "Hamilton", "Prost");

    // Generates a Random object in order to use it for random operations.
    Random rand = new Random();

    // Select randomly a firstname for a driver:
    // Take the list driverFirstnames and choose a firstname with get(int index)-method. Pass to the get()-method
    // as an index a randomly selected number from the size of the list driverFirstnames.
    String randomDriverFirstname = driverFirstnames.get(rand.nextInt(driverFirstnames.size()));

    // Select randomly a lastname for a driver: see above!
    String randomDriverLastname = driverLastnames.get(rand.nextInt(driverLastnames.size()));

    startingNumber++;

    return new Driver(randomDriverFirstname, randomDriverLastname, startingNumber);
  }

  public List<String> getVehicles() {
    return vehicles;
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