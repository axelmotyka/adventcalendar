package week02.exercise13;

public class Trike extends Vehicle {

  private final String color;

  Trike(String manufacturer, String name, int horsepower, EngineType engineType, String color) {
    super(manufacturer, name, horsepower, engineType);
    this.color = color;
  }

  @Override
  public String toString() {
    // Returns the vehicle as String like 'Skoda Fabia, gasoline, 25hps'.
    return manufacturer + " " + name + ", " + engineType + ", " + horsepower + "hps" + ", " + color;
  }
}
