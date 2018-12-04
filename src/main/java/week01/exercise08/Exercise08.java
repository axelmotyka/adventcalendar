package week01.exercise08;


/**
 * BubbleSort
 *
 * Sort the int array by using your own implementation of an BubbleSort algorithm.
 */
public class Exercise08 {

    public int[] run(int[] toSort) {

        int len = toSort.length;

        for (int i=0; i<(len-1); i++) {
            for (int j=0; j<len-1-i; j++) {
                if (toSort[j] > toSort[j+1]) {
                    int temp = toSort[j+1];
                    toSort[j+1] = toSort[j];
                    toSort[j] = temp;
                }
            }
        }
        return toSort;
    }

}
