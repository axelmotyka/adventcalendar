package week01.exercise09;

import java.util.logging.Logger;

/**
 * Quicksort
 * Take the _str_ string parameter being passed and return the string with the letters in 
 * alphabetical order (ie. `hello` becomes `ehllo`). Spaces, numbers and punctuation symbols 
 * will not be included in the sorted string. 
 * Implement your own QuickSort.
 */
public class Exercise09_neu {
    private static final Logger log = Logger.getLogger( Exercise09_neu.class.getName() );

    public String run(String text) {
        log.info(String.format("Run(\"%s\")", text));
char[] textToCharr=text.toCharArray();
int[] textToInt=new int[textToCharr.length];
        for (int i = 0; i<textToCharr.length;i++
             ) {
            textToInt[i]=((int) (textToCharr[i]));
            System.out.println(textToInt[i]);
        }

        //text

        void quicksort(int[] textToInt, int l, int r){		//textToInt=Array, l=linker Rand, r=rechter Rand
            //textToInt= text.toCharArray();

            if(r>l){					        //solange mehr als 1 Folgenelement existiert
                int i= l-1, j=r, tmp;			//Variableninitialisierung mit Folgenrändern
                for(;;){				        //Endlosschleife; bricht ab, wenn i>=j
                    while(textToInt[++i]<textToInt[r]);			//inkrem., bis größeres  Element gefunden wird
                    while(textToInt[--j]>textToInt[r] && j>i);		//dekrem., bis kleineres Element gefunden wird
                    if(i>=j) break;			        //brich ab, wenn sich die Folgenzeiger treffen
                    tmp=textToInt[i]; textToInt[i]=textToInt[j]; textToInt[j]=tmp;	//tausche kleineres mit größerem Element
                }

                tmp=textToInt[i]; textToInt[i]=textToInt[r]; textToInt[r]=tmp;		//tausche Trennelement

                quicksort(textToInt, l, i-1);			//rekursiver Aufruf für linke Teilfolge
                quicksort(textToInt, i+1, r);			//rekursiver Aufruf für rechte Teilfolge
            }
        }

        String result= "";
        return result;
    }

    private void quicksort(Object o) {
        
    }

}
