package week01.exercise10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Closest Enemy
 * Write a small calculator application, which takes a String and computes the result.
 * The following arithmetic operations are allowed: `+`, `-`, `*`, `/`, `^2(x)` and `sqr(x)`.
 * Check the right order by using parentheses. 
 * The result should be rounded off to the second decimal place.
 * The input are Strings like this:
 *  `"1+1"` = `2`
 *  `"10 * 20 + 30"` = `230`
 *  `"10 * (20 + 30)"`= `500`
 *  ... complete the tests!
 *
 */
public class Exercise10 {

    public int run(String calculate) {

        System.out.println(calculate);

        calculate = calculate.replaceAll("[ ]","");

        System.out.println(calculate);

        calculateExpression(calculate);


        return 0;

    }

    public int calculateExpression(String calculate)
    {
        char[] chars = calculate.toCharArray();


        int low = -1;
        int high = -1;
        int partResult = 0;
        String lowerpart="";
        String higherpart="";
        String partExpression;


        // Check for Parentheses ...
        for( int x = 0; x < chars.length; x++ ) {
            if (chars[x] == '(') {
                low = x;

            }
        }
        for( int x = 0; x < chars.length; x++ ) {
            if (chars[x] == ')' && low < x && high == -1)
            {
                high=x;
            }


        }


        // String without Parantheses
        if ( low != -1 && high != -1 )
        {

            partExpression=calculate.substring(low+1,high);
            System.out.println("This is the partexpression " + partExpression);
            //partResult=calculateExpression(calculate.substring(low+1,high-1));
            partResult=666;
            lowerpart=calculate.substring(0,low);
            higherpart=calculate.substring(high+1);
            System.out.println( "low !!! " + lowerpart);
            System.out.println("high !! " + higherpart);
            System.out.println("This is the complete expression " + lowerpart + partResult + higherpart);


        }


        calculate = lowerpart+partResult+higherpart;

        chars = calculate.toCharArray();




        // Check for Paranthees again
        low = -1;
        for( int x = 0; x < chars.length; x++ ) {
            if (chars[x] == '(') {
                low = x;

            }
        }

        if (low != -1 )
        {
            calculateExpression(lowerpart + partResult + higherpart);

        }



        int first=-1;
        low = -1 ;

        //Check for multiplication ...


        Matcher matcher = Pattern.compile("\\*" ).matcher( calculate );
        StringBuffer sb = new StringBuffer();

        while ( matcher.find())
            matcher.
            matcher.appendReplacement( sb, "[PIEP]" );
        matcher.appendTail( sb );
        System.out.println( "FOUND" + sb );



        /*
        for( int x = 0; x < chars.length; x++ )
        {
            if ((int) chars[x] >= 48 && (int)chars[x] <= 57 )
            {
                first=x;

            }

            if (chars[x] == '*' && chars[x+1] == '-' )
            {
                low=x;

            }

        */

        System.out.println("found paranthese 3" + low + high );

        return 0;

    }
}
