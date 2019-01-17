package MesutsRecap;

public class RacingGame {


  public static void main(String[] args) {

    // Generate and show a driver!
    // myFirstDriver is an object from the class Driver. When myFirstDriver is printed out, Java will execute the toString() method.
    // And in the class Driver it is defined, that the toString() method prints out an individual text.
    Driver myFirstDriver = new Driver("Super", "Mario", 4);
    System.out.println(myFirstDriver);

    // Generate and show a vehicle!
    Vehicle myFirstVehicle = new Vehicle("Dodge", "Challenger", 498, Vehicle.EngineType.gasoline);
    System.out.println(myFirstVehicle);

    // Generate and show a tractor as a vehicle with inherited parameters (features)!
    Tractor myFirstTractor = new Tractor("New Holland", "Black Farmer", 69, Vehicle.EngineType.diesel, Tractor.TractorType.Robotics, Tractor.TractorSize.xlarge);
    System.out.println(myFirstTractor);

    // Generate and show a motorcycle as a vehicle with inherited parameters (features)!
    Motorcycle myFirstMotorcycle = new Motorcycle("Kawasaki", "Defender II", 56, Vehicle.EngineType.gasoline, Motorcycle.ColorType.black, Motorcycle.MotorcycleType.Dirtbike);
    System.out.println(myFirstMotorcycle);

    // Generate an object from class "CompetitorsGenerator" and name it "cg". Then print out some data from this object:
    // a random driver and a random vehicle.
    CompetitorsGenerator cg = new CompetitorsGenerator();
    System.out.println(cg.getRandomDriver());
    System.out.println(cg.getRandomVehicle());
    System.out.println(cg.getRandomCompetitor());

    // Generate a competitors list from class "CompetitorsList" and
    // add a random competitor from the CompetitorsGenerator object "cg", which has been generated above.
    CompetitorList newList = new CompetitorList();
    newList.addCompetitor(cg.getRandomCompetitor());
    newList.addCompetitor(cg.getRandomCompetitor());
    newList.addCompetitor(cg.getRandomCompetitor());
    newList.addCompetitor(cg.getRandomCompetitor());
    newList.addCompetitor(cg.getRandomCompetitor());
    newList.addCompetitor(cg.getRandomCompetitor());
    newList.addCompetitor(cg.getRandomCompetitor());
    newList.addCompetitor(cg.getRandomCompetitor());
    System.out.println(newList);

    // Generate a Race object
    // public Race(List<Competitor> competitors)
    //List       <Competitor>
    //Competitor List
    Race myRace = new Race(newList);
    System.out.println("Unsorted competitor/race list: ");
    System.out.println(myRace);

    System.out.println("");
    System.out.println("StartingLineUp: ");
    myRace.generateStartingLineup();
    System.out.println(myRace.getStartingLineUp());

    System.out.println("");
    System.out.println("Race Result: ");
    myRace.race();
    System.out.println(myRace.getResult());

  }
}
