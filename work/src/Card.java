
public class Card {

	private Suit suit;
	private Rank rank;
	
	public Card(Suit p_suit, Rank p_rank) {
		this.suit = p_suit;
		this.rank = p_rank;
		// System.out.println(this.suit);
	}
	
	// return suit
	public Suit getSuit() {
		return suit;
	}
	
	public Rank getRank() {
		return rank;
	}
	
	public Card getCard() {
		return new Card(suit, rank);
	}
	
	public void showCard() {
		System.out.println(rank.toString() + " of " + suit.toString());
	}
}
