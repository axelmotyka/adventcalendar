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
        /* Dieses Zeug programmieren:
        / int time (time kommt wohl als String, daher in float umwandeln)
        / if (time > 60.0):
            time = time/60
            elif: time == 60:
                time == 1,0
            elif: time < 60:
                time == 0,time
        / time.replace(",", ":")
        String time = new String(time).replace(",", ":");
        return time;*/
        return new String();
    }
}