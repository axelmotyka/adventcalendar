package week02.exercise13;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * + addCompetitor(Competitor competitor)
 * - generateStartingLineup() => in the 1st race, the starting lineup is ordered by drivers last name, drivers first name, vehicles manufacturer.
 * + getStartingLineup() => returns the ordered list of competitors.
 * + toString() => starting lineup as String, like '[Position in StartingLineup] [Competitor]'
 */

public class Race {

  private List<Competitor> competitors;

  public Race(CompetitorList list) {
    this.competitors = list.getCompetitors();
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

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Competitor competitor : competitors) {
      sb.append(competitor.getDriver().getStartingNumber() + " " + competitor.getDriver().getName() + " " + competitor.getVehicle().getManufacturer() + "; ");
    }
    return sb.toString();
  }

}
