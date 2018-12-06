### Exercise 10 - String Calculator Interpreter
Write a small calculator application, which takes a String and computes the result.
The following arithmetic operations are allowed: `+`, `-`, `*`, `/`, `^2(x)` and `sqr(x)`.
Check the right order by using parentheses. 
The result is always an Integer - also the result of a division is rounded to an integer.

Setup a method for every aritmethic operation and write tests for them.
The input are Strings like this:
*  `"1+1"` = `2`
*  `"10 * 20 + 30"` = `230`
*  `"10 * (20 + 30)"`= `500`
*  ... complete the tests!