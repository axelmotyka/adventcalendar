package week02.exercise12;

public class Driver {

    public String lastName;
    public String firstName;
    public int startingNumber;

    public Driver(String lastName , String firstName,
                  int startingNumber){
        this.lastName = lastName ;
        this.firstName = firstName ;
        this.startingNumber =  startingNumber;

    }

    public String getName(){
        return this.lastName + "," + this.firstName;
    }

    public int getStartingNumber(){
        return this.startingNumber;
    }

    public String toString(){
        return "(" + this.startingNumber + ") " + firstName + " " + lastName;

    }
}
