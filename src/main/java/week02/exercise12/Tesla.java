package week02.exercise12;
//import RacingGame.*;

public class Tesla extends Vehicle {
    String sound = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuum";

    public String sound() {

        System.out.println(sound);
        return sound;
    }

    public String toString() {
        return "'" + this.manufactur + " " + this.vehicleName + ", " + engineTypeEnum.valueOf(this.engineType).toString() + ", " + this.horsePower + "hps " + this.sound + "'";
    }

}
