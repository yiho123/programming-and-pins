import java.util.ArrayList;

public abstract class Player {

	private String name;
	protected ArrayList<Card> cards = new ArrayList<Card>();
	
	
	
	public Player (String name) {
		
		this.name = name;
		
	}
	
	public void addCard(Card card) {
	cards.add(card);
	
       }
	

	public int numCardsInHand() {
		
		return cards.size();
	}
	
	
	public String getName() {
		return name;
	}
	
	public abstract Card playCard() ;
	
	public void sort() {
		if(cards.size() == 0)
			{};
		
		
		if(cards.size() !=0) {
		
		ArrayList<Card> list = new ArrayList<Card>(cards.size());
		list.add(cards.get(0));
		
		for(int i = 1; i < cards.size(); i++ ) {
			
			for(int j = 0; j < list.size(); j++) {
				if(cards.get(i).compareTo(list.get(j)) == -1 ) {
					list.add(j,cards.get(i));
					break;
				}
				
				if(j == list.size() - 1) {
					list.add(j+1,cards.get(i));
				break;}
				
			}
			
		}
		
		cards = list;
		
		}
		
	}
		
	
	
	
}
