package week01.exercise03;

/**
 * Time Convert
 *
 * Take the _time_ parameter being passed and return the number of hours and minutes the parameter converts to (ie. if num = 63 then the output should be 1:3). 
 * Separate the number of hours and minutes with a colon.
 */
public class Exercise03 {
    public String myHoursMinutes;
    // Der Parameter time bekommt einen Integer geliefert und gibt die Anzahl der Minuten an.
    public String run(int time) {


        // Erzeuge eine Integer VAR und füge die Stunden als ganze Zahlen rein.
        int myHours =  time / 60;

        // Erzeuge eine Integer VAR und füge die Minuten als ganze Zahlen hinzu.
        int myMinutes = time % 60;

        if (time == 0) {
            myHoursMinutes = "0";
            System.out.println(0);
        }
        else {
            String myHoursStr = Integer.toString(myHours);
            String myMinutesStr = Integer.toString(myMinutes);
            myHoursMinutes = myHoursStr + ':' + myMinutesStr;
            System.out.println(myHoursMinutes);
        }

        /* ALTERNATIVE
        time.replace(",", ":")
        double timedoub = (double) time;
        timedoub = timedoub / 60;
        String timedoub = new String(time).replace(".", ":");*/

        return myHoursMinutes;
    }
}