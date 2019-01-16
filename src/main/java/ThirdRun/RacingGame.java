package ThirdRun;

public class RacingGame {

  public static void main(String[] args) {

    Driver firstDriver = new Driver("Steve", "McQueen", 4);
    System.out.println(firstDriver);

    Driver secondDriver = new Driver("Michael", "Schumacher", 1);
    System.out.println(secondDriver);

    Vehicle firstVehicle = new Vehicle("Porsche", "Carrera GT4", 451, Vehicle.EngineType.gasoline);
    System.out.println(firstVehicle);

    Vehicle secondVehicle = new Vehicle("Dodge", "Challenger", 420, Vehicle.EngineType.diesel);
    System.out.println(secondVehicle);
  }

}
