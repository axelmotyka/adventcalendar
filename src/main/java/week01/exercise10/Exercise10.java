package week01.exercise10;

import java.util.ArrayList;
import java.util.ArrayList.*;
import java.util.List;

/**
 * Closest Enemy
 * Write a small calculator application, which takes a String and computes the result.
 * The following arithmetic operations are allowed: `+`, `-`, `*` and `/`.
 * Check the right order by using parentheses.
 * The result is always an Integer - also division are rounded to an integer.
 * The input are Strings like this:
 * `"1+1"` = `2`
 * `"10 * 20 + 30"` = `230`
 * `"10 * (20 + 30)"`= `500`
 * ... complete the tests!
 */
public class Exercise10 {
    public int a;
    public int b;
    //public String operator;
    public String type;
    public int result;
    public int numberCount;

    public int run(String calculate) {


        //String[] newCalculate = {"+", "-", "*", "/"};
        //calculate.replaceAll(" ", "");
        //int x = 0;
        String[] newCalculate = calculate.split("");
        ArrayList<String> calculateArrayList = new ArrayList<>();

        //String[] newCalculate = calculate.split("[\\d]");
        //String[] newCalculate = calculate.split("[^\\p{S}\\d]");
        //String[] numbers = calculate.split("[[\\p{Punct}]]");
        //System.out.println(numbers);
        System.out.println(newCalculate);
        for (int j = 0; j < newCalculate.length; j++) {
            if (newCalculate[j] != "[0-9]" ||
                    newCalculate[j] != "+" ||
                    newCalculate[j] != "-" ||
                    newCalculate[j] != "*" ||
                    newCalculate[j] != "/" ||
                    newCalculate[j] != "(" ||
                    newCalculate[j] != ")") {
                calculateArrayList.add(newCalculate[j]);
            } else {
            }
            if (calculateArrayList.contains("(")) {
                type = "brace";
            } else if (calculateArrayList.contains("*")) {
                type = "multi";
            } else if (calculateArrayList.contains("/")) {
                type = "div";
            } else if (calculateArrayList.contains("+")) {
                type = "add";
            } else if (calculateArrayList.contains("-")) {
                type = "min";
            } else {
/*                numberCount = +1;
                a = ((char) (newCalculate[j - 1].charAt(0) - 48)) * 10;
                b = ((char) (newCalculate[j].charAt(0) - 48));
                calculateIndex.put("newNumber" + (j - 1), a + b);
                //int newNumber=a+b;*/


            }
            type = "number";
            continue;
            //startOperation(plus);

        }

        switch (type){
            case "brace":
                int start = calculateArrayList.indexOf("(");
                int end = calculateArrayList.lastIndexOf(")");
                calculateArrayList.subList(start,end).set(0, preCalculation(calculateArrayList.subList(start,end)));
            case "add":
                int operator=calculateArrayList.indexOf("+");
                a = calculateArrayList.get(operator-1).charAt(0);
                b = calculateArrayList.get(operator+1).charAt(0);
                result = a+b;


        }
        return result;
    }

    private String preCalculation(List<String> subList) {
        String result = "";
        result += run(subList.toString());
        return result;
    }


}