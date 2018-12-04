package week01.exercise03;

import java.util.logging.Logger;

/**
 * Time Convert
 * <p>
 * Take the _time_ parameter being passed and return the number of hours and minutes the parameter converts to (ie. if num = 63 then the output should be 1:3).
 * Separate the number of hours and minutes with a colon.
 */
public class Exercise03 {
    private static final Logger log = Logger.getLogger(Exercise03.class.getName());

    public String run(String time) {
        int intTime = Integer.valueOf(time);
        int hours = 0;
        int minutes = 0;
        String result = "0";

        if (intTime > 0) {
            if (intTime >= 60) {
                hours = intTime / 60;
            }
            minutes = intTime - hours * 60;

            if(minutes > 0) {
                result = hours + ":" + minutes;
            } else {
                result = String.valueOf(hours);
            }
        }

        return result;
    }
}
