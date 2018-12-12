### Exercise 08 - Bubblesort
Sort the int array by using your own implementation of an BubbleSort algorithm.
_Eine Reihe von Zahlen sollen aufsteigend sortiert werden. Schrittweise werden je zwei Zahlen miteinander
verglichen. Ist die erste Zahl größer als die Zweite, tauschen die beiden Zahlen ihre Position und die größere Zahl
wird wieder mit dem nächsten Element verglichen. Ist man ganz rechts angekommen, geht es einfach wieder von vorn los,
so lange, bis alle Zahlen in der richtigen Reihenfolge sind.
Es ist zu beachten, dass die größte Zahl bereits nach dem ersten Durchlauf ganz rechts steht. Da diese also nicht
noch einmal betrachtet werden muss, endet die zweite Bubble-Runde schon mit dem Vergleichen des vorletzten Elements.
Dieses muss dann wiederum in der darauffolgenden Runde nicht mehr betrachtet werden. Somit muss mit jeder weiteren
Runde ein Element weniger verglichen werden. Siehe_ https://en.wikipedia.org/wiki/Bubble_sort#Step-by-step_example _