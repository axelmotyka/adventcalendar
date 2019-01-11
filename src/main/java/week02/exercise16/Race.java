package week02.exercise16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Exercise15
 * 1. Add and implement following methods to class `Race`:
 * * enhance the constructor with the last result so that the starting lineup can be setup correctly.
 * + _race()_ => run's the race - generate the final placement randomly
 * + _getResult()_ => race result as an ordered list of competitors. The list is ordered by the placement, like 1s is first, 2nd is second, ....
 * * _toString()_ => race result as string, like '[Result Position] [Competitor]'
 */

public class Race {

  // Variables in this class.
  private List<Competitor> competitors;
  private List<Competitor> startingLineup = new ArrayList<>();
  private List<Competitor> raceResult = new ArrayList<>();

  // Method "Race" enhanced with the competitors final placement.
  public Race(CompetitorList list) { // ??? Wie war das nochmals: Eine Methode Race innerhalb Klasse Race???
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
    startingLineup = personStream.collect(Collectors.toList());
  }

  public List<Competitor> getCompetitors() {
    return competitors;
  }

  public List<Competitor> getStartingLineup() {
    return startingLineup;
  }

  // The method "race" selects from a list of drivers randomly the drivers final placement. Therefore it gets passed
  // the randomly generated starting line-up.
  //
  public void race() {
    raceResult = new ArrayList<>(startingLineup);
    Collections.shuffle(raceResult);
//    2. Store the race result points to the `Competitor`
//            * for the first place the driver gets '[count of drivers - place + 1] * 2' points
//            * all other placements gives the drivers '[count of drivers - place + 1] * 1' points
//    3. Generate the next starting lineup from the drivers last race position.
      for (int place = 0; place < raceResult.size(); place++) {
        if (place == 0){
          raceResult.get(0).addPoints((raceResult.size() - 1 + 1) * 2);
        } else {
          raceResult.get(place).addPoints((raceResult.size() - (place+1) + 1));
        }
      }
      startingLineup = raceResult;
  }

  public List<Competitor> getResult() {
    return raceResult;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Competitor competitor : competitors) {
      sb.append(" " + competitor.getDriver().getName() + " " + "; ");
    }
    return sb.toString();
  }

}
