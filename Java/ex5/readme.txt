



The Game

There are several players. In the beginning of the game, each player takes turn to draw a card from a deck of cards until each player has numRounds cards. The game then proceeds in rounds. In each round, each player plays a card according to his/her own strategy. Messages telling the card each player plays in each round are printed out. The player who plays the largest card is also identified. This player is then the first player of the next round. The first player starts the first round.

 

Players

There are two kinds of players who use two different strategies. Players in one group always play the smallest card. Players in the other group always play the largest card. We will apply inheritance to develop different classes to represent different groups of players.

 

class Player is the base class for all players. Define this class according to the following:

1.     it is an abstract class

2.     there are two instance variables: a String variable for the name and an ArrayList of Card to represent the cards the player has

3.     constructor public Player(String name) is defined

4.     method public void addCard(Card card) adds a new card to the arraylist of Card. The arraylist is arranged from smallest card to the largest card.

5.     method public int numCardsInHand() that returns the number of cards this player has

6.     abstract method playCard() returns a Card object. The method models each player would apply a certain strategy to play a card.

7.     You can define other methods but not define other instance variables.

 

class LCPlayer is derived from class Player. It represents players who always play the largest card. Class SCPlayer represents players who always play the smallest card. Define these two classes without declaring any instance variable but define appropriate methods.

 

class CardGame

The game logic is implemented in the play() method. The instance variables for representing the players and numRounds have been declared and initialized in the constructor provided. Cards have been distributed to the players in the parameter. You do not have to distribute cards to them again. Details of the players can be found in InitializePlayer.java.

 

Without defining any new instance variable, implement method play() so that:

 

1.     In each round, first print out the cards each player has in ascending order.

2.     Then, print out what card each player plays this round. The winner of the previous round plays a card first, followed by the next player according to the array index. The first player of the first round is the player with index 0.

3.     The winner is identified.

 

After you have developed the classes for players and CardGame, use CardGameDriver.java to test your program. The sample output has been provided.