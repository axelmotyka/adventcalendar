package week02.exercise11;

public class Driver {

  // Declaration of variables, which will be used in this class definition as features of the class "Driver":
  private String name; // returns Lastname, Firstname as String
  private int startingNumber; // returns the starting number as an int
  private String driverText; // generates a String like '(1) Joe Cewl'

  // This is a parameterized constructor with two parameters (arguments). The constructors name is "Driver".
  // The arguments will be assigned to the private variables of this class (declaration is above).
  Driver(String name, int startingNumber) {
    this.name = name;
    this.startingNumber = startingNumber;
    this.driverText = "(" + startingNumber + ") " + name;
  }

  // Getter-method.
  public String getName() {
    return name;
  }

  public int getStartingNumber() {
    return startingNumber;
  }

  // "@Override" overrides the "toString" method below, so that it returns a specific value, here: driverText.
  @Override
  public String toString() {
    return driverText;
  }

  // Main method - the starting point from this program.
  public static void main(String[] args) {
    Driver nikiLauda = new Driver("Niki Lauda", 1);
    System.out.println(nikiLauda);


  }
}

/* Zugriffsmodifizierer private:
 * private ist der restriktivste Zugriffsmodifizierer. Er verbietet jeglichen Zugriff von außerhalb der Klasse
 * auf den entsprechend modifizierten Member. Auf eine private Variable kann nur die Klasse selbst zugreifen, ebenso
 * auf einen privaten Konstruktor, eine private Methode oder einen privaten geschachtelten Datentyp.
 */

/* Getter-method:
 * We define a getter-method in order to access the values of variables within a class and to avoid,
 * that variables within a class will be accessed directly.
 * The access modifier of the getter-method "getName" is public, so it can be accessed from outside the class "Driver".
 * Therefore we can access the value of the private variable "name" from outside this class, from other program parts.
 */
