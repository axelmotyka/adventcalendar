package week01.exercise08;


/**
 * BubbleSort
 *
 * Sort the int array by using your own implementation of an BubbleSort algorithm.
 */
public class Exercise08 {

    public int[] run(int[] intArray) {
        boolean notAnymoreChanged;

        do{
            notAnymoreChanged = true;

            for (int i = 0; i < intArray.length; i++) {
                boolean notTheBorder = i + 1 < intArray.length;

                if (notTheBorder) {
                    boolean valuesChanged = (intArray[i] > intArray[i + 1]);

                    if (valuesChanged) {
                        int temp = intArray[i];
                        intArray[i] = intArray[i + 1];
                        intArray[i + 1] = temp;

                        notAnymoreChanged = false;
                    }
                }
            }
        }while(!notAnymoreChanged);
    return intArray;
    }
}


