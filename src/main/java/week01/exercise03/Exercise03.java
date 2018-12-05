package week01.exercise03;

import java.util.logging.Logger;

/**
 * Time Convert
 *
 * Take the _time_ parameter being passed and return the number of hours and
 * minutes the parameter converts to (ie. if num = 63 then the output should be
 * 1:3). Separate the number of hours and minutes with a colon.
 */
public class Exercise03 {
    private static final Logger log = Logger.getLogger(Exercise03.class.getName());

    public String run(String time) {

        double intTime = Integer.parseInt(time);
        intTime = intTime / 60;
        String timeP = Double.toString(intTime);

        if (timeP == "0.0") {
            time = "0";
            return time;
        } else {

            time = timeP.replace('.', ':');
            return time;
        }
    }
}
