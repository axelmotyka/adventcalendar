package week01.exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;
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

    public Iterable<MatchResult> findMatches( String pattern, CharSequence s )
    {
        List<MatchResult> results = new ArrayList<MatchResult>();

        for ( Matcher m = Pattern.compile(pattern).matcher(s); m.find(); )

            results.add( m.toMatchResult() );

        return results;
    }



    public int calculateExpression(String calculate)
    {
        char[] chars = calculate.toCharArray();


        int low = -1;
        int high = -1;
        int[] partResult= new int[10];
        String lowerpart="";
        String higherpart="";
        String partExpression;
        int n =0;


        // Check for Parentheses ...


        String[] partString= new String [10];
        String[] partStringoriginal= new String [10];

        Pattern pattern = Pattern.compile( "\\(.*?\\)" );
        Matcher matcher = pattern.matcher( calculate );
        while ( matcher.find() ) {
            System.out.println(matcher.group());
            partStringoriginal[n]=matcher.group();

            System.out.println("This is the partstring para " + partStringoriginal[n]);
            partString[n]= partStringoriginal[n].replaceAll("\\(","");
            partString[n]= partString[n].replaceAll("\\)","");
            System.out.println("This is the partstring para 2" + partString[n]);
            System.out.println("This is the calculate para " + calculate);
            // partResult[n]=calculateExpression(partString);
            partResult[n]=666;
            calculate=calculate.replace(partStringoriginal[n],Integer.toString(partResult[n]));
            System.out.println("gesamt " + calculate);

            n++;

        }



        //Check for multiplication .

        pattern = Pattern.compile( "\\d+\\*\\d*" );
        matcher = pattern.matcher( calculate );
        int calcResult=0;
        String[] calcArray = new String[10];

        n=0;

        while ( matcher.find() ) {
            System.out.println(matcher.group());
            partStringoriginal[n] = matcher.group();
            System.out.println("This is the partstring multi " + partStringoriginal[n]);
            calcArray = partStringoriginal[n].split("\\*");
            calcResult = Integer.valueOf(calcArray[0]) * Integer.valueOf(calcArray[1]);
            System.out.println("Multicalc " + calcResult);
            calculate=calculate.replace(partStringoriginal[n],Integer.toString(calcResult));
            matcher = pattern.matcher( calculate );
        }
        System.out.println("gesamt calculate " + calculate);

            /*partString[n]= partStringoriginal[n].replaceAll("\\(","");
            partString[n]= partString[n].replaceAll("\\)","");
            System.out.println("This is the partstring para 2" + partString[n]);
            System.out.println("This is the calculate para " + calculate);
            // partResult[n]=calculateExpression(partString);
            partResult[n]=666;
            calculate=calculate.replace(partStringoriginal[n],Integer.toString(partResult[n]));
            System.out.println("gesamt " + calculate);

            n++;*/








        /*
        //partString="";
        //pattern = "\\d*\\*\\d*";
        for ( MatchResult r : findMatches( pattern, calculate ) ) {
            System.out.println("HELLO " + r.group() + "Getclass " + r.getClass() + " groupcount " + r.groupCount()
                    + " End ");
            partString=r.group();
        }
        System.out.println("This is the partstring multi" + partString);
        System.out.println("This is the calculate multi" + calculate);

        String textarray[] = partString.split("\\*");
        System.out.println( "Both operators " + textarray[0] + " " +  textarray[1]);
        //partResult=(Integer.valueOf(textarray[0]) * Integer.valueOf(textarray[1]));

*/


        //List<generic> Hallo;





/*
        while ( matcher.find())

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

        //System.out.println("found paranthese 3" + low + high );

        return 0;

    }
}
