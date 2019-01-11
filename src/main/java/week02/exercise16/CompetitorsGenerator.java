package week02.exercise16;

    /*
    * 1. Create class `CompetitorsGenerator`, which randomly generates drivers and related vehicles as a `Competitor`.
    */

    /*
    ??? Tabelle mit allen existierenden Fahrern und Fahrzeugen notwendig? Hier generieren?
    Erst dann:
    1) Funktion, um zufällig einen Fahrer auszuwählen.
    2) Funktion, um zufällig ein Fahrzeug auszuwählen.
    3) Zusammenführen eines zufälligen Fahrers mit einem zufälligen Fahrzeug, der Reihe nach.
    4) Return zufällig generierte Competitors.
     */

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CompetitorsGenerator {
  private static int startingNumber = 0;

  private Driver getRandomDriver() {
    List<String> driverNames = Arrays.asList("Niki", "Michael", "Louis", "Peter", "Harald", "Gaby", "Petra", "Hans");
    Random rand = new Random(5);
    String randomDriverName = driverNames.get(rand.nextInt(driverNames.size()));
    startingNumber++;
    return new Driver(randomDriverName, startingNumber);
  }


  private Vehicle getRandomVehicle() {
    List<String> manufacturerNames = Arrays.asList("Skoda", "Ford", "Fiat", "Mercedes", "Porsche", "Audi", "Dodge");
    List<String> modelNames = Arrays.asList("Fabia", "Golf", "Benz", "Panzer", "Rennwagen", "Tolles Auto", "Passat", "Picasso");
    Random rand = new Random(5);
    String randomManufacturerName = manufacturerNames.get(rand.nextInt(manufacturerNames.size()));
    String randomModelName = modelNames.get(rand.nextInt(modelNames.size()));

    int randomHorsePower = rand.nextInt(50);
    int randomEngineType = rand.nextInt(3);
    Vehicle.EngineType type ;
    if (randomEngineType == 0) {
      type = Vehicle.EngineType.gasoline;
    } else if (randomEngineType == 1) {
      type = Vehicle.EngineType.diesel;
    } else {
      type = Vehicle.EngineType.electric;
    }

    return new Vehicle(randomManufacturerName, randomModelName, randomHorsePower, type);
  }


  public Competitor getRandomCompetitor() {
    Driver driver = getRandomDriver();
    Vehicle vehicle = getRandomVehicle();

    return new Competitor(driver, vehicle);
  }

}
