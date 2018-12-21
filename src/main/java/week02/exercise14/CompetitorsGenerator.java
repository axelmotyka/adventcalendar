package week02.exercise14;

import week02.exercise13.Vehicle;

import java.util.Random;


public class CompetitorsGenerator {

    public Vehicle VehicleName;
    public Driver DriverName;

    // Driver Variable
    public String[] FirstName = {"Michael", "Peter", "Frank", "Halil", "Jens"};
    public String[] SurName = {"Schmidt", "Kaiser", "Schumacher", "Coban", "Schuster"};
    public static int StarterNumber=0;

    // Vehicle Variable
    public String[] ManufacturerName = {"Mercedes", "Toyota", "Opel", "Renault","Porsche"};
    public String[] CarName = {"S-Klasse","Verso", "Kadett", "Twingo","911"};
    public int horsePower ;
    public Vehicle.engineType engines;


    // Constructor
    public CompetitorsGenerator(){

        // First generate the Vehicle Object

        int manufacturer;

        manufacturer = GenerateRandom(ManufacturerName.length-1);


        this.horsePower = GenerateRandom(1000);

        int pick = new Random().nextInt(Vehicle.engineType.values().length);

        this.engines = Vehicle.engineType.values()[pick];




        VehicleName = new Vehicle(this.ManufacturerName[manufacturer], this.CarName[manufacturer], this.horsePower, this.engines );

        // Now generate the Driver Object

        int firstname;
        int surname ;

        firstname = GenerateRandom(FirstName.length-1);

        surname = GenerateRandom(SurName.length-1);

        StarterNumber++;

        DriverName = new Driver(this.FirstName[firstname], this.SurName[surname], StarterNumber);


    }

    public int GenerateRandom(int maxNumber){


        Random randomno = new Random() ;


        return randomno.nextInt(maxNumber);
    }



    // Getter Function

    public String getCarName(){
        return this.VehicleName.getName();
    }

    public int getHorsepower(){
        return this.VehicleName.getHorsepower();
    }

    public Vehicle.engineType getEngineType(){
        return this.VehicleName.getEngineType();
    }

    public String getDrivername() {return this.DriverName.getName();}

    public int getDriverStarterNumber() {return this.DriverName.getStartingNumber();}

    public String toString(){
        return this.VehicleName.getManufacturer() + " " + this.getCarName() + "," +
                this.VehicleName.getEngineType()+ "," + this.getHorsepower() + "hps "
                + ", Drivername: " + getDrivername() + "  Starternumber: "
                + this.getDriverStarterNumber() ;
    }


}
