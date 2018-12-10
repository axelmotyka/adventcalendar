package week01.exercise09;

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

        int len = text.length();
        int letterLen = 0;
        char[] charArray = new char[len];

        for (int i=0; i<len; i++)
            if (Character.isLetter(text.charAt(i)))
                charArray[letterLen++] = text.charAt(i);

        quickSort(charArray,0, letterLen-1);
        return String.valueOf(charArray, 0, letterLen);
    }

    // slightly modified, but 95% copied from http://www.linux-related.de/index.html?/coding/sort/sort_quick.htm
    void quickSort(char a[], int l, int r){		//a=Array, l=linker Rand, r=rechter Rand
        if(r>l){					//solange mehr als 1 Folgenelement existiert
            int i=l-1, j=r;
            char tmp;			//Variableninitialisierung mit Folgenrändern
            for(;;){				//Endlosschleife; bricht ab, wenn i>=j
                while(a[++i]<a[r]);			//inkrem., bis größeres  Element gefunden wird
                while(a[--j]>a[r] && j>i);		//dekrem., bis kleineres Element gefunden wird
                if(i>=j) break;			//brich ab, wenn sich die Folgenzeiger treffen
                tmp=a[i]; a[i]=a[j]; a[j]=tmp;	//tausche kleineres mit größerem Element
            }
            tmp=a[i]; a[i]=a[r]; a[r]=tmp;		//tausche Trennelement

            quickSort(a, l, i-1);			//rekursiver Aufruf für linke Teilfolge
            quickSort(a, i+1, r);			//rekursiver Aufruf für rechte Teilfolge
        }
    }
}
