
public class TestCard {

	public static void main(String[] args) {
		//Card mycard1;
		// Card mycard2;

		// Suit x_suit;
		// Rank x_rank;
		
		// mycard1 = new Card(Suit.HEARTS, Rank.DEUCE);
		// mycard2 = mycard1.getCard();
		
		// x_suit = mycard1.getSuit();
		// x_rank = mycard2.getRank();
		
		// System.out.println(x_suit.toString());
		// System.out.println(x_rank.toString());
		
		for (Suit suit : Suit.values()) {
			// System.out.println(suit.toString());
			for (Rank rank : Rank.values()) {
				System.out.println(rank.toString() + " of " + suit.toString());
			}
		}
	}
}
