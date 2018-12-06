package week01.exercise04;

import java.util.logging.Logger;

/**
 * Longest Word
 *
 * Take the _text_ parameter being passed and return the longest word in the string.
 * If there are two or more words that are the same length, return the first word from the string with that length.
 * Ignore punctuation and assume _text_ will not be empty.
 *
 */
public class Exercise04 {
    //private static final Logger log = Logger.getLogger( Exercise04.class.getName() );


    public String cleanText(String parameterTextCleanText){

        parameterTextCleanText = parameterTextCleanText.replaceAll("&", "");
        parameterTextCleanText = parameterTextCleanText.replaceAll("!", "");

        return parameterTextCleanText;//verbindung herstellen fuer beide Methoden
    }

    public String run(String parameterTextRun) {
        //log.info(String.format("Run(\"%s\")", text));
        parameterTextRun = cleanText(parameterTextRun);
        //ich rufe die Methode getWords auf und übergebe den Wert von ParameterTextRun,
        // danach weise  ich den Rückgabewert von getWords der variabeln Liste zu.
        String[] liste = getWords(parameterTextRun);
        // Zaehle Buchstaben
        int indexzaehler=0;
        int vorherigeLaenge = 0;
        String hilfsVariabel = "";
        for(; indexzaehler < liste.length; indexzaehler++) {
            //System.out.println(indexzaehler);
            String aktuellerWert = liste[indexzaehler];
            //System.out.println(aktuellerWert);
            liste[indexzaehler].length();
            //System.out.println(aktuellerWert.length());
            if (aktuellerWert.length() > vorherigeLaenge) {
                hilfsVariabel = aktuellerWert;
                vorherigeLaenge = aktuellerWert.length();


            }

        }

        // Vergleiche Anzahl Buchstaben

        return hilfsVariabel;
    }

    public String[] getWords(String parameterTextGetWords) {
            String[] arrayOfWords = parameterTextGetWords.split(" ");


        return arrayOfWords;

    }


}
