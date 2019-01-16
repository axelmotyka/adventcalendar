package MesutsRecap;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Race {

  // VARIABLES (FEATURES, ATTRIBUTES OF THIS CLASS)
  // In diesem Fall wurden die VAR hier nur deklariert, initialisiert werden sie im Constructor.
  private CompetitorList competitors;
  private List<Competitor> startingLineUp;
  private List<Competitor> raceResult;


  // CONSTRUCTOR
  // Generates an object form the class "Race". As parameter it takes the list "competitors", which is an
  // object from class CompetitorList. It has 3 variables, which are the features of an object of this class.
  public Race(CompetitorList competitors) {
    this.competitors = competitors; // Weise den als Parameter übergebenen Wert "competitors" der Instanzvariable "competitors" zu.
    this.startingLineUp = new ArrayList<>(); // Initialisierung als neue ArrayList.
    this.raceResult = new ArrayList<>(); // Initialisierung als neue ArrayList.
  }

  // METHODS
  // Add a competitor to the list "competitors".
  public void addCompetitor(Competitor competitor) {
    competitors.addCompetitor(competitor);
  }

  // Generate a starting line-up and sort it 1. by Lastname, 2. by Firstname und 3. by Manufacturer.
  public void generateStartingLineup() {
    Comparator<Competitor> comparator = Comparator.comparing(c -> c.getDriver().getLastname());
    comparator = comparator.thenComparing(c -> c.getDriver().getFirstname());
    comparator = comparator.thenComparing(c -> c.getVehicle().getManufacturer());
    // Die Lambda-Funktion habe ich nicht verstanden!!! Nachlesen!

    // Sort the stream:
    Stream<Competitor> personStream = competitors.getCompetitors().stream().sorted(comparator);

    // Make sure that the output is as expected:
    startingLineUp = personStream.collect(Collectors.toList());
  }

    // Z1: Methoden-Name. Takes the starting line-up and orders it randomly (shuffle it) as the final placement.
    // Z2: Erzeugt eine neue ArrayList mit der collection/Liste startingLineUp und weist es der VAR raceResult zu.
    // Z3: Die shuffle()-Methode sortiert die ihr übergebene Liste startingLineUp zufällig neu (shuffle) und weist es
    // raceResult zu. Für mehr infos zu Collections.shuffle() siehe unten!
  public void race() {
    raceResult = new ArrayList<>(startingLineUp);
    Collections.shuffle(raceResult);

    /* Store the race result points to the Competitor
    for the first place the driver gets '[count of drivers - place + 1] * 2' points
    all other placements gives the drivers '[count of drivers - place + 1] * 1' points
    */
    for (int place = 0; place < raceResult.size(); place++) {
      int points = 0;
      if (place == 0) {
        points = (raceResult.size() - place + 1) * 2;
      } else {
        points = raceResult.size() - place + 1;
      }
      raceResult.get(place).setPoints(points);
    }
    startingLineUp = raceResult;
  }

  // GETTER METHODS
  // To get the current list of competitors.
  public List<Competitor> getCompetitors() {
    return competitors.getCompetitors();
  }

  // To get starting line-up.
  public List<Competitor> getStartingLineUp() {
    return startingLineUp;
  }

  // To get the current race result.
  public List<Competitor> getResult() {
    return raceResult;
  }

  // "@Override annotation: Indicates that a method declaration is intended to override a method declaration in a supertype."
  // Also: @Override weist darauf hin, dass mit der folgenden Methode die existierende Methode toString und veranlasst,
  // toString ein eigens formulierten String ausgibt.
  // Normalerweise gibt toString() den Inhalt der Variable eines erzeugten Objekts aus, also die Adresse zum Speicher-
  // platz.

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder(); // Generates an StringBuilder object sb.
    List<Competitor> localCompetitors = competitors.getCompetitors();
    for (Competitor competitor: localCompetitors) {
      sb.append(" " + (localCompetitors.indexOf(competitor) + 1) + " " + competitor.getDriver().getFirstname() + " " +
              competitor.getDriver().getLastname() + " " + "; ");
    }
    return sb.toString();
  }
  /** ERKLÄRUNG:
   * Z1: Dieses Schlüsselwort veranlasst, dass die nachfolgende bestehende Methode mit indiv. Werten überschrieben wird.
   * Z2: Definiert die Methode toString(), das einen String zurück gibt.
   * Z3: for-Schleife iteriert durch alle Elemente der Liste "competitors". Fügt jedes Element in die VAR competitor
   * vom Typ "Competitor" und bearbeitet diesen im Ausführungsblock.
   * Z4: Fügt dem StringBuilder-Objekt "sb" die ausgewählten Dateien eines jeden Elements competitor.
   * Z6: Als return Wert ist ein String notwendig. Da "sb" ein StringBuilder-Objekt ist, wenden wir bei "sb"
   * die toString-Methode an.
   */

}

/*
We’ll use the method java.util.Collections.shuffle, which takes as input a List and shuffles it in-place. By in-place,
we mean that it shuffles the same list as passed in input instead of creating a new one with shuffled elements.

Let’s look at a quick example showing how to shuffle a List:

1 List<String> students = Arrays.asList("Foo", "Bar", "Baz", "Qux");
2 Collections.shuffle(students);
 */
