package week02.exercise14;

public class Competitor extends CompetitorsGenerator {

    public int CompetitorPoints=0;

    public Competitor(){
        super();

    }

    public void addPoints(int i) {this.CompetitorPoints+=i;}

    public int getPoints() {return this.CompetitorPoints;}

    public String toString(){
        return this.VehicleName.getManufacturer() + " " + this.getCarName() + "," +
                this.VehicleName.getEngineType()+ "," + this.getHorsepower() + "hps "
                + ", Drivername: " + getDrivername() + "  Starternumber: "
                + this.getDriverStarterNumber() + " Points: " + getPoints() ;
    }

}
