package week01.exercise03;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
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

    //String[] numValues = "1","2","3","4","5","6","7","8","9";
        //java.util.regex.Pattern num = java.util.regex.Pattern.compile("\d");
        //int[] numArray = time.split('', 0);
        //int lengthString = time.length();
        //time[lengthString];
        //System.out.println(lengthString);
        Integer newInt = new Integer((String) time);
        //int i = time.length();
        System.out.println(newInt);
        /*int x = 0;
        int newInt = 0;
        while (i > -1){
            int stringToInt = time.charAt(i-1);
            System.out.println(stringToInt);
            if (x==0) newInt = (stringToInt);
            if (x==1) newInt = +(stringToInt * 10);
            if (x==2) newInt = +(stringToInt * 100);
            if (x==3) newInt = +(stringToInt * 1000);
            if (x==4) newInt = +(stringToInt * 10000);

            x++;
            i--;
        }
        System.out.println(newInt);*/
        //System.out.println(time.charAt()[lengthString]);
        //System.out.println(num);
        int seconds = 0;
        int minutes = newInt/60%seconds;
        //long newSeconds = ((TimeUnit.SECONDS.toMinutes(newInt)) - (newInt/60));
        //time = ((TimeUnit.SECONDS.toMinutes(newInt))+":"+(TimeUnit.SECONDS.toSeconds(newSeconds)));//.convert(newInt, TimeUnit.SECONDS));
        time = minutes + ":" + seconds;
        System.out.println(time);
//        java.lang.Enum<TimeUnit> newInt = time;

        return time;
    }
}
