package ThirdRun;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Race {

  // VARIABLES
  private CompetitorList competitors;
  private List<Competitor> startingLineUP;
  private List<Competitor> raceResult;



  // CONSTRUCTOR
  public Race(CompetitorList competitors, List<Competitor> startingLineUP) {
    this.competitors = competitors;
    this.startingLineUP = startingLineUP;
  }

  // METHODS
  // NOTE: Lambda function??? --->> Learn!!
  public void generateStartingLineup(){
    Comparator<Competitor> comparator = Comparator.comparing(c -> c.getDriver().getLastName());
    comparator = comparator.thenComparing(c -> c.getDriver().getFirstName());
    comparator = comparator.thenComparing(c -> c.getVehicle().getManufacturer());

    // Sort the stream:
    Stream<Competitor> personStream = competitors.getCompetitors().stream().sorted(comparator);

    // Make sure that the output is as expected:
    startingLineUP = personStream.collect(Collectors.toList());
  }



  // GETTER METHODS
  public List<Competitor> getStartingLineUP() {
    return startingLineUP;
  }

  public CompetitorList getCompetitors() {
    return competitors;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    List<Competitor> niceCompetitors = competitors.getCompetitors();
    for (Competitor competitor : niceCompetitors) {
      sb.append("" + (niceCompetitors.indexOf(competitor) +1) + " " + competitor.getDriver() + "; ");
    }
    return sb.toString();
  }
}


/*
### Exercise 15 - Racing game race()

  Let'em race!

  1. Add and implement following methods to class `Race`:
      * enhance the constructor with the last result so that the starting lineup can be setup correctly.
      * _race()_ => run's the race - generate the final placement randomly
      * _getResult()_ => race result as an ordered list of competitors. The list is ordered by the placement, like 1s is first, 2nd is second, ....
      * _toString()_ => race result as string, like '[Result Position] [Competitor]'
  2. Store the race result points to the `Competitor`
      * for the first place the driver gets '[count of drivers - place + 1] * 2' points
      * all other placements gives the drivers '[count of drivers - place + 1] * 1' points
  3. Generate the next starting lineup from the drivers last race position.
  4. Add useful unit tests
  3. Visualize created classes with plantuml as class diagram, inclusive associations.

 */


/*
Exercise 14 - Racing game lineup

Implement the race with it's starting lineup.

Add and implement following methods to class Race:
generateStartingLineup() => in the 1st race, the starting lineup is ordered by drivers last name, drivers first name, vehicles manufacturer.
getStartingLineUP() => returns the ordered CompetitorsList.
toString() => starting lineup as String, like '[Position in StartingLineup] [Competitor]'
Add useful unit tests
Visualize created classes with plantuml as class diagram, inclusive associations.
 */