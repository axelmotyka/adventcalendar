package week02.exercise15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** Exercise14
 * + addCompetitor(Competitor competitor)
 * - generateStartingLineup() => in the 1st race, the starting lineup is ordered by drivers last name, drivers first name, vehicles manufacturer.
 * + getStartingLineup() => returns the ordered list of competitors.
 * + toString() => starting lineup as String, like '[Position in StartingLineup] [Competitor]'
 */

/** Exercise15
 *  1. Add and implement following methods to class `Race`:
 *       * enhance the constructor with the last result so that the starting lineup can be setup correctly.
 *       * _race()_ => run's the race - generate the final placement randomly
 *       * _getResult()_ => race result as an ordered list of competitors. The list is ordered by the placement, like 1s is first, 2nd is second, ....
 *       * _toString()_ => race result as string, like '[Result Position] [Competitor]'
 */

public class Race {

  private List<Competitor> competitors;
  private List<Competitor> finalPlacement; // Variable for a list with the final placement.

  public Race(CompetitorList list) {
    this.competitors = list.getCompetitors();
    this.finalPlacement = getFinalPlacement(); // constructor enhanced with the final placement.
  }

  public void addCompetitor(Competitor competitor) {
    competitors.add(competitor);
  }

  public void generateStartingLineup() {
    //in the 1st race, the starting lineup is ordered by:
    // + drivers last name, drivers first name
    // + vehicles manufacturer.
    Comparator<Competitor> comparator = Comparator.comparing(c -> c.getDriver().getName());
    comparator = comparator.thenComparing(c -> c.getVehicle().getManufacturer());


    // Sort the stream:
    Stream<Competitor> personStream = competitors.stream().sorted(comparator);

    // Make sure that the output is as expected:
    competitors = personStream.collect(Collectors.toList());
  }

  public List<Competitor> getCompetitors() {
    return competitors;
  }

  public List<Competitor> getStartingLineup() {
    return competitors;
  }

  public void race(List<Competitor> getCompetitors()) { // Method "race" gets as argument the randomly selected list of competitors.

    Random rand = new Random();
    String randomDriverPlacement = driverNames.get(rand.nextInt(driverNames.size()));
    placementNumber++;
    return new finalPlacement(randomDriverPlacement, placementNumber);

    /*
    private Driver getRandomDriver() {
      List<String> driverNames = Arrays.asList("Niki", "Michael", "Louis", "Peter", "Harald", "Gaby", "Petra", "Hans");
      Random rand = new Random();
    } */



  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Competitor competitor : competitors) {
      sb.append(getFinalPlacement() + " " + competitor.getDriver().getName() + " " + "; ");
    }
    return sb.toString();
  }

}
