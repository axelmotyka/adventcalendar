package week01.exercise08;


/**
 * BubbleSort
 *
 * Sort the int array by using your own implementation of an BubbleSort algorithm.
 */
public class Exercise08 {

    public int[] run(int[] intArray) {
        // This boolean variable is needed to run the do-while-loop.
        boolean notAnymoreChanged;

        do{
            notAnymoreChanged = true; // Set the boolean variable to the value "true".

            for (int i = 0; i < intArray.length; i++) {
                boolean notTheBorder = i + 1 < intArray.length; // Don´t execute the code below, when i is the end-border.

                if (notTheBorder) {
                    boolean valuesChanged = (intArray[i] > intArray[i + 1]); // Check whether a number is greater than the following number.

                    if (valuesChanged) { // If compared values (numbers) are changed, then sort them to the right order.
                        int temp = intArray[i];
                        intArray[i] = intArray[i + 1];
                        intArray[i + 1] = temp;

                        notAnymoreChanged = false; // Change the value to "false" so the do-while-loop can continue.
                    }
                }
            }
        }while(!notAnymoreChanged);
    return intArray;
    }
}


