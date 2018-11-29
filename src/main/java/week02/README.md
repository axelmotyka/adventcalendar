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

## Week 2 - 10.12. - 14.12.

**TBD**

### Exercise xx - Double Linked List

###  Exercise xx - Classes
* PlantUml
* Equal

### Exercise xx - Closest Enemy
**Update with classes**
Read the matrix of numbers stored in _stringArray_ which will be a 2D matrix that contains only the integers `1`, `0`, or `2`.
Then from the position in the matrix where a 1 is, return the number of spaces either left, right, down, or up you must move to reach an enemy which is represented by a 2. You are able to wrap around one side of the matrix to the other as well.

For example: if strArr is `["0000", "1000", "0002", "0002"]` then this looks like the following:
```
0 0 0 0

1 0 0 0

0 0 0 2

0 0 0 2
```
For this input your program should return 2 because the closest enemy (2) is 2 spaces away from the 1 by moving left to wrap to the other side and then moving down once. The array will contain any number of 0's and 2's, but only a single 1. It may not contain any 2's at all as well, where in that case your program should return a 0.