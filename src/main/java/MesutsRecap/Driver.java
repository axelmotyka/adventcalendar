package MesutsRecap;

public class Driver {

  // Class variables: Hier deklariere ich meine Variablen, die ich innerhalb meiner Klasse verweden werde.
  private String firstname; // returns firstname as String.
  private String lastname; // returns lastname as String.
  private int startingNumber; // returns the starting number as an int.
  private String driverText; // generates a String like '(1) Joe Cewl'.

  // Constructor of the class Driver: Dies ist der Konstruktor dieser Klasse, um damit Instanzen von Objekten dieser Klasse zu erzeugen.
  // Damit werden Driver/Fahrer generiert.
  // MERKE: Constructor haben immer die Namen der Klasse! Hier ist der Name des Constructors "Driver".
  public Driver(String firstname, String lastname, int startingNumber) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.startingNumber = startingNumber;
    this.driverText = "(" + startingNumber + ") " + firstname + " " + lastname;
  }

  // Getter method for the firstname: Hiermit kann man auf die private VAR firstname zugreifen.
  // Sinn: Man soll nicht von außerhalb dieser Klasse direkt auf interne VAR zugreifen.
  // Im folgenden die Getter methods für die anderen VAR.
  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public int getStartingNumber() {
    return startingNumber;
  }

  public String getDriverText() {
    return driverText;
  }

  /** @Override annotation:
   * Indicates that a method declaration is intended to override a method declaration in a supertype.
   * Also: Mit @Override überschreibt man die Methode toString und veranlasst, dass ein eigens formulierter String
   * ausgegeben wird.*/
  @Override
  public String toString() {
    return driverText;
  }

  // Note: Die main-Methode ist zum einfachen ausprobieren des Codes eingefügt worden.
  public static void main(String[] args) {
    Driver myFirstDriver = new Driver("Super", "Mario", 4);
    System.out.println(myFirstDriver);
    System.out.println("(" + myFirstDriver.startingNumber + ")");
    System.out.println(myFirstDriver.firstname + " " + myFirstDriver.lastname);
  }
}
