package ThirdRun;

import java.util.ArrayList;
import java.util.List;

public class CompetitorList {

  // VARIABLE
  /* INTERFACE
  * In the code row below we declare and assign an "interface" object which stores data from class/type "Competitor".
  * The name of the object (the variable) is "competitors". Then we assign to "competitors" an new ArrayList object
  * which can contain data from the same class/type: "Competitor". But the type is not mentioned in order to save space.
  *
  * A List Interface provides many methods which are not defined. Behind a List there can be a different data type saved.
   */
  // Initialize A new ArrayList with the datatype Competitor.
  private List<Competitor> competitors = new ArrayList<>();


  // SETTER METHODS
  // Set a competitors to the competitors list.
  public void addCompetitor(Competitor competitor) {
    competitors.add(competitor);
  }

  // GETTER METHODS
  // Get a list of all competitors.
  public List<Competitor> getCompetitors() {
    return competitors;
  }


  /**
   * R1: Annotation for the intention, that we want to override the toString() method with an individual string.
   * R2: Definition of the toString() method.
   * R3: At first generate an new StringBuilder object and save it in VAR s"b", in order to add many string elements
   * to this object.
   * R4 - 5: foreach-loop: Iterate trough the list competitors and append each element to the string object sb.
   * R7: return sb to the toString() method. When the CompetitorList class is printed out, then toString() provides
   * the value/the contect of sb-String object.
    */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Competitor competitor:competitors) {
      sb.append(competitor + "; ");
    }
    return sb.toString();
  }
}


/*
### Exercise 13 - Racing game competitors

 Generate a CompetitorsList which holds a Competitor with a Driver and Vehicle.

  1. Create class `CompetitorsGenerator`, which randomly generates drivers and related vehicles as a `Competitor`.
  2. Create class `Competitor` storing the assigment of the derived classes of `Vehicle` and `Driver` with:
     * _getPoints()_ => returns the actual points as int
     * _addPoints(int)_ => add's points from a race
  3. Create class `CompetitorsList` storing `Competitor`:
     * _addCompetitor(Competitor competitors)_
     * _getCompetitors()_ => which returns a list of `Competitor`
     * _toString()_ => method, which concatenate the contained toString() methods. This will generate a String
     * like '[Points] [Driver] [Vehicle]'
  4. Add useful unit tests
  5. Visualize created classes with plantuml as class diagram, inclusive associations.
 */