
public class TestDeck {

	public static void main (String[] arg) {
		
		// initialize the deck
		Deck mydeck = new Deck();
		
		// display the deck for everyone to see
		// mydeck.showDeck();
		
		// blow away the deck
		// mydeck = null;
		
		// check to see if the deck is gone
		// if true, let user know.
		if (mydeck == null) {
			System.out.println("The deck is empty!");
		}
		
		Card rand_card = mydeck.getRandomCard();
		// System.out.println(rand_card.getRank().toString() + " of " + rand_card.getSuit().toString());
		rand_card.showCard();
		
	}
}
