package week02.exercise13;

import java.util.ArrayList;
import java.util.List;

public class CompetitorsList {
    public List<Competitor> competitor = new ArrayList<Competitor>();

    public CompetitorsList(){
        super();

    }

    public void addCompetitor(Competitor competitor){
        this.competitor.add(competitor) ;

    }

    public List<Competitor> getCompetitors(){

        return competitor;
    }


    public String toString(){

        List<String> listDrivers = new ArrayList<String>();

        for (Competitor comp : competitor){

            listDrivers.add("\n" + "Points " + comp.getPoints() + " ; " +  comp.getDrivername() + ";" + comp.getCarName() + "\n");
        }

        return listDrivers.toString();
    }






}
