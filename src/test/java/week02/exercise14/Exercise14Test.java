package week02.exercise14;

import org.junit.Test;
import week02.exercise13.Competitor;
import week02.exercise13.CompetitorsGenerator;
import week02.exercise13.CompetitorsList;
import week02.exercise13.Driver;
import week02.exercise13.Motorcycle;
import week02.exercise13.Trike;
import week02.exercise13.Vehicle;

import static org.junit.Assert.assertEquals;


public class Exercise14Test {

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



        assertEquals("Wrong result!", "Toyota Verso", tester.getName());
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
        Motorcycle tester = new Motorcycle("Toyota", "Verso", 100,
                Motorcycle.engineType.gasoline, Motorcycle.windShield.Yes);



        assertEquals("Wrong result!", "Toyota Verso,"
                + Motorcycle.engineType.gasoline + "," + 100
                + "hps" + ", This Shield : " + Motorcycle.windShield.Yes, tester.toString());
    }


    @Test
    public void Test10() {
        Trike tester = new Trike("Toyota", "Verso", 100,
                Trike.engineType.gasoline, Trike.roofType.Yes);



        assertEquals("Wrong result!", "Toyota Verso,"
                + Motorcycle.engineType.gasoline + "," + 100
                + "hps" + ", This Roof : " + week02.exercise12.Trike.roofType.Yes, tester.toString());
    }

    @Test
    public void Test11() {
        CompetitorsGenerator tester = new CompetitorsGenerator();


        // Controls if the String gasoline, electric or diesel will be generated
        junit.framework.Assert.assertTrue(tester.toString().contains("electric")||
                tester.toString().contains("diesel") || tester.toString().contains("gasoline"));
    }

    @Test
    public void Test12() {
        CompetitorsGenerator testerone = new CompetitorsGenerator();

        CompetitorsGenerator testertwo = new CompetitorsGenerator();


        // Controls that the Driver Startnumbers is not the same and changes every time .
        junit.framework.Assert.assertTrue(testerone.getDriverStarterNumber() < testertwo.getDriverStarterNumber());
    }
    @Test
    public void Test13() {
        Competitor testerthree = new Competitor();

        Competitor testerfour = new Competitor();


        testerthree.addPoints(3);

        testerthree.addPoints(2);


        // Controls that the Competior points are now 5
        junit.framework.Assert.assertTrue(testerthree.getPoints() == 5);

        // Controls that the Competior points are now 0
        junit.framework.Assert.assertTrue( testerfour.getPoints() == 0);

    }

    @Test
    public void Test14() {
        CompetitorsGenerator testerone = new CompetitorsGenerator();

        CompetitorsGenerator testertwo = new Competitor();

        // This is only for check if the Casting is working fine ...
        junit.framework.Assert.assertTrue(testerone.getDriverStarterNumber() < testertwo.getDriverStarterNumber());
    }

    @Test
    public void Test15() {
        Competitor testerfive = new Competitor();

        Competitor testerseven = new Competitor();

        CompetitorsList testersix = new CompetitorsList();


        testersix.addCompetitor(testerfive);


        testersix.addCompetitor(testerseven);


        // Check for a string that occurs in the array .. in this Case the String "Points"
        junit.framework.Assert.assertTrue(testersix.getCompetitors().toString().contains("Points"));


    }

    @Test
    public void Test16() {
        Competitor testereight = new Competitor();

        Competitor testernine = new Competitor();

        testernine.addPoints(1123);

        CompetitorsList testerten = new CompetitorsList();


        testerten.addCompetitor(testereight);

        testerten.addCompetitor(testernine);



        // Check for a string that occurs in the array .. in this case the number of the Points 1123
        junit.framework.Assert.assertTrue(testerten.getCompetitors().toString().contains("1123"));


    }

}