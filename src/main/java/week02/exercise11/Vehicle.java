package week02.exercise11;


public class Vehicle {
  public enum EngineType {
    electric,
    diesel,
    gasoline
    ;
  }


  // Declaration of variables, which will be used in this class definition:
  private String manufacturer; // returns the manufacturer like 'Skoda' as String
  private String name; // returns the vehicle name like 'Fabia' as String
  private int horsepower; // returns the engines horsepower as int
  private EngineType engineType; // returns one of `[electric, diesel, gasoline]` as an Enum

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
    //System.out.println(skodaFabia.getHorsepower());
  }
}


