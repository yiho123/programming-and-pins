
public class LCPlayer extends Player{


	public LCPlayer(String name) {
		
		
		super(name);
	}
	
	public Card playCard() {
		

		Card a = cards.remove(cards.size() - 1);
		return a;
		
	}
	
	
	
	
}
