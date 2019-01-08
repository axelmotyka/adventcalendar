package week02.exercise12;

import org.junit.Test;

import static org.junit.Assert.*;

public class TankTest {

  @Test
  public void checkToStringGasoline() {
    Tank tank = new Tank("Krauss Maffei", "Leolang", 90, Vehicle.EngineType.diesel, 500);
    assertEquals("Wrong result!", 500, tank.getAmmunition());
  }
}