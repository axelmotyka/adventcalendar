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

    public String run(String time) {
        log.info(String.format("Run(\"%s\")", time));
        int t = Integer.parseInt(time);
        int h = t / 60;
        int m = t % 60;
        return h + ":" + m;
    }
}
