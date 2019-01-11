package week02.exercise16;

/*2. Define Class `Vehicle` with following  methods:
        * _Constructor_ => All needed attributes
        * _getManufacturer()_ - returns the manufacturer like 'Skoda' as String
        * _getName()_ - returns the vehicle name like 'Fabia' as String
        * _getHorsepower()_ - returns the engines horsepower as int
        * _getEngineType_ - returns one of `[electric, diesel, gasoline]` as an Enum
        * _toString()_ - returns the vehicle as String like 'Skoda Fabia, gasoline, 25hps'
*/

public class Vehicle {
  public enum EngineType {
    electric,
    diesel,
    gasoline
    ;
  }

  // Declaration of variables, which will be used in this class definition:
  protected String manufacturer; // returns the manufacturer like 'Skoda' as String
  protected String name; // returns the vehicle name like 'Fabia' as String
  protected int horsepower; // returns the engines horsepower as int
  protected EngineType engineType; // returns one of `[electric, diesel, gasoline]` as an Enum

  //String vehicleText = manufacturer + vehicleName + ", " + engineType + horsepower + "hps"; // returns the vehicle as String like 'Skoda Fabia, gasoline, 25hps'


  // This is a parameterized constructor "Vehicle" with four arguments (parameters).
  Vehicle(String manufacturer, String name, int horsepower, EngineType engineType){
    this.manufacturer = manufacturer;
    this.name = name;
    this.horsepower = horsepower;
    this.engineType = engineType;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public String getName() {
    return name;
  }

  public int getHorsepower() {
    return horsepower;
  }

  public EngineType getEngineType() {
    return engineType;
  }

  @Override
  public String toString() {
    // returns the vehicle as String like 'Skoda Fabia, gasoline, 25hps'
    return manufacturer + " " + name + ", " + engineType + ", " + horsepower + "hps";
  }


  public static void main(String[] args) {
    Vehicle skodaFabia = new Vehicle("Skoda", "Fabia", 25, EngineType.gasoline);
    System.out.println(skodaFabia);
    Vehicle skodaFabia1 = new Vehicle("Skoda", "Fabia", 25, EngineType.diesel);
    System.out.println(skodaFabia1);


  }
}


