# Dice Game in Java

A simple console game where you compete against the computer by rolling a six-sided die. Choose how many rounds to play, and the game automatically rolls the dice, tracks the scores, and announces the winner.

This small Java project demonstrates console input, random numbers, loops, and conditional logic. It uses only the Java standard library, with no external dependencies.

## How it works

1. Enter a positive whole number for the number of rounds.
2. Each round, you and the computer receive a random roll from **1 to 6**.
3. The higher roll earns **1 point**. If the rolls match, **both players earn 1 point**.
4. After all rounds, the game displays both scores and announces a win, loss, or draw.

Scores count points earned per round, rather than the sum of the dice values. Individual rolls are not displayed in the current version.

## Getting started

Install a **Java Development Kit (JDK)** and make sure `java` and `javac` are available in your terminal.

### Run from the terminal

Clone the repository and open its directory:

```sh
git clone https://github.com/iBlackFoxprod/Dice-Game-Java.git
cd Dice-Game-Java
```

Compile and run:

```sh
javac -d out DiceGame.java
java -cp out DiceGame.DiceGame
```

The source declares the package `DiceGame`. The `-d out` option creates the matching package directory for the compiled class, and `DiceGame.DiceGame` is the full class name used to launch it.

### Run in an IDE

You can also use NetBeans, IntelliJ IDEA, Eclipse, or another Java IDE:

1. Create a Java project.
2. Create a package named `DiceGame` in the source directory.
3. Add `DiceGame.java` to that package.
4. Run the `DiceGame` class and enter the number of rounds in the console.

## Example session

```text
**********************************
How many rounds you want to play?:
**********************************
5
UserScore: 3
 BotScore: 2
You Won!
```

Results vary because the dice rolls are random.

## Current limitations

- Input is read as an integer without validation. Text or a number outside Java's `int` range causes an exception.
- Entering zero or a negative number skips all rounds and produces a draw with both scores at zero.
- To play again, restart the program.
