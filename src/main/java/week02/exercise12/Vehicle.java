package week02.exercise12;

public class Vehicle {

    //public Object engineTypeEnum;
    String manufactur = new String();
    String vehicleName = new String();
    int horsePower;
    String engineType = new String();

/*    public enum engineTypeEnum {
        electric, diesel, gasoline
    }*/

    public String vehicle(String manufactor, String vehicleName, int horsePower, String engineTypeString) {
        this.manufactur = manufactor;
        this.vehicleName = vehicleName;
        this.horsePower = horsePower;
        this.engineType = engineTypeEnum.valueOf(engineTypeString).toString();
        return (this.manufactur + " " + this.vehicleName + " " + this.horsePower + " " + this.engineType);
    }

    public String getManufacturer() {
        return "'" + this.manufactur + "'";
    }

    public String getName() {
        return "'" + this.vehicleName + "'";
    }

    public int getHorsepower() {
        return this.horsePower;
    }

    public String getEngineType() {
        return "'" + engineTypeEnum.valueOf(this.engineType).toString() + "'";
    }

    public String toString() {
        return "'" + this.manufactur + " " + this.vehicleName + ", " + engineTypeEnum.valueOf(this.engineType).toString() + ", " + this.horsePower + "hps'";
    }

    /*
     *1. Derive different types of vehicles from the base class `Vehicle`, like a _motorcycle_ or a _trike_.
     *2. Add specific attributes to each of the new derived classes.
     *4. Add get methods for the new attributes
     *5. Enhance toString() method with the new attributes
     */
    //Vehicle.vehicle("BMW", "R 1200 GS", 98, "gasoline");


    public Vehicle createVehicles() {
        String manufactor = "BMW";
        String vehicleName = "R 1200 GS";
        int horsePower = 98;
        String engineType = "gasoline";
        Vehicle motorcycle = new Vehicle();


        motorcycle.vehicle(manufactor, vehicleName, horsePower, engineType);


        return motorcycle;
    }

    interface RacingGame {

    }
    public enum engineTypeEnum {
        electric, diesel, gasoline
    }
}
