package week01.exercise10;

import java.util.ArrayList;
import java.util.regex.Pattern;

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
    public String type;
    String result = "";


    public int run(String calculate) {
        int numberCount = 0;

        String[] newCalculate = calculate.split("");
        ArrayList<String> calculateArrayList = new ArrayList<>();

        //System.out.println(newCalculate);
        for (String word : newCalculate) {
            if (Pattern.matches("[0-9]", word) ||
                    word.equals("+") ||
                    word.equals("-") ||
                    word.equals("*") ||
                    word.equals("/") ||
                    word.equals("(") ||
                    word.equals(")")) {
                calculateArrayList.add(word);
            }
/*            try {
                if(!(calculateArrayList.size()%2==0)){
                    boolean isOdd=true;
                }
            }
            catch (ExceptionInInitializerError exception){
                System.out.println("This is not a math term!");
            }*/

            if (calculateArrayList.contains("(")) {
                type = "brace";
                numberCount = 0;
            } else if (Pattern.matches("[0-9]", word) && numberCount != 0) {
                int index = calculateArrayList.lastIndexOf(word) - 1;
                String oldNum = calculateArrayList.get(index);
                calculateArrayList.set(calculateArrayList.indexOf(word) - 1, oldNum += word);
                calculateArrayList.remove(index + 1);
            } else if (Pattern.matches("[0-9]", word)) {
                numberCount++;
                //continue;
            } else if (calculateArrayList.contains("*")) {
                type = "multi";
            } else if (calculateArrayList.contains("/")) {
                type = "div";
                numberCount = 0;
            } else if (calculateArrayList.contains("+")) {
                type = "add";
                numberCount = 0;
            } else if (calculateArrayList.contains("-")) {
                type = "min";
                numberCount = 0;
            } else {
                numberCount = 0;
            }


        }

        switch (type) {
            case "brace":
                int start = calculateArrayList.indexOf("(");
                int end = calculateArrayList.lastIndexOf(")");
                if (calculateArrayList.subList(start, end).size() > 1) {
                    String newMath = "";
                    for (String word : calculateArrayList.subList(start+1, end)
                    ) {
                        newMath += word;
                    }
                    String result = braceCalculation(newMath);

                    calculateArrayList.subList(start, end).set(0, result);
                    while(calculateArrayList.size()>3) {
                        calculateArrayList.remove(3);
                    }
                }

            case "multi":
                result = "";
                int multi = calculateArrayList.indexOf("*");
                int a = Integer.parseInt(calculateArrayList.get(multi - 1));
                int b = Integer.parseInt(calculateArrayList.get(multi + 1));

                int c = a * b;
                result += c;

                calculateArrayList.remove(multi);
                calculateArrayList.remove(multi);
                calculateArrayList.set(multi - 1, result);
                if (calculateArrayList.size() > 1) {
                    String newMath = "";
                    for (String word : calculateArrayList
                    ) {
                        newMath += word;
                    }
                    run(newMath);
                }
                break;

            case "div":
                result = "";
                int div = calculateArrayList.indexOf("/");
                a = Integer.parseInt(calculateArrayList.get(div - 1));
                b = Integer.parseInt(calculateArrayList.get(div + 1));

                int d = a / b;
                result += d;

                calculateArrayList.remove(div);
                calculateArrayList.remove(div);
                calculateArrayList.set(div - 1, result);
                if (calculateArrayList.size() > 1) {
                    run(calculateArrayList.toString());
                }
                break;

            case "add":
                result = "";
                int add = calculateArrayList.indexOf("+");
                a = Integer.parseInt(calculateArrayList.get(add - 1));
                b = Integer.parseInt(calculateArrayList.get(add + 1));

                int e = a + b;
                result += e;
                calculateArrayList.remove(add);
                calculateArrayList.remove(add);
                calculateArrayList.set(add - 1, result);
                if (calculateArrayList.size() > 1) {
                    run((String) (calculateArrayList.toString()));
                }
                break;

            case "minus":
                result = "";
                int minus = calculateArrayList.indexOf("-");
                a = Integer.parseInt(calculateArrayList.get(minus - 1));
                b = Integer.parseInt(calculateArrayList.get(minus + 1));

                int f = a - b;
                result += f;

                calculateArrayList.remove(minus);
                calculateArrayList.remove(minus);
                calculateArrayList.set(minus - 1, result);
                if (calculateArrayList.size() > 1) {
                    run((String) (calculateArrayList.toString()));
                }
                break;
        }
        return (Integer.parseInt(result));
    }

/*    public String braceCalculation(String newMath) {
        String result = "";
        newMath.replace("(","");
        newMath.replace(")","");
        result += run(newMath);
        return result;
    }*/



    private String braceCalculation(String newMath) {
        String result = "";

        int a = run(newMath);
        result += a;
        return result;
    }
}