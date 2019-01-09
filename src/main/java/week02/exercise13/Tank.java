package week02.exercise13;

public class Tank extends Vehicle {

  private final int ammunition;

  public int getAmmunition() {
    return ammunition;
  }

  Tank(String manufacturer, String name, int horsepower, EngineType engineType, int ammunition) {
    super(manufacturer, name, horsepower, engineType);
    this.ammunition = ammunition;
  }

  @Override
  public String toString() {
    // Returns the vehicle as String like 'Skoda Fabia, gasoline, 25hps'.
    return manufacturer + " " + name + ", " + engineType + ", " + horsepower + "hps" + ", " + ammunition;
  }
}
