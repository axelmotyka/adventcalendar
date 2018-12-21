package week02.exercise14;

import week02.exercise12.Vehicle;

public class Trike extends Vehicle {
    public enum roofType {Yes,No};
    public roofType roof;
    public Trike(String manufacturer, String name, int horsePower, engineType engines, roofType roof) {
        super(manufacturer, name, horsePower, engines);
        this.roof = roof;
    }

    public roofType getRoof(){return this.roof;}

    public String toString(){
        return this.manufacturer + " " + this.name + "," + this.engines + "," + this.horsePower + "hps" +
                ", This Roof : " + this.roof;
    }
}
