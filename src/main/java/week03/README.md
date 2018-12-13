### Exercise 12 -
Einführung
Java ist eine komplexe und mächtige Programmiersprache mit der man viele Informatikprobleme lösen kann. Doch wie weit kann man den Befehlssatz einer Sprache reduzieren, ohne dass diese die Eigenschaft verliert, beliebige mathematische Probleme zu lösen? Diese spezielle Eigenschaft wird Turing-Vollständigkeit genannt. Alle Programmiersprachen sind für gewöhnlich turingvollständig, was bedeutet, dass sie jedes berechenbare Problem lösen können. Zu diesen Problemen zählen zum Beispiel sämtliche mathematische Probleme, aber auch Probleme die eher struktureller Natur sind, also auch das Suchen von Einträgen in einer Kontaktliste (nein, der Weltfrieden ist leider nicht berechenbar).

Brainfuck ist eine Programmiersprache, die ebenfalls turingvollständig ist, allerdings nur aus acht Befehlen besteht. In dieser Aufgabe könnt ihr selbst einen auf einer Turingmaschine basierten Interpreter für eine eigene kleine Sprache schreiben, die man in einen weiteren Schritt Brainfuck-kompatibel machen kann und damit auch turingvollständig.

Aufgabenstellung
In dieser Aufgabe bauen wir uns eine simple Turingmaschine, welche vorgegebenen Programmcode einer eigenen Sprache lesen und auswerten soll. Die Turingmaschine besitzt dabei nur ein Arbeitsband (workingTape) der Länge 10. Es existiert ein Lese/Schreibe-Kopf (head), der über das workingTape gleiten kann, dort Werte ändern und Werte ausgeben soll. Bewegt sich der Kopf über ein Ende des Arbeitsbandes hinaus, so taucht er auf der anderen Seite wieder auf (wenn also z.B der head von Feld 10 auf das 11. Feld bewegt wird, dann soll er wieder auf das 1. zeigen).

Die Maschine selbst wird durch einen einfachen Programmcode gesteuert, der aus 5 Befehlen besteht:
```
> Dieser Befehl bewegt den head ein Feld nach rechts
< Dieser Befehl bewegt den head ein Feld nach links
+ Dieser Befehl erhöht den Wert des aktuellen Feldes um 1
- Dieser Befehl verringert den Wert aktuelles Feldes um 1
# Dieser Befehl gibt den aktuellen Wert auf der Konsole aus
Der Programmcode der die Turingmaschine steuert, soll in einem Array namens sourceCode stehen, der Code soll Schritt für Schritt durchgegangen und ausgeführt werden. Auf dem Arbeitsband werden Werte vom Typ char gespeichert, die anfangs alle den Wert 'a' haben. Der head zeigt am Anfang auf das erste Feld auf dem workingTape.

Hinweis 1: char-Werte werden intern als Zahlenwerte gespeichert, deshalb könnt ihr ohne Probleme sowas wie char example = (char)('a'+1); schreiben, dies nennt man casten. Wenn ihr wissen wollt, welche Zeichen durch welche Zahlen repräsentiert werden, dann schaut in die ASCII-Tabelle.

Jetzt solltet ihr auch in der Lage sein, mit eurer eigenen Turingmaschine ein "Hello World"-Programm zu schreiben. Wenn ihr eure Turingmaschine eigenständig erweitern wollt, dann schaut euch die Sprache Brainfuck an. Brainfuck ist eine Programmiersprache, welche ähnlich arbeitet wie unsere Turingmaschine in dieser Aufgabe.

Hinweis 2: Zum Testen verwendet einfach diese Initialisierung der Variable Source-Code. Wenn ihr alles richtig gemacht habt, dann sollten die Buchstaben a, b und c ausgegeben werden. Die Schreibweise mit den geschweiften Klammern und den Kommawerten legt automatisch ein Array an und füllt es mit den beschriebenen Werten (Deklaration & Initialisierung in einem Schritt):

char[] sourceCode = {'#', '+', '#', '+', '#'};
```
### Exercise 13 -
Inhaltsverzeichnis
1 Rennschnecke
2 Rennen
3 Wettbüro
4 Zusatz
5 Kommentare
5.1 Felix S.
Rennschnecke
Erstelle eine Klasse "Rennschnecke"
Rennschnecken sollen folgende Eigenschaften(Objektvariablen) besitzen:
einen Namen
eine Rasse
eine Maximalgeschwindigkeit (Veränderung der Strecke pro Schritt)
die Schnecke soll wissen welchen Weg sie bereits zurück gelegt hat
Erstelle für die Klasse Rennschnecke einen Konstruktor, der den Instanzvariablen beim Erstellen einer neuen Instanz (Objekt zu dieser Klasse) Werte zuweist.
Lege in der Klasse "Rennschnecke" eine Methode "krieche()" an, welche die Schnecke abhängig von ihrer Maximalgeschwindigkeit eine zufällige Strecke weiter bewegt. Soll heißen: Sie kriecht eine zufällige Strecke größer null und kleiner ihrer Maximalgeschwindigkeit. Nimm als Zeiteinheit 1 an.
Tipp: Schaut euch die Methode Math.random() aus der Java API an.
Lege in der Klasse "Rennschnecke" eine Methode "public String toString()" an, welche die Daten der Schnecke mit return als String zurückgibt.
Teste deine Klasse, indem du probehalber ein Rennschneckenobjekt erzeugst und seine Daten auf der Konsole ausgibst.
Tipp:Verwende zum Ausgeben der Daten die toString() Methode der Rennschnecke.
Rennen
Erstelle eine Klasse "Rennen"
Ein Rennen hat folgende Eigenschaften:
einen Namen
die Anzahl der teilnehmenden Schnecken
die teilnemenden Schnecken selbst, als:
Array: einfachere Umsetzung mit konstanter Teilnehmerzahl
ArrayList: schönere Umsetzung mit variabler Teilnehmerzahl
Tipps:
Verwende als Datentyp ArrayList<Rennschnecke>
Verwende beim Erstellen new ArrayList<Rennschnecke>()
die Länge der zu kriechenden Strecke
Überlege dir, welche dieser Werte bereits im Konstruktor gesetzt werden sollten.
Lege in der Klasse "Rennen" eine Methode "void addRennschnecke(Rennschnecke neueSchnecke)" an, welche dem Rennen eine Schnecke hinzufügt.
Lege in der Klasse "Rennen" eine Methode "void removeRennschnecke(String name)" an, welche eine Schnecke aus dem Rennen entfernt. (nicht so einfach und kann erstmal übersprungen werden)
Lege in der Klasse "Rennen" eine Methode "public String toString()" an, welche die Daten des Rennens mit return als String zurückgibt.
Tipp: Um die Daten der beteiligten Schnecken zurückzugeben, könnt ihr deren toString() Funktion benutzen.
Teste deine Klasse vom Hauptprogramm aus!
Lege in der Klasse "Rennen" eine Methode "Rennschnecke ermittleGewinner()" an, welche null zurückliefert, wenn noch keine der teilnemenden Schnecken das Ziel erreicht hat und anderenfalls die Gewinnerschnecke zurückgibt.
Lege in der Klasse "Rennen" eine Methode "void lasseSchneckenKriechen()" an, welche alle teilnemenden Schnecken einmal kriechen lässt.
Lege in der Klasse "Rennen" eine Methode "void durchfuehren()" an, welche so lange lasseSchneckenKriechen() aufruft, bis eine der Schnecken das Ziel erreicht hat.
Tipp: Ob eine Schnecke im Ziel angekommen ist, kannst du mit deiner Methode ermittleGewinner() herrausfinden.
Wettbüro
Erstelle eine Klasse Wettbuero.
Ein Wettbuero hat die folgenden Eigenschaften:
Es weiß, für welches Rennen es seine Wetten entgegennimmt.
Es verfügt über eine Liste (z.B. eine ArrayList) von angenommenen Wetten.
Es hat einen festen Faktor, mit welchem Wetteinsätze bei einem Gewinn multipliziert werden.
Lege in der Klasse "Wettbuero" eine Methode "wetteAnnehmen(String schneckenName, int wettEinsatz, String spieler)" an, welche eine Wette entgegennimmt. Die Wette ist bezogen auf eine Schnecke für das Rennen, das von dem Büro bearbeitet wird.
Um die einzelnen Wetten speichern zu können, sollten ihre Daten in eigenen Objekten der Klasse "Wette" gespeichert werden. Erstellt euch diese Klasse selbst.
Tipp: Denkt an toString().
Lege in der Klasse "Wettbuero" eine Methode "rennenDurchfuehren()" an, welche das betreute Rennen durchfuert.
Lege in der Klasse "Wettbuero" eine Methode "toString()" an, welche die Daten des Wettbueros, die Daten des Rennens sowie sämtliche abgeschlossende Wetten als String zurückgibt.
Teste dein Programm!
Tausche die Klasse Rennen mit einem Kommilitonen, der ebenfalls bereits fertig ist.
Sollten eure Programme immer noch laufen?
Treten Fehler auf? Wenn ja: ändert eure Programme so ab, dass ihr problemlos Klassen austauschen könnt.
Zusatz
Es gibt noch ein paar Dinge, die in unserem Wettbüro nicht so laufen wie sie sollten. Macht sie besser.

Dieselbe Schnecke kann in ein Rennen zweimal eingetragen werden.
Es können negative Wetten abgeschlossen werden.
Gehen zwei Schnecken gleichzeitig durchs Ziel, wird die Schnecke ausgegeben, auf die die Suche nach dem Gewinner zuerst stößt. Das ist ganz schön ungerecht.

### Exercise xx - Double Linked List

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