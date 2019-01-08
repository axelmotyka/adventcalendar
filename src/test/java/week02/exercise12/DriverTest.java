package week02.exercise12;

import org.junit.Test;
import week01.exercise04.Exercise04;

import static org.junit.Assert.*;

public class DriverTest {
  @Test
  public void checkToString() {
    Driver nikiLauda = new Driver("Niki Lauda", 1);
    assertEquals("Wrong result!", "(1) Niki Lauda", nikiLauda.toString());
    assertEquals("Wrong result!", "Niki Lauda", nikiLauda.getName());
    assertEquals("Wrong result!", 1, nikiLauda.getStartingNumber());
  }
}