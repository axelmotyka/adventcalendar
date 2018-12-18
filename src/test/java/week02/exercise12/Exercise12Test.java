package week02.exercise12;

import org.junit.Test;
import week01.exercise02.Exercise02;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercise12Test {

    @Test
    public void testIfCreateVehiclesReturnMotorcycle() {
        Vehicle tester = new Vehicle();


/*      String manufactor = "BMW";
        String vehicleName = "R 1200 GS";
        int horsePower = 98;
        String engineType = "gasoline";
        Vehicle motorcycle = new Vehicle();
        motorcycle.vehicle(manufactor, vehicleName, horsePower, engineType);*/


        assertEquals("Create motorcycle", "BMW", tester.createVehicles().manufactur);
    }

    @Test
    public void testIfTrikeReturnNewTrike() {
        Vehicle tester = new Vehicle();


        String manufactur = "Harley-Davidson";
        String vehicleName = "Servi-Car";
        int horsePower = 22;
        String engineType = "gasoline";
        //public enum engineTypeEnum = tester.engineTypeEnum;
        tester.vehicle(manufactur, vehicleName, horsePower, engineType);
        Trike trike = new Trike();
        trike.vehicle(manufactur, vehicleName, horsePower, engineType);


        assertTrue("Create Trike", (tester.toString() != trike.toString()));
    }

    @Test
    public void testIfTrikeMakeSound() {
        Trike tester = new Trike();

        String sound = "ROAR";
        String manufactur = "Harley-Davidson";
        String vehicleName = "Servi-Car";
        int horsePower = 22;
        String engineType = "gasoline";
        tester.vehicle(manufactur, vehicleName, horsePower, engineType);
        assertEquals("Trike Sound", "ROAR", tester.sound());
        assertTrue("Has Trike Sound?", (tester.sound == sound));
    }

    @Test
    public void testIfTrikeDoesNotSoundLikeTesla() {
        Trike tester = new Trike();
        Tesla tesla = new Tesla();


        String sound = "ROAR";
        String manufactur = "Harley-Davidson";
        String vehicleName = "Servi-Car";
        int horsePower = 22;
        String engineType = "gasoline";
        tester.vehicle(manufactur, vehicleName, horsePower, engineType);

        String manufactor2 = "Tesla";
        String vehicleName2 = "Model S";
        int horsePower2 = 428;
        String engineType2 = "electric";
        tesla.vehicle(manufactor2, vehicleName2, horsePower2, engineType2);

        assertTrue("Sound different?", (tester.sound() != tesla.sound()));
    }
}