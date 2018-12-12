package week01.exercise08;


/**
 * BubbleSort
 * <p>
 * Sort the int array by using your own implementation of an BubbleSort algorithm.
 */
public class Exercise08 {

    public static int[] run(int[] arrayZuSortieren) {

        int temp;

        for (int i = 1; i < arrayZuSortieren.length; i++) {

            //System.out.println("Schleifendurchgang "+arrayZuSortieren[i]);
            //400, 33, 200, 66, 100, 99, 300

            for (int j = 0; j < arrayZuSortieren.length - i; j++) {
                //ystem.out.println("Vergleiche " + arrayZuSortieren[j]);
                if (arrayZuSortieren[j] > arrayZuSortieren[j + 1]) {

                    temp = arrayZuSortieren[j];
                    arrayZuSortieren[j] = arrayZuSortieren[j + 1];
                    arrayZuSortieren[j + 1] = temp;
                }
            }
        }
        return arrayZuSortieren;
    }


}
