package week01.exercise10;

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

    public int add(int a, int b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double multiply(int a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a/b;
    }

    public double run(String calculate) {

        char[] calculateChars = calculate.toCharArray();

        for(char c : calculateChars) {
            if(Character.isDigit())
        }

    }
}
