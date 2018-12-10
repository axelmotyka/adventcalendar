package week01.exercise08;


/**
 * BubbleSort
 *
 * Sort the int array by using your own implementation of an BubbleSort algorithm.
 */
public class Exercise08 {

    public int[] run(int[] intArray) {
        boolean hadToSort = true;
        int sortCounter = 0;
        while (hadToSort) {
            for (int i = 1; i < intArray.length; ++i) {
                int a = intArray[i - 1];
                int b = intArray[i];
                if (a > b) {
                    intArray[i - 1] = b;
                    intArray[i] = a;
                    hadToSort = true;
                    sortCounter += 1;
                    break;
                } else {
                    hadToSort = false;
                }
            }
        }
        System.out.println(String.format("Sorted %s times.",sortCounter));
        return intArray;
    }
}