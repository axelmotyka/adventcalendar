package week02.exercise11;

public class RacingGame {


    public static class Driver {
        int startingNumber;
        String firstName = new String();
        String lastName = new String();

        public String driver(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.startingNumber = startingNumber + 1;
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

    public static class Vehicle {
        String manufactur = new String();
        String vehicleName = new String();
        int horsePower;
        String engineType = new String();

        public enum engineTypeEnum {
            electric, diesel, gasoline
        }

        public String vehicle(String manufactor, String vehicleName, int horsePower, String engineTypeString) {
            this.manufactur = manufactor;
            this.vehicleName = vehicleName;
            this.horsePower = horsePower;
            this.engineType = engineTypeEnum.valueOf(engineTypeString).toString();
            return (this.manufactur + " " + this.vehicleName + " " + this.horsePower + " " + this.engineType);
        }

        public String getManufacturer() {
            return "'" + this.manufactur + "'";
        }

        public String getName() {
            return "'" + this.vehicleName + "'";
        }

        public int getHorsepower() {
            return this.horsePower;
        }

        public String getEngineType() {
            return "'" + engineTypeEnum.valueOf(this.engineType).toString() + "'";
        }

        public String toString() {
            return "'" + this.manufactur + " " + this.vehicleName + ", " + engineTypeEnum.valueOf(this.engineType).toString() + ", " + this.horsePower + "hps'";
        }

    }

    public RacingGame() {
    }
}
