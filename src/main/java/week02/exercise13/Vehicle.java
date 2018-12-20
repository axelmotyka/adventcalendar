package week02.exercise13;

public class Vehicle {
    public String manufacturer;
    public String name;
    public int horsePower;
    public enum engineType {electric,diesel,gasoline} ;
    public engineType engines;

    // Create Construktor

    public Vehicle(String manufacturer, String name , int horsePower , engineType engines){
        this.manufacturer = manufacturer;
        this.name = name;
        this.horsePower = horsePower;
        this.engines = engines;


    }

    public String getManufacturer(){
        return this.manufacturer;

    }

    public String getName(){
        return this.name;
    }

    public int getHorsepower(){
        return this.horsePower;
    }

    public engineType getEngineType(){
        return this.engines;
    }

    public String toString(){
        return this.manufacturer + " " + this.name + "," + this.engines + "," + this.horsePower + "hps";
    }

}
