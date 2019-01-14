package MesutsRecap;

public class Tractor extends Vehicle{

  // 1st enums definition.
  public enum TractorType {
    Classic,
    CabinLux,
    Robotics;
  }

  // 2nd enums definition.
  public enum TractorSize {
    quad,
    small,
    medium,
    large,
    xlarge,
    mega;
  }

  // Class variables (additional to Vehicle class):
  private TractorType type;
  private TractorSize size;

  // FRAGE: Wie schränke ich eine Eigenschaft von der vererbenden Klasse ein? Z.B. soll es nur zwei Motortypen geben.

  // Constructor:
  public Tractor(String manufacturer, String name, int horsepower, EngineType engineType, TractorType type, TractorSize size) {
    super(manufacturer, name, horsepower, engineType);
    this.type = type;
    this.size = size;
  }

  public TractorSize getSize() {
    return size;
  }

  public TractorType getType() {
    return type;
  }

  @Override
  public String toString() {
    return getVehicleText() + " " + size + " " + type;
  }

  public static void main(String[] args) {
    Tractor myFirstTractor = new Tractor("New Holland", "Black Farmer", 69, EngineType.diesel, TractorType.Robotics, TractorSize.xlarge);
    System.out.println(myFirstTractor);
    System.out.println(myFirstTractor.getType());
    System.out.println(myFirstTractor.getSize());
  }
}
