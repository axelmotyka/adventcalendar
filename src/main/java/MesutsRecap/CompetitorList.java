package MesutsRecap;

import java.util.ArrayList;
import java.util.List;

public class CompetitorList {

  // Class variables
  // Definiert eine ArrayList (dynamisch, veränderbar) mit dem "List"-Interface und weist es der VAR "competitors" zu.
  private List<Competitor> competitors = new ArrayList<Competitor>();

  // Setter method: to add new competitors to the competitors list.
  // This method returns no value, it only updates the competitor list.
  public void addCompetitor(Competitor competitor) {
    competitors.add(competitor);
  }

  // Getter method: to get the list of competitors.
  // Returs the list of competitors in the VAR "competitors".
  public List<Competitor> getCompetitors() {
    return competitors;
  }

  // This method generates a string with [Points] [Driver] [Vehicle]
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Competitor competitor : competitors) {
      sb.append(competitor + ", ");
    }
    return sb.toString();
  }
  /** ERKLÄRUNG FÜR TOSTRING-METHODE
   * Z1: Hier nutzen wir die toString()-Methode, welcher öffentlich ist und einen String als Rückgabewert liefern soll.
   * Z2: Erzeugt eine Instanz der Klasse StringBuilder und weist es der VAR "sb" zu. StringBuilder erzeugt ein
   * veränderbares String-Objekt. Zum Beispiel kann ein StringBuilder Objekt einen String enthalten, der wir weitere
   * Strings hinzufügen.
   * Z3: foreach-Schleife, um für jedes Element "competitor" in der Liste "competitors" den Code im Body auszuführen.
   * Z4: Das aktuelle "competitor"-Element und den weiteren String in die VAR "sb" hinzufügen.
   */

  // Die main-Methode zu Testzwecken. Daher nicht weiter beachten, evtl. später auskommentieren.
  public static void main(String[] args){
    CompetitorList newList = new CompetitorList();
    System.out.println(newList);
  }

}
