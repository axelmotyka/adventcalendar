package week01.exercise09;

import java.util.logging.Logger;

/**
 * Quicksort
 * Take the _str_ string parameter being passed and return the string with the letters in
 * alphabetical order (ie. `hello` becomes `ehllo`). Spaces, numbers and punctuation symbols
 * will not be included in the sorted string.
 * Implement your own QuickSort.
 */
public class Exercise09_PairProgramming {
    private static final Logger log = Logger.getLogger(Exercise09.class.getName());
    String result = "";

    public String run(String text) {
        log.info(String.format("Run(\"%s\")", text));

        String cleanString = "";

        for (int m = 0; m < text.length(); m++) {

            if (Character.isLetter(text.charAt(m))) {
                cleanString += text.charAt(m);
            }
        }

        int[] cleanStringNums = new int[cleanString.length()];

        for (int k = 0; k < cleanString.length(); k++) {
            cleanStringNums[k] = ((int) cleanString.charAt(k));
        }

        for (int num : quicksort(cleanStringNums, 0, (cleanStringNums.length) - 1)) {
            result += (char) num;
        }
        System.out.println("TEST " + result);
        return result;

    }

    public int[] quicksort(int cleanStringNums[], int l, int r) {
        //String result = "";


        if (r > l) {
            int i = l - 1, j = r;
            int tmp;
            for (; ; ) {

                while (cleanStringNums[++i] < cleanStringNums[r]);
                while (cleanStringNums[--j] > cleanStringNums[r] && j > i);
                if (i >= j) {

                    break;
                }

                else {
                    tmp = cleanStringNums[i];
                    cleanStringNums[i] = cleanStringNums[j];
                    cleanStringNums[j] = tmp;

                }
            }


            tmp = cleanStringNums[i];
            cleanStringNums[i] = cleanStringNums[r];
            cleanStringNums[r] = tmp;

            quicksort(cleanStringNums, l, i - 1);
            quicksort(cleanStringNums, i + 1, r);
        }

        return cleanStringNums;
    }
}


