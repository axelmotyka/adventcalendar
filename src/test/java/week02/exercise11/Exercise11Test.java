package week02.exercise11;

import org.junit.Test;
import week02.exercise11.RacingGame.*;

import static org.junit.Assert.assertEquals;

public class Exercise11Test {

    @Test
    public void makeNewDriver() {
        Driver tester = new Driver();
        String firstName = "Michael";
        String lastName = "Schumacher";
        assertEquals("Create new instance of a Driver", "Michael Schumacher", tester.driver(firstName, lastName));

        assertEquals("Return the Name of the new Driver", "Schumacher, Michael", tester.getName());

        assertEquals("Return the StartingNumber of the new Driver", 1, tester.getStartingNumber());

        assertEquals("Return the StartingNumber and Name as String of the new Driver", "'(1) Michael Schumacher'", tester.toString());

    }
    @Test
    public void makeNewVehicle() {
        Vehicle tester = new Vehicle();
        String manufactor = "Skoda";
        String vehicleName = "Fabia";
        int horsePower = 25;
        String engineType = "gasoline";
        assertEquals("Create new instance of a Vehicle", "Skoda Fabia 25 gasoline", tester.vehicle(manufactor, vehicleName, horsePower, engineType));

        assertEquals("Get manufacturer of a Vehicle","'Skoda'", tester.getManufacturer());

        assertEquals("Get vehicleName of a Vehicle","'Fabia'", tester.getName());

        assertEquals("Get horsePower of a Vehicle",25, tester.getHorsepower());

        assertEquals("Get engineType of a Vehicle","'gasoline'", tester.getEngineType());

        assertEquals("Get engineType of a Vehicle","'Skoda Fabia, gasoline, 25hps'", tester.toString());

    }

}
