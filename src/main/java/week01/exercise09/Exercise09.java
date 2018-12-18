package week01.exercise09;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

/**
 * Quicksort
 * Take the _str_ string parameter being passed and return the string with the letters in 
 * alphabetical order (ie. `hello` becomes `ehllo`). Spaces, numbers and punctuation symbols 
 * will not be included in the sorted string. 
 * Implement your own QuickSort.
 */
public class Exercise09 {
    private static final Logger log = Logger.getLogger( Exercise09.class.getName() );

    public String run(String text) {
        log.info(String.format("Run(\"%s\")", text));
        int l = 0;
        int r = 0;


        ArrayList<Integer> textCleanNums = new ArrayList<>(1);
        text.replaceAll("[\\p{Punct}]", "");
        text.replaceAll(" ", "");
        char[] characters = text.toCharArray();
        for (char letter : characters) {
            textCleanNums.add((int) letter);

        }
        // text.replace("[\\p{Punct}]","");
        System.out.println(textCleanNums);
        quicksort(textCleanNums,l,r);

    public void quicksort(int[] a, l, r){		//a=Array, l=linker Rand, r=rechter Rand
            if(r>l){					//solange mehr als 1 Folgenelement existiert
                int i=l-1, j=r, tmp;			//Variableninitialisierung mit Folgenrändern
                for(;;){				//Endlosschleife; bricht ab, wenn i>=j
                    while(a[++i]<a[r]);			//inkrem., bis größeres  Element gefunden wird
                    while(a[--j]>a[r] && j>i);		//dekrem., bis kleineres Element gefunden wird
                    if(i>=j) break;			//brich ab, wenn sich die Folgenzeiger treffen
                    tmp=a[i]; a[i]=a[j]; a[j]=tmp;	//tausche kleineres mit größerem Element
                }
                tmp=a[i]; a[i]=a[r]; a[r]=tmp;		//tausche Trennelement

                quicksort(a, l, i-1);			//rekursiver Aufruf für linke Teilfolge
                quicksort(a, i+1, r);			//rekursiver Aufruf für rechte Teilfolge
            }
        return new String();
        }
    }
}
