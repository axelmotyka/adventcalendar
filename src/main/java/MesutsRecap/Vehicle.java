package MesutsRecap;

public class Vehicle {

  // Declaration of an enum variable:
  // Java enums sind Variablentypen mit festgelegten Wertemöglichkeiten. Sie dienen der Lesbarkeit und
  // der logischen Struktur des Programmcodes. Mit enums (kurz für enumeration, zu deutsch: Aufzählung) bietet Java
  // die Möglichkeit, vordefinierte Konstanten für Variablen festzulegen. Dies ist besonders dann sinnvoll, wenn
  // eine Variable nur eine kleine Anzahl von benennbaren Zuständen hat.

  // "enum" ist ein Schlüsselwort um einen neuen Typ zu definieren. Die Syntax bei der Definition ist ähnlich wie
  // bei einer Klasse. enum-Klassen enthalten feste WErte, mit denen Objekte erzeugt werden können.
  // Es ist eine spezial Oberklasse. Ein Enum-Typ ist ein Aufzählungstypen von unveränderlichen Werten.
  public enum EngineType { // returns one of `[electric, diesel, gasoline]` as an Enum.
    electric,
    diesel,
    gasoline;
  }

  // Class variables:
  private String manufacturer; // returns the manufacturer like 'Dodge' as String.
  private String name; //returns the vehicle name like 'Charger' as String.
  private int horsepower; // returns the engines horsepower as int, e.g. 452hsp.
  private EngineType engineType;

  // Constructor of the class Vehicle: Bekommt Parameterwerte übergeben, die beim erzeugen benutzt werden.
  public Vehicle(String manufacturer, String name, int horsepower, EngineType engineType) {
    this.manufacturer = manufacturer;
    this.name = name;
    this.horsepower = horsepower;
    this.engineType = engineType; // Hier wird einer Klassenvariablen der Parameterwert zugewiesen, welcher beim Aufruf
    // dieses Constructors ihm übergeben wurde (EngineType engineType).
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

  public String getVehicleText() {
    return manufacturer + " " + name + ", " + engineType + ", " + horsepower + "hps";
  }

  /** @Override annotation:
   * Indicates that a method declaration is intended to override a method declaration in a supertype.
   * Also: Mit @Override überschreibt man die Methode toString und veranlasst, dass ein eigens formulierter String
   * ausgegeben wird.*/
  @Override
  public String toString() {
    return getVehicleText();
  }

  // Note: Die main-Methode ist zum einfachen ausprobieren des Codes eingefügt worden.
  public static void main(String[] args) {
    Vehicle myFirstVehicle = new Vehicle("Dodge", "Challenger", 498, EngineType.gasoline);
    System.out.println(myFirstVehicle);
  }

}
