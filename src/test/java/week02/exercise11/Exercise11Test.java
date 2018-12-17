package week02.exercise11;

import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static week02.exercise11.Vehicle.engineType.gasoline;


public class Exercise11Test {

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
        Vehicle tester = new Vehicle("Toyota", "Verso", 100, gasoline);



        assertEquals("Wrong result!", "Toyota", tester.getManufacturer());
    }

    @Test
    public void Test05() {
        Vehicle tester = new Vehicle("Toyota", "Verso", 100, gasoline);



        assertEquals("Wrong result!", "Verso", tester.getName());
    }

    @Test
    public void Test06() {
        Vehicle tester = new Vehicle("Toyota", "Verso", 100, gasoline);



        assertEquals("Wrong result!", 100, tester.getHorsepower());
    }


    @Test
    public void Test07() {
        Vehicle tester = new Vehicle("Toyota", "Verso", 100, gasoline);



        assertEquals("Wrong result!", gasoline, tester.getEngineType());
    }

    @Test
    public void Test08() {
        Vehicle tester = new Vehicle("Toyota", "Verso", 100, gasoline);



        assertEquals("Wrong result!", "Toyota Verso,"
                + gasoline + "," + 100
                + "hps", tester.toString());
    }



}