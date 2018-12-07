package week01.exercise10;

/**
 * Closest Enemy
 * Write a small calculator application, which takes a String and computes the result.
 * The following arithmetic operations are allowed: `+`, `-`, `*`, `/`, `^2(x)` and `sqr(x)`.
 * Check the right order by using parentheses.
 * The result should be rounded off to the second decimal place.
 * The input are Strings like this:
 * `"1+1"` = `2`
 * `"10 * 20 + 30"` = `230`
 * `"10 * (20 + 30)"`= `500`
 * ... complete the tests!
 */
public class Exercise10 {


    public String plus(String a, String b) {
        return String.valueOf(Integer.valueOf(a) + Integer.valueOf(b));
    }

    public String minus(String a, String b) {
        return String.valueOf(Integer.valueOf(a) - Integer.valueOf(b));
    }

    public String multiply(String a, String b) {
        return String.valueOf(Integer.valueOf(a) * Integer.valueOf(b));
    }

    public String divide(String a, String b) {
        return String.valueOf(Integer.valueOf(a) / Integer.valueOf(b));
    }

    public int getLeftValuePos(String calculate, int operatorIndex) {
        int i = (operatorIndex - 1);
        for (; i >= 0; i--) {
            if (Character.isDigit(calculate.charAt(i)) == false) break;
        }

        return i;
    }

    public int getRightValuePos(String calculate, int operatorIndex) {
        int i = (operatorIndex + 1);
        for (; i < calculate.length(); i++) {
            if (Character.isDigit(calculate.charAt(i)) == false) break;
        }

        return i;
    }

    public int getRightParenthesisPos(String calculate, int start) {
        int i = start;
        int opened = 0;

        while(i < calculate.length()) {
            if(calculate.charAt(i) == '(') {
                opened++;
            } else if(calculate.charAt(i) == ')'){
                opened--;
                if(opened == 0) break;
            }
            i++;
        }

        return i;
    }

    public String calculate(String left, String right, char operator) {
        String result = "";
        switch (operator) {
            case '*':
                result = multiply(left, right);
                break;
            case '/':
                result = divide(left, right);
                break;
            case '+':
                result = plus(left, right);
                break;
            case '-':
                result = minus(left, right);
                break;
        }

        return result;
    }

    public String replaceResult(String calculate, String result, int left, int right) {
        String temp = calculate;
        calculate = temp.substring(0, left + 1) + result;
        if (right < temp.length()) {
            calculate += temp.substring(right);
        }

        return calculate;
    }

    public String handleSingleOperation(String calculate, char operator, int operatorIndex) {
        int left = getLeftValuePos(calculate, operatorIndex);
        int right = getRightValuePos(calculate, operatorIndex);
        String leftStr = calculate.substring(left + 1, operatorIndex);
        String rightStr = calculate.substring(operatorIndex + 1, right);

        String result = calculate(leftStr, rightStr, operator);

        return replaceResult(calculate, result, left, right);
    }

    public String handleParenthesis(String calculate, int start) {
        int right = getRightParenthesisPos(calculate, start);
        String result = parse(calculate.substring(start + 1, right));

        return replaceResult(calculate, result, start - 1, right + 1);
    }

    public String parse(String calculate) {

        boolean hasOperator = true;
        int i;
        do {
            if ((i = calculate.indexOf('(')) > -1) {
                calculate = handleParenthesis(calculate, i);
            } else if ((i = calculate.indexOf('*')) > -1) {
                calculate = handleSingleOperation(calculate, '*', i);
            } else if ((i = calculate.indexOf('/')) > -1) {
                calculate = handleSingleOperation(calculate, '/', i);
            } else if ((i = calculate.indexOf('+')) > -1) {
                calculate = handleSingleOperation(calculate, '+', i);
            } else if ((i = calculate.indexOf('-')) > -1) {
                calculate = handleSingleOperation(calculate, '-', i);
            } else hasOperator = false;
        } while (hasOperator);

        return calculate;
    }

    public int run(String calculate) {

        calculate = calculate.replaceAll("\\s", "");

        return Integer.valueOf(parse(calculate));
    }
}
