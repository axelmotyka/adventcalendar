package week01.exercise10;

/**
 * Closest Enemy
 * Write a small calculator application, which takes a String and computes the result.
 * The following arithmetic operations are allowed: `+`, `-`, `*` and `/`.
 * Check the right order by using parentheses. 
 * The result is always an Integer - also division are rounded to an integer.
 * The input are Strings like this:
 *  `"1+1"` = `2`
 *  `"10 * 20 + 30"` = `230`
 *  `"10 * (20 + 30)"`= `500`
 *  ... complete the tests!
 *
 */
public class Exercise10 {

    public int run(String calculate) {

        int result;

        String[] arrOfString = calculate.split("()");
        //System.out.println(calculate);

        int number1 = Integer.parseInt(arrOfString[0]);
        //String operator = arrOfString[1];
        int number2 = Integer.parseInt(arrOfString[2]);
        //int number3 = Integer.parseInt(arrOfString[3]);

        //if (operator == "+") {
            result = number1 + number2;
            //System.out.println(number1 + number2);
        //}
        return result;
    }
}
