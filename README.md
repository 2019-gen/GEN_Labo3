# GEN - Laboratoire 3

_Auteurs : Loris Gilliand, Mateo Tutic, Luc Wachter_

## Buts du laboratoire
- Mettre en oeuvre les deux premières itérations du jeu de monopoly de « Applying UML and Patterns »
- Utiliser de nouvelles annotations et assertions dans JUnit
- Utiliser Git, Maven et Travis en les configurant vous-même pour que Travis fasse tourner vos tests unitaires à 
chaque pull request.

## Itération 1
- Players move around the squares of the board.
- Two to eight players can play.
- A game is played as a series of 20 rounds. During a round, each player takes one turn. In each turn, a player advances his piece clockwise around the board a number of squares equal to the sum of the number rolled on two six-sided dice.
- After the dice are rolled, the name of the player and the roll are displayed. When the player moves and lands on a square, the name of the player and the name of the square that the player landed on are displayed.
- Each square has a name. Every player begins the game with their piece located on the square named “Go.” The square names will be Go, Square 1, Square 2, ... Square 39
- Run the game as a simulation requiring no user input, other than the number of players.

## Itération 2
Players moving around the squares of the board. Run the game as a simulation requiring no user input other than the number of players. In iteration-2 some of the special square rules  apply. These are described in the following points...

- Each player receives $1500 at the beginning of the game.
- When a player lands on the Go square, the player receives $200.
- When a player lands on the Go-To-Jail square, he moves to the Jail square.
- However, unlike the complete rules, they get out easily. On their next turn, they simply roll and move as indicated
 by the roll total.
- When a player lands on the Income-Tax square, the player pays the minimum of $200 or 10% of their worth.

## À utiliser
- Utiliser au moins une fois @BeforeEach, @ParameterizedTest et @RepeatedTest.
- Utiliser au moins 5 assertions différentes.
- Utiliser le workflow donné, avec un repository dans une organisation, trois forks et Travis CI.
- Protéger les branches avec les mécanismes GitHub (pas de merge tant que Travis n'est pas OK + au moins une approbation).
