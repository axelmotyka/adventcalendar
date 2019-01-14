package MesutsRecap;

import MesutsRecap.Vehicle.EngineType;
import com.sun.xml.internal.ws.api.pipe.Engine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

// Diese Klasse bietet die Möglichkeit einen Wettbewerber zu generieren mit:
// Vorname, Nachname, Hersteller des Fahrzeugs und Fahrzeugmodell.
public class CompetitorsGenerator {

  // Class variables:
  private int startingNumber;
  private List<String> drivers; // Liste mit allen Wettbewerbern.
  private List<String> vehicles; // Liste mit allen Fahrzeugen.

  // Getter method vom Typ Driver:
  // get(int index): Returns the element at the specified position in this list.
  private Driver getRandomDriver() {
    List<String> driverNamesFirst = Arrays.asList("Super", "Funny", "Amazing", "Yoshi", "Don", "Bad", "Wopper", "Tiny");
    List<String> driverNamesLast = Arrays.asList("Mario", "Luigi", "Peach", "Abayashi", "Toad", "Bowser", "Wario", "Daisy");
    Random rand = new Random();
    String randomDriverNameFirst = driverNamesFirst.get(rand.nextInt(driverNamesFirst.size()));
    String randomDriverNameLast = driverNamesLast.get(rand.nextInt(driverNamesLast.size()));
    startingNumber++;

    return new Driver(randomDriverNameFirst, randomDriverNameLast, startingNumber);
  }

  // Getter method vom Typ Vehicle:
  // get(int index): Returns the element at the specified position in this list.
  private Vehicle getRandomVehicle() {
    List<String> manufacturer = Arrays.asList("Dodge", "Ford", "Plymouth", "Chevrolet");
    List<String> name = Arrays.asList("Challenger", "Mustang", "RoadRunner", "Camaro");
    List<Integer> horsepower = Arrays.asList(340, 400, 323, 395);

    /** Notizen:
     * List<String>: Interface?
     * Arrays.asList(): Einen Array als Liste ausgeben. Warum?
     * Ein "Array" ist eine statische Liste, für die bei der Definition angegeben wird, wieviel Speicherplatz
     * benötigt wird. Listen hingegen sind dynamisch und können sich ändern.
     * Mit Arrays.asList() wird ein statisches Array zu einer dynamischen Liste gemacht. Richtig?
     *
     */

    // Nachfolgend dasselbe wie oben: List<String> name = Arrays.asList( ... )
    //    ArrayList<String> name = new ArrayList<>();
    //    name.add("Challenger");
    //    name.add("Mustang");
    //    name.add("RoadRunner");
    //    name.add("Camaro");
    //    name.

    Random rand = new Random();
    String randomManufacturer = manufacturer.get(rand.nextInt(manufacturer.size()));
    String randomName = name.get(rand.nextInt((name.size())));
    Integer randomHorsepower = horsepower.get(rand.nextInt(horsepower.size()));

    int randomEngineType = rand.nextInt(3);
    EngineType type;
    if (randomEngineType == 1) {
      type = EngineType.diesel;
    } else if (randomEngineType == 2) {
      type = EngineType.gasoline;
    } else {
      type = EngineType.electric;
    }

    return new Vehicle(randomManufacturer, randomName, randomHorsepower, type);
  }

  public Competitor getRandomCompetitor() {
    Driver driver = getRandomDriver();
    Vehicle vehicle = getRandomVehicle();

    return new Competitor(driver, vehicle);
  }

  // Die main-Methode zu Testzwecken. Daher nicht weiter beachten, evtl. später auskommentieren.
  public static void main(String[] args) {
    CompetitorsGenerator cg = new CompetitorsGenerator();
    System.out.println(cg.getRandomDriver());
    System.out.println(cg.getRandomVehicle());
  }
}
