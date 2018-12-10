package week02.exercise01;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class Exercise01Test {

    @Test
    public void generates_empty_list() {
        Race race = new Exercise01().run();
        assertTrue("Generated starting lineup is not empty", race.generateStartingLineup().size() == 0);
    }

    @Test
    public void lineup_without_drivers_is_still_empty() {
        Race race = new Exercise01().run();
        race.addCar(new Car(1, "Skoda Rapid"));
        race.addCar(new Car(2, "Skoda Rapid"));
        assertTrue("Generated starting lineup is not empty", race.generateStartingLineup().size() == 0);
    }

    @Test
    public void lineup_with_drivers_and_cars_has_assigments() {
        Race race = new Exercise01().run();
        race.addCar(new Car(1, "Skoda Rapid"));
        race.addCar(new Car(2, "Skoda Rapid"));

        race.addDriver(new Driver("Elon", "Musk", 1));
        race.addDriver(new Driver("Peter", "Sagan", 1));

        assertTrue("Generated starting lineup is not empty", race.generateStartingLineup().size() == 2);
    }
}