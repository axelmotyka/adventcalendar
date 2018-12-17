package week02.exercise11;

public class RacingGame {
    /*
    * 1. Define Class `Driver` with following methods:
    * _Constructor_ => All needed attributes
    * _getName()_ => returns Lastname, Firstname as String
    * _getStartingNumber()_ => returns the starting number as an int
    * _toString()_ => generates a String like '(1) Joe Cewl'
    */



    public static class  Driver {
        int startingNumber;
        String firstName = new String();
        String lastName = new String();

        public String driver(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
            this.startingNumber = startingNumber+1;
            return (this.firstName + " " + this.lastName);
        }

        public String getName() {
            return this.lastName + ", " + this.firstName;
        }

        public int getStartingNumber() {
            return this.startingNumber;
        }
        public String toString() {
            return "'(" + this.startingNumber + ") " + this.firstName + " " + this.lastName + "'";
        }
    }
    /*
    * 2. Define Class `Vehicle` with following  methods:
    * _Constructor_ => All needed attributes
    * _getManufacturer()_ - returns the manufacturer like 'Skoda' as String
    * _getName()_ - returns the vehicle name like 'Fabia' as String
    * _getHorsepower()_ - returns the engines horsepower as int
    * _getEngineType_ - returns one of `[electric, diesel, gasoline]` as an Enum
    * _toString()_ - returns the vehicle as String like 'Skoda Fabia, gasoline, 25hps'
    */
    public static class  Vehicle {
        String manufactur = new String();
        String vehicleName = new String();
        int horsePower;
        String engineType = new String();
        public enum engineTypeEnum{
            electric, diesel, gasoline
        };

        public String vehicle(String manufactor, String vehicleName, int horsePower, String engineTypeString){
            this.manufactur = manufactor;
            this.vehicleName = vehicleName;
            this.horsePower = horsePower;
            this.engineType = engineTypeEnum.valueOf(engineTypeString).toString();
            return (this.manufactur + " " + this.vehicleName + " " + this.horsePower + " " + this.engineType);
        }

        public String getManufacturer(){
            return "'" + this.manufactur + "'";
        }

        public String getName(){
            return "'" + this.vehicleName + "'";
        }

        public int getHorsepower(){
            return this.horsePower;
        }

        public String getEngineType(){
            return "'" + engineTypeEnum.valueOf(this.engineType).toString() + "'";
        }
        public String toString(){
            return "'" + this.manufactur + " " + this.vehicleName + ", " + engineTypeEnum.valueOf(this.engineType).toString() + ", " + this.horsePower + "hps'";
        }

    }

/*
    * *Implement basic class lineup.



    * 1. Define Class `Driver` with following methods:
    * _Constructor_ => All needed attributes
    * _getName()_ => returns Lastname, Firstname as String
    * _getStartingNumber()_ => returns the starting number as an int
    * _toString()_ => generates a String like '(1) Joe Cewl'
    * 2. Define Class `Vehicle` with following  methods:
    * _Constructor_ => All needed attributes
    * _getManufacturer()_ - returns the manufacturer like 'Skoda' as String
    * _getName()_ - returns the vehicle name like 'Fabia' as String
    * _getHorsepower()_ - returns the engines horsepower as int
    * _getEngineType_ - returns one of `[electric, diesel, gasoline]` as an Enum
    * _toString()_ - returns the vehicle as String like 'Skoda Fabia, gasoline, 25hps'
            3. Add useful unit tests
 4. Visualize created classes with plantuml as class diagram, inclusive associations.*/


    public RacingGame() {}
}
