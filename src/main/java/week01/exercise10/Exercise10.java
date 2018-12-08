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


        return Integer.valueOf(calculateExpression(calculate));

    }

    public Iterable<MatchResult> findMatches( String pattern, CharSequence s )
    {
        List<MatchResult> results = new ArrayList<MatchResult>();

        for ( Matcher m = Pattern.compile(pattern).matcher(s); m.find(); )

            results.add( m.toMatchResult() );

        return results;
    }



    public String calculateExpression(String calculate)
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

        // Declaration of some variables for the Parentheses.
        String[] partString= new String [10];
        String[] partStringoriginal= new String [10];
        // Establish a pattern for the parentheses
        Pattern pattern = Pattern.compile( "\\(.*?\\)" );
        Matcher matcher = pattern.matcher( calculate );
        // now check for parentheses . If the parentheses would be found the inner parentheses would be
        // call in a recrusiv function call . The parentheses will be cutted
        while ( matcher.find() ) {
            System.out.println(matcher.group());
            partStringoriginal[n]=matcher.group();

            System.out.println("This is the partstring para " + partStringoriginal[n]);
            partString[n]= partStringoriginal[n].replaceAll("\\(","");
            partString[n]= partString[n].replaceAll("\\)","");
            System.out.println("This is the partstring para 2" + partString[n]);
            System.out.println("This is the calculate para " + calculate);
            partResult[n]=Integer.valueOf(calculateExpression(partString[n]));
            //partResult[n]=666;
            calculate=calculate.replace(partStringoriginal[n],Integer.toString(partResult[n]));
            System.out.println("gesamt " + calculate);

            n++;

        }

        // ----------------------------------------------

        //Check for multiplication .
        // Declaration of some variables for the Parentheses.
        pattern = Pattern.compile( "\\d+\\*\\d*" );
        matcher = pattern.matcher( calculate );
        int calcResult=0;
        String[] calcArray = new String[10];

        n=0;

        // now check for multiplication . If the multiplication  would be found the first multiplication would be
        // cutted and the both digits will be cutted to an array  . Then the complete string will be updated so
        // that for instance  a*b*c will be d*c . And after that the d will be multiplicated with c.
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
        System.out.println("gesamt calculate multi " + calculate);

        //-------------------------------------------------------


        //Check for division .
        // Declaration of some variables for the Parentheses.
        pattern = Pattern.compile( "\\d+/\\d*" );
        matcher = pattern.matcher( calculate );
        calcResult=0;
        calcArray = new String[10];

        n=0;

        // now check for division same like multiplikation
        while ( matcher.find() ) {
            System.out.println(matcher.group());
            partStringoriginal[n] = matcher.group();
            System.out.println("This is the partstring div " + partStringoriginal[n]);
            calcArray = partStringoriginal[n].split("/");
            calcResult = Integer.valueOf(calcArray[0]) / Integer.valueOf(calcArray[1]);
            System.out.println("divicalc " + calcResult);
            calculate=calculate.replace(partStringoriginal[n],Integer.toString(calcResult));
            matcher = pattern.matcher( calculate );
        }
        System.out.println("gesamt calculate division " + calculate);

        //-------------------------------------------------------


        //Check for addition .
        // Declaration of some variables for the Parentheses.
        pattern = Pattern.compile( "\\d+\\+\\d*" );
        matcher = pattern.matcher( calculate );
        calcResult=0;
        calcArray = new String[10];

        n=0;

        // now check for division same like multiplikation
        while ( matcher.find() ) {
            System.out.println(matcher.group());
            partStringoriginal[n] = matcher.group();
            System.out.println("This is the partstring adition " + partStringoriginal[n]);
            calcArray = partStringoriginal[n].split("\\+");
            calcResult = Integer.valueOf(calcArray[0]) + Integer.valueOf(calcArray[1]);
            System.out.println("adition " + calcResult);
            calculate=calculate.replace(partStringoriginal[n],Integer.toString(calcResult));
            matcher = pattern.matcher( calculate );
        }
        System.out.println("gesamt calculate addition " + calculate);

        //-------------------------------------------------------

        return calculate;

    }
}
