package week02.exercise12;

import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {
  @Test
  public void checkToStringGasoline() {
    Vehicle skodaFabia = new Vehicle("Skoda", "Fabia", 25, Vehicle.EngineType.gasoline);
    assertEquals("Wrong result!", "Skoda Fabia, gasoline, 25hps", skodaFabia.toString());
  }

  @Test
  public void checkToStringDiesel() {
    Vehicle skodaFabia = new Vehicle("Skoda", "Fabia", 25, Vehicle.EngineType.diesel);
    assertEquals("Wrong result!", "Skoda Fabia, diesel, 25hps", skodaFabia.toString());
  }

  @Test
  public void checkToStringElectric() {
    Vehicle skodaFabia = new Vehicle("Skoda", "Fabia", 25, Vehicle.EngineType.electric);
    assertEquals("Wrong result!", "Skoda Fabia, electric, 25hps", skodaFabia.toString());
  }
}