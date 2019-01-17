package ThirdRun;

public class Truck extends Vehicle {

  // NEW DATATYPES
  public enum TruckType {
    Tow_Truck, Box_Truck, Faltbed_Truck;
  }

  public enum TruckSize {
    small, medium, large, xlarge, xxlarge;
  }

  // VARIABLES
  private TruckType truckType;
  private TruckSize truckSize;
  private String extraEquipement;


  // CONSTRUCTOR
  public Truck(String manufacturer, String model, int horsepower, EngineType engineType, TruckType truckType, TruckSize truckSize, String extraEquipement) {
    super(manufacturer, model, horsepower, engineType);
    this.truckType = truckType;
    this.truckSize = truckSize;
    this.extraEquipement = extraEquipement;
  }

  // GETTER METHODS
  public TruckType getTruckType() {
    return truckType;
  }

  public TruckSize getTruckSize() {
    return truckSize;
  }

  public String getExtraEquipement() {
    return extraEquipement;
  }

  @Override
  public String toString() {
    return getVehicleText() + " " + truckType + " " + truckSize + " " + extraEquipement;
  }
}
