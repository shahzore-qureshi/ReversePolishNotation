# Reverse Polish Notation
Simple implementation of a Reverse Polish Notation expression evaluator in Java

## Usage
Type in the following commands in a terminal:
(note: make sure that asterisk * is escaped via quotes)

```java
javac RPN.java
java RPN 2 2 +
>>> 2 + 2
>>> Result: 4
java RPN 2 2 + 7 "*"
>>> 2 + 2
>>> 7 * 4
>>> Result: 28
java RPN 6 9 3 / +
>>> 9 / 3
>>> 3 + 6
>>> Result: 9
```
