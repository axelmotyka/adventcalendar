package week02.exercise12;

public class Motorcycle extends Vehicle {

  private final boolean horn;

  private String hornAsText() {
    if (horn){
      return "horn";
    } else {
      return "no horn";
    }
  }

  Motorcycle(String manufacturer, String name, int horsepower, EngineType engineType, boolean horn) {
    super(manufacturer, name, horsepower, engineType);
    this.horn = horn;
  }

  @Override
  public String toString() {
    // returns the vehicle as String like 'Skoda Fabia, gasoline, 25hps'
    return manufacturer + " " + name + ", " + engineType + ", " + horsepower + "hps" + ", " + hornAsText();
  }
}

