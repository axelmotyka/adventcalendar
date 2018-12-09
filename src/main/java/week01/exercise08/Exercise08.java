package week01.exercise08;


/**
 * BubbleSort
 *
 * Sort the int array by using your own implementation of an BubbleSort algorithm.
 */

public class Exercise08 {

    public int[] run(int[] intArray) {

    boolean swapped=false;
    //int[] swappedArray = new int[intArray.length];
    while (swapped == false){
        for (int j=1; j< intArray.length; j++){
        for (int i=0; i< intArray.length-j; i++){
            int x = i+1;


            int a = intArray[i];
            int b = intArray[x];
            /* if this pair is out of order */
            if (a > b) {
                /* swap them and remember something changed */
                intArray[x]=a;
                intArray[i]=b;
            }
            else {
                continue;
            }
        }
            swapped = true;
        }

    }
    return intArray;

}}
