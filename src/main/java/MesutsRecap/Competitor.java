package MesutsRecap;

public class Competitor {

  // Class variables
  private Driver driver;
  private Vehicle vehicle;
  private int points;

  // Constructor
  public Competitor(Driver driver, Vehicle vehicle) {
    this.driver = driver;
    this.vehicle = vehicle;
    this.points = 0;
  }

  // Getter method for the VAR driver. Liefert den Inhalt der VAR "driver" vom Typ/Klasse "Driver".
  public Driver getDriver() {
    return driver;
  }

  // Getter method for the VAR vehicle. Liefert den Inhalt der VAR "vehicle" vom Typ/Klasse "Vehicle".
  public Vehicle getVehicle() {
    return vehicle;
  }

  // Getter method for the VAR points. Returns the actual points as int.
  public int getPoints() {
    return points;
  }

  // Setter method for the VAR points. Add's points from a race.
  // Beim Aufrufen dieser setter-Methode wird eine bestimmte Punktzahl als Parameterwert reingegeben, welcher mit dem
  // aktuellen Wert der den Wert VAR points addiert werden soll. Danach ist die VAR Points aktualisiert.
  public void setPoints(int points) {
    this.points += points;
  }

  @Override
  public String toString() {
    //[Points] [Driver] [Vehicle]
    return "" + points + " " + driver.getFirstname() + " " + driver.getLastname() + " (" + driver.getStartingNumber() + ") " + vehicle.getName();
  }

  // Die main-Methode zu Testzwecken. Daher nicht weiter beachten, evtl. später auskommentieren.
  public static void main(String[] args){
    Driver d = new Driver("First", "Last", 4);
    Vehicle h = new Vehicle("Manu", "Name", 755, Vehicle.EngineType.gasoline);
    Competitor competitor = new Competitor(d, h);
    System.out.println(competitor);
  }
}
