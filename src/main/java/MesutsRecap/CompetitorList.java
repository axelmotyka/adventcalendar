package MesutsRecap;

import java.util.ArrayList;
import java.util.List;

public class CompetitorList {

  // Class variables
  // Ich definiere eine ArrayList (dynamisch, veränderbar) mit dem List Interface und weise es der VAR competitors zu.
  private List<Competitor> competitors = new ArrayList<Competitor>();

  // Constructor
  public CompetitorList(List<Competitor> competitors) {
    this.competitors = competitors;
  }

  // Getter method: to get the list of competitors.
  public List<Competitor> getCompetitors() {
    return competitors;
  }

  // Setter method: to add new competitors to the competitors list.
  public void setCompetitors(List<Competitor> competitors) {
    this.competitors = competitors;
  }

  //String with [Points] [Driver] [Vehicle]
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append()
    return sb.toString();
  }


}
