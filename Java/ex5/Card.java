
public class Card {

	private Rank r;
	private Suit s;
	
	public Card (Rank rank, Suit suit) {
		
		r = rank;
		s = suit;
		
	}
	
	public String toString() {
		
	return s.toString() + r.toString();
	
		
	}
	
	
public int compareTo(Card c ) {
	
	if (r.ordinal() < (c.r).ordinal() )
		return -1;
	else if (r.ordinal() == (c.r).ordinal() && s.ordinal() < (c.s).ordinal() )
			return -1;
	else if (r.ordinal() == (c.r).ordinal() && s.ordinal() == (c.s).ordinal() )
		return 0;
	else
		return 1;
	
}
	
	
	
}
