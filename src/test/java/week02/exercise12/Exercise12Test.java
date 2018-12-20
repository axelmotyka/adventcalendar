package week02.exercise12;

import org.junit.Test;
import week02.exercise12.Driver;
import week02.exercise12.Vehicle;

import static org.junit.Assert.assertEquals;


public class Exercise12Test {

    @Test
    public void Test01() {
        Driver tester = new Driver("Schumacher", "Michael", 1);



        assertEquals("Wrong result!", "Schumacher,Michael", tester.getName());
    }

    @Test
    public void Test02() {
        Driver tester = new Driver("Schumacher", "Michael", 1);


        assertEquals("Wrong result!", 1, tester.getStartingNumber());
    }

    @Test
    public void Test03() {
        Driver tester = new Driver("Schumacher", "Michael", 1);



        assertEquals("Wrong result!", "(1) Michael Schumacher", tester.toString());
    }

    @Test
    public void Test04() {
        Vehicle tester = new Vehicle("Toyota", "Verso", 100, Vehicle.engineType.gasoline);



        assertEquals("Wrong result!", "Toyota", tester.getManufacturer());
    }

    @Test
    public void Test05() {
        Vehicle tester = new Vehicle("Toyota", "Verso", 100, Vehicle.engineType.gasoline);



        assertEquals("Wrong result!", "Verso", tester.getName());
    }

    @Test
    public void Test06() {
        Vehicle tester = new Vehicle("Toyota", "Verso", 100, Vehicle.engineType.gasoline);



        assertEquals("Wrong result!", 100, tester.getHorsepower());
    }


    @Test
    public void Test07() {
        Vehicle tester = new Vehicle("Toyota", "Verso", 100, Vehicle.engineType.gasoline);



        assertEquals("Wrong result!", Vehicle.engineType.gasoline, tester.getEngineType());
    }

    @Test
    public void Test08() {
        Vehicle tester = new Vehicle("Toyota", "Verso", 100, Vehicle.engineType.gasoline);



        assertEquals("Wrong result!", "Toyota Verso,"
                + Vehicle.engineType.gasoline + "," + 100
                + "hps", tester.toString());
    }

    @Test
    public void Test09() {
        Vehicle tester = new Motorcycle("Toyota", "Verso", 100,
                Motorcycle.engineType.gasoline, Motorcycle.windShield.Yes);



        assertEquals("Wrong result!", "Toyota Verso,"
                + Motorcycle.engineType.gasoline + "," + 100
                + "hps" + ", This Shield : " + Motorcycle.windShield.Yes, tester.toString());
    }


    @Test
    public void Test10() {
        Vehicle tester = new Trike("Toyota", "Verso", 100,
                Trike.engineType.gasoline, Trike.roofType.Yes);



        assertEquals("Wrong result!", "Toyota Verso,"
                + Motorcycle.engineType.gasoline + "," + 100
                + "hps" + ", This Roof : " + Trike.roofType.Yes, tester.toString());
    }




}