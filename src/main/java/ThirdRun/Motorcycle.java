package ThirdRun;

public class Motorcycle extends Vehicle {

  // NEW DATATYPES
  public enum MotorcycleType {
    Allrounder, Chopper, Enduro, Dirtbike, Caferacer, Racer;
  }

  public enum MotorcycleColor {
    black, white, red, green, blue, yellow, orange, grey, pink, metallic, bubblegum, dirty;
  }

  // VARIABLES
  private MotorcycleType motorcycleType;
  private MotorcycleColor motorcycleColor;
  private String extraEquipement;

  // CONSTRUCTOR


  public Motorcycle(String manufacturer, String model, int horsepower, EngineType engineType,
                    MotorcycleType motorcycleType, MotorcycleColor motorcycleColor, String extraEquipement) {
    super(manufacturer, model, horsepower, engineType);
    this.motorcycleType = motorcycleType;
    this.motorcycleColor = motorcycleColor;
    this.extraEquipement = extraEquipement;
  }

  // GETTER METHODS
  public MotorcycleType getMotorcycleType() {
    return motorcycleType;
  }

  public MotorcycleColor getMotorcycleColor() {
    return motorcycleColor;
  }

  public String getExtraEquipement() {
    return extraEquipement;
  }

  // METHODS
  @Override
  public String toString() {
    return getVehicleText() + " " + getMotorcycleType() + ", " + motorcycleColor + ", " + getExtraEquipement();
  }

}


/* Exercise12
Implement different types of vehicle.

 1. Derive different types of vehicles from the base class `Vehicle`, like a _motorcycle_ or a _trike_.
 2. Add specific attributes to each of the new derived classes.
 4. Add get methods for the new attributes
 5. Enhance toString() method with the new attributes
 3. Visualize created classes with plantuml as class diagram, inclusive associations.

 */