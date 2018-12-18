package week02.exercise12;
//import RacingGame.*;

public class Trike extends Vehicle {
    String sound = "ROAR";

    public String sound() {

        System.out.println(sound);
        return sound;
    }

    public String toString() {
        return "'" + this.manufactur + " " + this.vehicleName + ", " + engineTypeEnum.valueOf(this.engineType).toString() + ", " + this.horsePower + "hps " + this.sound + "'";
    }

}
