package week01.exercise03;

import java.time.format.DateTimeFormatter;
import java.time.Clock;
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
        String restString = "";
        Integer timeAsNumber = Integer.parseInt(time);
        int numOfMinutesInt = timeAsNumber / 60;
        int restInt = timeAsNumber % 60;
        if (restInt != 0) {
            restString = ":" + restInt;
        }
        time = numOfMinutesInt + restString;

        log.info(String.format("Run(\"%s\")", time));

        return time;
    }
}
