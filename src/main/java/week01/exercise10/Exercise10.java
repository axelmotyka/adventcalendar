package week01.exercise10;

import java.util.*;

/**
 * Closest Enemy
 * Write a small calculator application, which takes a String and computes the result.
 * The following arithmetic operations are allowed: `+`, `-`, `*` and `/`.
 * Check the right order by using parentheses. 
 * The result is always an Integer - also division are rounded to an integer.
 * The input are Strings like this:
 *  `"1 + 1"` = `2`
 *  `"10 * 20 + 30"` = `230`
 *  `"10 * (20 + 30)"`= `500`
 *  ... complete the tests!
 *
 */
public class Exercise10 {
    private List<Double> stack_operands = new ArrayList<>();  //e.g. 5, 6.7
    private List<String> stack_operators = new ArrayList<>(); //e.g. +-*/


    public double run(String calculate) {
        Set<String> operators = new HashSet<String>();
        operators.add("/");
        operators.add("+");
        operators.add("-");
        operators.add("*");

        Set<String> brackets = new HashSet<String>();
        brackets.add("(");
        brackets.add(")");

        //Set<String> functions = Set.of("sin", "cos", "tan");

        StringTokenizer tokenizer = new StringTokenizer(calculate, operators.toString(), true);
        while (tokenizer.hasMoreElements()) {
            String currentToken = tokenizer.nextToken();
            System.out.println(currentToken);

            if (brackets.contains(currentToken)) {
                System.out.println("ignore brackets for now");
                continue;
            }
            else if (operators.contains(currentToken)) {
                stack_operators.add(currentToken);
            }
            else {
                //operand found
                if (currentToken.matches(".*\\d+.*")) {
                    //token is a number

                    double tokenAsDouble = Double.parseDouble(currentToken);
                    if ((stack_operators.size() >= 1) && stack_operators.get(stack_operators.size() - 1).equals("-")) {
                        tokenAsDouble *= -1;
                        stack_operators.remove( stack_operators.size() - 1 );
                    }
                    stack_operands.add(tokenAsDouble);
                }
                //else error (wrong token, like "a","b","c" or "peter")

            }


        }

        if (stack_operators.isEmpty() && stack_operands.isEmpty()) {
            return 0;
        }
        if (stack_operators.isEmpty()) {
            return stack_operands.remove(stack_operands.size() - 1);
        }
        //here we know, that we have at least one operator and one operand
        while (!stack_operators.isEmpty()) {

            String operator = stack_operators.remove(stack_operators.size() - 1);
            double num2 = stack_operands.remove(stack_operands.size() - 1);
            double num1 = stack_operands.remove(stack_operands.size() - 1);

            double result = calculate(num1, operator, num2);
            stack_operands.add(result);
        }


        return stack_operands.remove(stack_operands.size() - 1);
    }

    private double calculate(double num1, String operator, double num2) {
        double result = 0;

        // If condition selects the right arithmetic operation and executes the math operation.
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        String calculate = "-10*(20+ 30)+5"; //-495
        calculate = "-10*6+2"; //-5
        Exercise10 e = new Exercise10();
        double result = e.run(calculate);
        System.out.println(calculate + " = " + result);
    }
}

