package week02.exercise12;

public class RacingGame {


    public class Driver {
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

}
