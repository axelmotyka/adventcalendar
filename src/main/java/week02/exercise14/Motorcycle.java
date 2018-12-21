package week02.exercise14;

import week02.exercise12.Vehicle;

public class Motorcycle extends Vehicle {
    public enum windShield {Yes,No};
    public windShield shield;
    public Motorcycle(String manufacturer, String name, int horsePower, engineType engines,
                      windShield shield) {
        super(manufacturer, name, horsePower, engines);
        this.shield = shield;
    }


    public windShield getShield(){
        return this.shield;
    }

    public String toString(){
        return this.manufacturer + " " + this.name + "," + this.engines + "," + this.horsePower + "hps" +
                ", This Shield : " + this.shield;
    }

}
