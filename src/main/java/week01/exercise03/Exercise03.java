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

        String minutes;

        String seconds;

        minutes = String.valueOf(Integer.parseInt(time) / 60);


        seconds = String.valueOf(Integer.parseInt(time) % 60);

        if (seconds.equals("0"))
        {
            seconds="" ;
        }
        else
        {
            seconds = ":" + seconds;
        }
        time = minutes  + seconds;

        System.out.println(time);
        return time;
    }
}
