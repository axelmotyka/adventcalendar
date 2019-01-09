package week02.exercise12;

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

  public static void main(String[] args){
    Trike trike = new Trike("Ford", "S-Max",139, EngineType.diesel,"grey");
    System.out.println(trike);
  }
}
