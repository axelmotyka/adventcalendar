package week01.exercise02;


import java.util.logging.Logger;

/**
 * Letter Capitalize
 * <p>
 * Take the _text_ parameter being passed and capitalize the first letter of each word.
 * Words will be separated by only one space.
 * <p>
 * <p>
 * durchlauf mir den string mit einer for-schleife und gib mir den string aus
 * suche mir in dem string nach leerzeichen
 * wenn leerzeichen gefunden, den darauffolgenden Buchstaben groß machen
 * String text = "Hello devAcademy this text should be capitalized";
 * <p>
 * <p>
 * // Suche Wort
 * // Ersten Buchstaben gross
 * //             zurückgeben
 */

public class Exercise02 {

    public String searchWord(String text) {
        char[] buchstaben = text.toCharArray();// Wandle String in ein Array von Buchstaben um
        for (int i = 0; i < buchstaben.length; i++) {
            char buchstabe = buchstaben[i];// Leerstelle suchen
            if (buchstabe == ' ') {
                System.out.println("Leerzeichen gefunden!");
                i++;
                buchstaben[i] = Character.toUpperCase(buchstaben[i]);//Mache Buchstaben an i groß
            }
        }
        return new String(buchstaben);
    }
}

/**
 public String searchWordSplit(String text){

 //teile text nach worten auf
 String[] liste = text.split(" ");

 for(i=0; i < liste.length; i++){
 //erster Buchstabe holen
 //buchstabe to uppercase
 //buchstabe in wort einsetzen
 String aktuellesWort = liste(i);
 char ersterBuchstabe = aktuellesWort.charAt(0);
 string suchenderBuchstabe = String.valueOf(ersterBuchstabe);
 String ersetzer = String.valueOf(Character.toUpperCase(ersterBuchstabe));
 liste[i] = aktuellesWort.replaceFirst(String.valueOf(ersterBuchstabe), Character.toUpperCase(ersterBuchstabe));
 }

 // alle worte haben großbuchstaben am anfang
 String neuerString = String.join(" ", liste);

 return neuerString




 liste(i).toUpperCase();

 return new String();
 }


 }
 }


 private static final Logger log = Logger.getLogger(Exercise02.class.getName());

 public String run(String text) {
 log.info(String.format("Run(\"%s\")", text));


 for (int index = 0; index < text.length(); index++) {

 char buchstabe = text.charAt(index);

 if (Character.isWhitespace(buchstabe)) {
 index++;
 }

 System.out.println(text.toLowerCase());
 System.out.println('_');
 System.out.println(buchstabe);

 }
 return text;

 }
 */










