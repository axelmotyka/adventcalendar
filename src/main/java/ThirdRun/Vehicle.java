package ThirdRun;

public class Vehicle {

  // VARIABLES
  private String manufacturer;
  private String model;
  private int horsepower;
  private EngineType engineType;
  private String vehicleText;

  public enum EngineType { // FRAGE: Definiere ich hier eine eigenes spezielles Objekt vom Typ enum?
    electric,
    diesel,
    gasoline;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public String getModel() {
    return model;
  }

  public int getHorsepower() {
    return horsepower;
  }

  public EngineType getEngineType() {
    return engineType;
  }

  public String getVehicleText() {
    vehicleText = getManufacturer() + " " + getModel() + ", " + getEngineType() + " " + getHorsepower();
    return vehicleText;
  }

  // CONSTRUCTOR
  public Vehicle(String manufacturer, String modelname, int horsepower, EngineType engineType) {
    this.manufacturer = manufacturer;
    this.model = modelname;
    this.horsepower = horsepower;
    this.engineType = engineType;
  }

  @Override
  public String toString(){
    return getVehicleText();
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
