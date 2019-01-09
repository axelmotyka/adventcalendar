package week02.exercise13;

import java.util.*;

public class CompetitorList {

  private List<Competitor> competitors = new ArrayList<Competitor>();

  public void addCompetitor(Competitor competitor) {
    competitors.add(competitor);

  }
  public List<Competitor> getCompetitors() {
    return competitors;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for(Competitor competitor : competitors){
      sb.append(competitor + ", ");
    }
    return sb.toString();
  }
}
