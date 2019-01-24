package ThirdRun;

import java.util.ArrayList;
import java.util.List;

public class CompetitorList {
  private List<Competitor> competitors = new ArrayList<>();

  public void addCompetitor(Competitor competitor) {
    competitors.add(competitor);
  }

  public List<Competitor> getCompetitors() {
    return competitors;
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Competitor competitor:competitors) {
      sb.append(competitor + "; ");
    }
    return sb.toString();
  }
}
