package week01.exercise03;

import java.util.logging.Logger;

/**
 * Time Convert
 *
 * Take the _time_ parameter being passed and return the number of hours and minutes the parameter converts to (ie. if num = 63 then the output should be 1:3). 
 * Separate the number of hours and minutes with a colon.
 */
public class Exercise03 {

    private static final Logger log = Logger.getLogger( Exercise03.class.getName() );

    public static String run(String time) {

        String hours, min;
        int intTime= Integer.valueOf(time);

        if (intTime == 0) {
            return "0";
        }
        else if (intTime < 60) {  //
            hours = "0";
            min = Integer.toString(intTime);
        } else {
            hours = Integer.toString(intTime / 60);
            min = Integer.toString(intTime % 60);
        }

        return String.format("%s:%s", hours, min);
    }
}
