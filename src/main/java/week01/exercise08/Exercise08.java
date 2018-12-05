package week01.exercise08;


/**
 * BubbleSort
 *
 * Sort the int array by using your own implementation of an BubbleSort algorithm.
 */
public class Exercise08 {
    public int[] run(int[] intArray)
    {
        int buffer=0;


        for (int x=0 ; x < intArray.length; x++) {
            for (int i = 0; i < intArray.length - 1 -x; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    buffer = intArray[i + 1];
                    intArray[i + 1] = intArray[i];
                    intArray[i] = buffer;
                }

            }
        }

        return intArray;
    }

}
