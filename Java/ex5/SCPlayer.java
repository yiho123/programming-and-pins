
public class SCPlayer extends Player {

public SCPlayer(String name) {
		
		
		super(name);
	}
	
	public Card playCard() {
		
		
		
		
		Card a = cards.remove(0);
		return a;
		
	}
	
	
	
	
}
