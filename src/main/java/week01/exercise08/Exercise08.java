package week01.exercise08;


/**
 * BubbleSort
 *
 * Sort the int array by using your own implementation of an BubbleSort algorithm.
 */
public class Exercise08 {

    int[] intArray;
    int cycleCount = 0;

    public int[] run(int[] intArray) {
        this.intArray = intArray;

        //bubbleSortSimple();
        bubbleSortOptimized();

        return this.intArray;
    }

    private void bubbleSortSimple() {
        /* Pseudo Code example
        procedure bubbleSort( A : list of sortable items )
            n = length(A)
            repeat
                swapped = false
                for i = 1 to n-1 inclusive do
                    if A[i-1] > A[i] then
                        swap(A[i-1], A[i])
                        swapped = true
                    end if
                end for
                n = n - 1
            until not swapped
        end procedure
        */
        printIntArray("START");

        int n = intArray.length;
        boolean swapped = false;
        do {
            swapped = false;
            for(int i = 1; i < n; i++) {
                cycleCount++;
                if(intArray[i-1] > intArray[i]) {
                    swap(i-1, i);
                    swapped = true;
                }
            }
            printIntArray("\tNext");
        } while (swapped);

        printIntArray("END");
        System.out.println("We needed " + cycleCount + " comparisons to sort the Array!");
    }

    private void bubbleSortOptimized() {
        /*
        procedure bubbleSort( A : list of sortable items )
            n = length(A)
            repeat
                newn = 0
                for i = 1 to n-1 inclusive do
                    if A[i-1] > A[i] then
                        swap(A[i-1], A[i])
                        newn = i
                    end if
                end for
                n = newn
            until n <= 1
        end procedure
        */
        printIntArray("START");

        int n = intArray.length;
        int newn;
        do {
            newn = 0;
            for(int i = 1; i < n; i++) {
                cycleCount++;
                if(intArray[i-1] > intArray[i]) {
                    swap(i-1, i);
                    newn = i;
                }
            }
            n = newn;
            System.out.println("\tn=" + n);
        } while(n >= 1);

        printIntArray("END");
        System.out.println("We needed " + cycleCount + " cycles to sort the Array!");
    }

    private void swap(int i, int j) {
        int temp = intArray[j];
        intArray[j] = intArray[i];
        intArray[i] = temp;
        printIntArray("\t\tswap");
    }

    private void printIntArray(String message) {
        StringBuilder builder = new StringBuilder();

        if(message != null) {
            builder.append(message + " ");
        }

        int i = 0;
        for(int value : intArray) {
            builder.append("[" + i + "]" + intArray[i] + "\t");
            i++;
        }
        System.out.println(builder);
    }
}
