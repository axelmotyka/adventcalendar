package week02.exercise16;


/**
 * Alle Klassen in Java erben von der Klasse Objekt (implizit) Methoden.
 * Siehe in die Dokumentation von der Klasse Objekt!
 */

/**
 * Exercise16:
 * Implement and a race season. In one season 1..n races can happen. Compute the final result.
 * <p>
 * 2. Add and implement following methods to class `RacingGame`
 * enhance the constructor with the amounts of races. (done)
 * _runSeason()_ => run's the amount of races that are happening this season. (done)
 * _getStanding()_ => holds the competitors in their actual standing as a List, order this list by:
 * without a race by _drivers last name_, _drivers first name_, _vehicles manufacturer_
 * after a race has happened by the competitors points
 * Store the placements shift after a race, means if a competitor went places up, down or remained.
 * _toString()_ => the standing as String like '[Place] [Placement shift] [Competitor]'
 * for the shift up &#8593;
 * for shift down &#8595;
 * for a remained placement &#8594;
 * 3. Add useful unit tests
 * 4. Visualize created classes with plantuml as class diagram, inclusive associations.
 */

public class RacingGame {

  private final int numberOfRaces;
  public int raceNumber;
  public Race standing;

  public RacingGame(int numberOfRaces) {
    this.numberOfRaces = numberOfRaces;
    this.raceNumber = 0;
    this.standing = null;
  }

  public void runSeason() {

    for (int raceNumber = 1; raceNumber < numberOfRaces + 1; raceNumber++) {

    }

    // Generates the list of competitors for the next race.
    CompetitorsGenerator cg = new CompetitorsGenerator();
    CompetitorList list = new CompetitorList();
    list.addCompetitor(cg.getRandomCompetitor());
    list.addCompetitor(cg.getRandomCompetitor());
    list.addCompetitor(cg.getRandomCompetitor());
    list.addCompetitor(cg.getRandomCompetitor());
    list.addCompetitor(cg.getRandomCompetitor());
    list.addCompetitor(cg.getRandomCompetitor());
    list.addCompetitor(cg.getRandomCompetitor());
    list.addCompetitor(cg.getRandomCompetitor());
    list.addCompetitor(cg.getRandomCompetitor());
    System.out.println(list);

    // Executes the next race. For learning reasons it shows the competitor list twice, unsorted and sorted.
    Race race = new Race(list);
    System.out.println("Unsorted Competitor / Race List: ");
    System.out.println(race);

    race.generateStartingLineup();
    System.out.println("Sorted Competitor / Race List: ");
    System.out.println(race);
    standing = race;
  }

  // Diese Methode enthält eine Liste der aktuellsten Plazierungen.
  // Vor dem ersten Rennen (raceNumber ist 0) enthält die Liste alle Fahrer, sortiert nach Fahrer und Fahrzeug.
  // Ab dem ersten Rennen enthält die Liste alle Fahrer, sortiert nach ihrer Punktzahl.
  public void getStanding(int raceNumber) {
    if (raceNumber == 0) {
      CompetitorList list = new CompetitorList();
      System.out.println("Aufstellung der Fahrer zu Saisonbegionn: " + list);
    } else {
      System.out.println("Tabellenstand der Fahrer in der Saison: " + standing);
    }
  }

  public static void main(String[] args) {
    // In der VAR racingGame wird eine Objekt von der Instanz RacingGame gespeichert.
    RacingGame racingGame = new RacingGame(7);
    // Auf dem racingGame-Objekt führt die Methode runSeason() aus.
    racingGame.runSeason();
    racingGame.getStanding(0);
  }
}
