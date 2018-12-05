package week01.exercise02;


import java.util.logging.Logger;

/**
 * Letter Capitalize
 * <p>
 * Take the _text_ parameter being passed and capitalize the first letter of each word.
 * Words will be separated by only one space.
 */
public class Exercise02 {

    public String searchWord(String text) {

        // Wandle String in ein Array von Buchstaben um
        char[] buchstaben = text.toCharArray();

        for (int i = 0; i < buchstaben.length; i++) {
            // Leerstellen suchen
            char buchstabe = buchstaben[i];
            if (buchstabe == ' ') {
                i = i + 1;
                // mache Buchstaben an i groß
                buchstaben[i] = Character.toUpperCase(buchstaben[i]);
            }
        }

        return new String(buchstaben);
    }

    public String searchWordSplit(String text) {

        // Teile text nach Worten auf
        String[] liste = text.split(" ");

        for(int i=0; i < liste.length; i++) {
            // ersten Buchstaben holen
            // buchstabe.toUpperCase()
            // buchstabe in Wort einsetzen
            String aktuellesWort = liste[i];
            char ersterBuchstabe = aktuellesWort.charAt(0);
            String suchBuchstabe = String.valueOf(ersterBuchstabe);
            String ersetzer = String.valueOf(Character.toUpperCase(ersterBuchstabe));
            liste[i] = aktuellesWort.replaceFirst(suchBuchstabe, ersetzer);
        }
        //alle Worte haben grossbuchstaben am anfang
        String neuerString = String.join(" ", liste);

        return neuerString;
    }
}
