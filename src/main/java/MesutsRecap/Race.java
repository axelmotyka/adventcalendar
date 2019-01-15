package MesutsRecap;

/*Implement the race with it's starting lineup.

        1. Add and implement following methods to class `Race`:
          * _generateStartingLineup()_ => in the 1st race, the starting lineup is ordered by _drivers last name_, _drivers first name_, _vehicles manufacturer_.
          * _getStartingLineup()_ => returns the ordered `CompetitorsList`.
          * _toString()_ => starting lineup as String, like '[Position in StartingLineup] [Competitor]'
        2. Add useful unit tests
        3. Visualize created classes with plantuml as class diagram, inclusive associations.
*/


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Race {

  // Variablen dieser Klasse (Eigenschaften, Attribute)
  private CompetitorList competitors;
  private List<Competitor> startingLineUp;


  // Konstruktor für diese Klasse
  public Race(CompetitorList competitors) {
    this.competitors = competitors; // Weise den als Parameter übergebenen Wert "competitors" der Instanzvariable "competitors" zu.
    this.startingLineUp = new ArrayList<>();
  }
  // Generiert eine ein Objekt der Klasse "Race". Zum Erzeugen des Objekts wird als Parameter eine Liste mit competitors
  // übergeben.


  // Methoden in dieser Klasse:
  // M1: Füge in die Liste competitors einen competitor hinzu.
  public void addCompetitor(Competitor competitor) {
    competitors.addCompetitor(competitor);
  }

  // M2: Generiere eine Startaufstellung und sortiere sie 1. nach Lastname, 2. nach Firstname und 3. nach Manufacturer.
  public void generateStartingLineup() {
    Comparator<Competitor> comparator = Comparator.comparing(c -> c.getDriver().getLastname());
    comparator = comparator.thenComparing(c -> c.getDriver().getFirstname());
    comparator = comparator.thenComparing(c -> c.getVehicle().getManufacturer());
    // Die Lambda-Funktion habe ich nicht verstanden!!!

    // Sort the stream:
    Stream<Competitor> personStream = competitors.getCompetitors().stream().sorted(comparator);

    // Make sure that the output is as expected:
    startingLineUp = personStream.collect(Collectors.toList());
  }

  // Getter methods
  public List<Competitor> getCompetitors() {
    return competitors.getCompetitors();
  }

  public List<Competitor> getStartingLineup() {
    return competitors.getCompetitors();
  }

  // @Override annotation: Indicates that a method declaration is intended to override a method declaration in a supertype.
  //Also: Mit @Override überschreibt man die Methode toString und veranlasst, dass ein eigens formulierter String ausgegeben wird.
  @Override
  public String toString(){
    StringBuilder sb = new StringBuilder();
    for (Competitor competitor : competitors.getCompetitors()){
      sb.append(competitor.getDriver().getStartingNumber() + " " + competitor.getDriver().getFirstname() + " " +
              competitor.getDriver().getLastname() + " " + competitor.getVehicle().getManufacturer());
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
