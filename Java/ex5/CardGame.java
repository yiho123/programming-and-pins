import java.util.ArrayList;

public class CardGame {

  private Player[] players;	// players in this game
  private int numRounds;	// number of rounds in this game

  // constructor
  // DO NOT MODIFY THIS METHOD
  public CardGame(Player[] players) {
    this.players = players;
    this.numRounds = players[0].numCardsInHand();
  }

  public void play() {

	  int h = 0;
	  for(int i = 0; i < players.length; i++) {
		    
		    players[i].sort();
  
		    }
	  
	  
	  for(int r = 0; r < numRounds; r++){
		  ArrayList<Card> playCard = new ArrayList<Card>(players.length);
		  
		  for(int i = 0; i < players.length; i++) {
			  
			  System.out.println(players[i].getName() + " has cards : " + players[i].cards );
			  
			  playCard.add(i, players[i].playCard());
			  
		  }
		  
		  
		  
		  
		  
		  for(int i = h; i%players.length < h || i < players.length; i++) {
			  
			  System.out.println(players[i%players.length].getName() + " plays " + playCard.get(i%players.length) );
			  
		  } 
		  
		  
		  
		  Card now = playCard.get(0);
		  int f = 0;
		  
		  for(int i = 1; i < playCard.size(); i++) {
			  
			  
			  if(now.compareTo(playCard.get(i) ) == -1) {
				  now = playCard.get(i);
				  f = i;
				  
			  }
			  
		  }
		  
		  System.out.println("The winner of this round is " + players[f].getName() + ".");
		  
		  h = f;
		  
		  System.out.println();
		  
		  
		  
		  
	  }
	  
	  
	  
	  
  }
}
