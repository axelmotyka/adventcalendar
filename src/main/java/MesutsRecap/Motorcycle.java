package MesutsRecap;

public class Motorcycle extends Vehicle{

  public enum MotorcycleType {
    Allrounder,
    Chopper,
    Dirtbike,
    Custombike,
    Motocross,
    Enduro;
  }

  public enum ColorType {
    black,
    white,
    red,
    green,
    blue,
    magenta;
  }

  // Class variables (additional to Vehicle class):
  private ColorType color;
  private MotorcycleType type;

  // Constructor:
  public Motorcycle(String manufacturer, String name, int horsepower, EngineType engineType, ColorType color, MotorcycleType type) {
    super(manufacturer, name, horsepower, engineType);
    this.color = color;
    this.type = type;
  }

  public ColorType getColor() {
    return color;
  }

  public MotorcycleType getType() {
    return type;
  }

  @Override
  public String toString() {
    return getVehicleText() + " " + color + " " + type;
  }

  public static void main(String[] args) {
    Motorcycle myFirstMotorcycle = new Motorcycle("Kawasaki", "Defender II", 56, EngineType.gasoline, ColorType.black, MotorcycleType.Dirtbike);
    System.out.println(myFirstMotorcycle);
  }
}
