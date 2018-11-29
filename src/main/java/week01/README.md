# DevAcademy Practices
Um die Aufgaben erfolgreich durchzuführen, gibt es ein sehr gutes Buch zum Thema [Java ist auch eine Insel](http://openbook.rheinwerk-verlag.de/javainsel/)

Ich habe eine kurze [Learn Java in 42 Minutes](./LearnJavain42minutes.pdf) erstellt. Dort stehen alle wichtigen Grundlagen zu Java drin. Sollte etwas fehlen, oder unverständlich sein, oder fehlerhaft... Meldet es!

Die Aufgaben entsprechen ähnlichen Aufgaben aus dem Bereich "Programmieren I", sollen also Grundlagen der Programmierung vermitteln.
Um diese Grundlagen zu erlernen, könnt Ihr natürlich alle Hilfsmittel verwenden - ob Ihr damit auch wirklich lernt?

Meine Empfehlung:
* Nutzt kein Google, Youtube, Stackoverflow, etc!
* Erarbeitet Euch die Aufgaben mittels Java Büchern, wie [Java ist auch eine Insel](http://openbook.rheinwerk-verlag.de/javainsel/), selbst!
* Setzt Euch eine Deadline für die Aufgabe!
* Kopierte Lösung sind klar zu sehen und bringen Euch nicht weiter!

## Week 1 - 03.12. - 07.12.

### Exercise 01 - Test for "Hello DevAcademy!"
Return `"HelloDevAcademy"` and assert the result in test `Exercise01Test`.

### Exercise 02 - Letter Capitalize
Take the _text_ parameter being passed and capitalize the first letter of each word. Words will be separated by only one space.

### Exercise 03 - Time Convert
Take the _time_ parameter being passed and return the number of hours and minutes the parameter converts to (ie. if num = `63` then the output should be `1:3`). Separate the number of hours and minutes with a colon.

### Exercise 04 - Longest Word
Take the _text_ parameter being passed and return the longest word in the string. If there are two or more words that are the same length, return the first word from the string with that length. Ignore punctuation and assume _text_ will not be empty.
  
### Exercise 05 - Letter Changes
Take the _text_ parameter being passed and modify it using the following algorithm. Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a). Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string.

### Exercise 06 - Multiply matrixes
Multiply two matrixes as 2-dimensional-array and save the result in an additional 2-dimensional-array. 
Additionally you must implement the unit test!
```
|A11 A12 A13|       |B11 B12 B13|       |A11*B11 A12*B12 A13*B13|
|A21 A22 A23|   x   |B21 B22 B23|   =   |A21*B21 A22*B22 A23*B23|
|A31 A32 A33|       |B31 B32 B33|       |A31*B31 A32*B32 A33*B33|

|A11 A12 A13 A14 A15|       |B11 B12 B13 B14 B15|       |A11*B11 A12*B12 A13*B13 A14*B14 A15*B15|
|A21 A22 A23 A24 A25|       |B21 B22 B23 B24 B25|       |A21*B21 A22*B22 A23*B23 A24*B24 A25*B25|
|A31 A32 A33 A34 A35|   x   |B31 B32 B33 B34 B35|   =   |A31*B31 A32*B32 A33*B33 A34*B34 A35*B35|
|A41 A42 A43 A44 A45|       |B41 B42 B43 B44 B45|       |A41*B41 A42*B42 A43*B43 A44*B44 A45*B45|
|A51 A52 A53 A54 A55|       |B51 B52 B53 B54 B55|       |A51*B51 A52*B52 A53*B53 A54*B54 A55*B55|
```
### Exercise 07 - Caesar cipher
The Caesar cipher is one of the earliest known and simplest ciphers. It is a type of substitution cipher in which each letter in the plaintext is 'shifted' a certain number of places down the alphabet. For example, with a shift of an offset of `1`, `A` would be replaced by `B`, `B` would become `C`, and so on. 
The method is named after Julius Caesar, who apparently used it to communicate with his generals.
Implement and test the following functions:
```
    /**
     * Generate the cipher as a HashMap.
     * @param offset offset for the alphabet cipher
     * @return HashMap, Like: {[a]=[c], [b]=[d], [c]=[e]}
     */
    public HashMap<String,String> generateCipher(int offset) {
        return new HashMap<String,String>();
    };

    /**
     * Encrypts a unencrypted String with the given cipher.
     * @param message
     * @return
     */
    public String encryptString(String message, HashMap cipher) {
        return new String();
    }

    /**
     * Decrypts a encrypted String with the given cipher
     * @param encryptedMessage
     * @return
     */
    public String decryptString(String encryptedMessage, HashMap cipher) {
        return new String();
    }

    /**
     * Generates a cipher and encrypts the given message.
     * @param offset
     * @return
     */
    public String run(int offset, String message) {
        return new String();
    }
```

### Exercise 08 - Bubblesort
Sort the int array by using your own implementation of an BubbleSort algorithm.
_Eine Reihe von Zahlen sollen aufsteigend sortiert werden. Schrittweise werden je zwei Zahlen miteinander verglichen. Ist die erste Zahl größer als die Zweite, tauschen die beiden Zahlen ihre Position und die größere Zahl wird wieder mit dem nächsten Element verglichen. Ist man ganz rechts angekommen, geht es einfach wieder von vorn los, so lange, bis alle Zahlen in der richtigen Reihenfolge sind.
Es ist zu beachten, dass die größte Zahl bereits nach dem ersten Durchlauf ganz rechts steht. Da diese also nicht noch einmal betrachtet werden muss, endet die zweite Bubble-Runde schon mit dem Vergleichen des vorletzten Elements. Dieses muss dann wiederum in der darauffolgenden Runde nicht mehr betrachtet werden. Somit muss mit jeder weiteren Runde ein Element weniger verglichen werden. Siehe_ https://en.wikipedia.org/wiki/Bubble_sort#Step-by-step_example _

### Exercise 09 - Quicksort
Take the _str_ string parameter being passed and return the string with the letters in alphabetical order (ie. `hello` becomes `ehllo`). Spaces, numbers and punctuation symbols will not be included in the sorted string. Implement your own QuickSort.
_A good overview can be found here_ http://www.linux-related.de/index.html?/coding/sort/sort_quick.htm

### Exercise 10 - String Calculator Interpreter
Write a small calculator application, which takes a String and computes the result.
The following arithmetic operations are allowed: `+`, `-`, `*`, `/`, `^2(x)` and `sqr(x)`.
Check the right order by using parentheses. 
The result should be rounded off to the second decimal place.

Setup a function for every aritmethic operation and write tests for them.
The input are Strings like this:
*  `"1+1"` = `2`
*  `"10 * 20 + 30"` = `230`
*  `"10 * (20 + 30)"`= `500`
*  ... complete the tests!