package week01.exercise10;

import java.util.HashMap;

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
    public int a;
    public int b;
    //public String operator;
    public String type;
    public int startindexOperation;
    public int endindexOperation;
    public int result;
    public int numberCount;

    public int run(String calculate) {

        HashMap<String, Integer> calculateIndex = new HashMap<>();

        //String[] newCalculate = {"+", "-", "*", "/"};
        //calculate.replaceAll(" ", "");
        //int x = 0;
        String[] newCalculate = calculate.split("");

        //String[] newCalculate = calculate.split("[\\d]");
        //String[] newCalculate = calculate.split("[^\\p{S}\\d]");
        //String[] numbers = calculate.split("[[\\p{Punct}]]");
        //System.out.println(numbers);
        System.out.println(newCalculate);
        for (int j = 0; j < newCalculate.length; j++) {
            //int k = j + 1;
            if (newCalculate[j] == "(") {
                numberCount=0;
                type = "brace";
                startindexOperation = j;
                for (int x = j; x < newCalculate.length; x++) {
                    if (newCalculate[x] == ")") {
                        numberCount=0;
                        endindexOperation = x;
                    } else {
                        continue;
                    }
                }
            }
            //startOperation(klammer);

            else if (newCalculate[j].equals("*")) {
                numberCount=0;
                a = newCalculate[j-1].charAt(0)-48;
                //operator = newCalculate[j];
                b = newCalculate[j+1].charAt(0)-48;
                result = (a * b);

                type = "multi";

                //startOperation(mal);

            } else if (newCalculate[j].equals("/")) {
                numberCount=0;
                a = newCalculate[j-1].charAt(0)-48;
                //operator = newCalculate[j];
                b = newCalculate[j+1].charAt(0)-48;
                calculateIndex.put("result"+(j-1), a/b);
                //result = (a / b);

                type = "div";

                //startOperation(teilung);


            } else if (newCalculate[j].equals("+")) {
                numberCount=0;
                a = ((char)(newCalculate[j-1].charAt(0)-48));
                //operator = newCalculate[j];
                b = ((char)(newCalculate[j+1].charAt(0)-48));
                calculateIndex.put("result"+(j), a+b);
                //result = (a + b);
                type = "add";

                //startOperation(plus);

            } else if (newCalculate[j].equals("-")) {
                numberCount=0;
                a = newCalculate[j-1].charAt(0)-48;
                //operator = newCalculate[j];
                b = newCalculate[j+1].charAt(0)-48;
                calculateIndex.put("result"+(j), a-b);
                //result = (a - b);

                type = "min";

                //startOperation(minus);

            } else {

if(j==0&&numberCount!=0){
    numberCount=1;
    calculateIndex.put("newNumber"+(0), newCalculate[j].charAt(0)-48);
    continue;
}
else{
    numberCount=+1;
    a = ((char)(newCalculate[j-1].charAt(0)-48))*10;
    b = ((char)(newCalculate[j].charAt(0)-48));
    calculateIndex.put("newNumber"+(j-1), a+b);
    //int newNumber=a+b;


}
                type = "number";
                continue;
                //startOperation(plus);

            }

        }

        return result;
    }
}