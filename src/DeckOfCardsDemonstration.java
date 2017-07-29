
public class DeckOfCardsDemonstration {

	public static void main(String[] args) {

		DeckOfCards deck = new DeckOfCards();

		// print the unshuffled deck
		System.out.println("Unshuffled deck:");
		printDeck(deck);

		// shuffle the  deck
		deck.shuffle();

		System.out.println(System.lineSeparator() + "====================");

		// ask the deck for how many cards are in it
		int numberOfCardsToDeal = deck.getNumberOfCardsInDeck();
		// and deal each card from the new deck
		for (int i = 0; i < numberOfCardsToDeal; i++) {
			System.out.println("Dealt: " + deck.dealCard());
		}

		// confirm we dealt all the cards
		System.out.println("Dealt all the cards: " + deck.getNumberOfCardsInDeck() + " cards remaining in deck");

		System.out.println(System.lineSeparator() + "====================");
		
		//another demonstration of the DeckOfCards methods 
		//showing we don't need to work with full decks
		
		// reset the deck so we can shuffle it
		deck = new DeckOfCards();

		System.out.println(System.lineSeparator() + "====================");

		// print the new unshuffled deck
		System.out.println("New unshuffled deck:");
		printDeck(deck);
		
		
		// deal 5 cards off the top while still ordered ace - 5 of clubs
		for (int i = 0; i < 5; i++) {
			System.out.println(System.lineSeparator() + "====================");
			System.out.println("Dealt: " + deck.dealCard());
			System.out.println("Remaining " + deck.getNumberOfCardsInDeck() + " cards:");
			printDeck(deck);
		}

		// shuffle the deck
		deck.shuffle();
		// inspect the shuffled deck
		System.out.println(System.lineSeparator() + "====================");
		System.out.println("Shuffled deck:");
		System.out.println("Remaining " + deck.getNumberOfCardsInDeck() + " cards:");
		printDeck(deck);

		// and deal 5 more from the non full deck
		for (int i = 0; i < 5; i++) {
			System.out.println(System.lineSeparator() + "====================");
			System.out.println("Dealt: " + deck.dealCard());
			System.out.println("Remaining " + deck.getNumberOfCardsInDeck() + " cards:");
			printDeck(deck);
		}
		
		// since the deck of cards class returns a reference to the deck
		// we can make the top 5 cards all Ace of Hearts 
		Card[] referenceDeck = deck.getCards();
		
		for (int i = 0; i < 5; i++) {
			referenceDeck[i] = new Card(Card.ACE, Card.HEARTS);
		}
		System.out.println("Remaining " + deck.getNumberOfCardsInDeck() + " cards:");
		printDeck(deck);
	}

	//helper method to print the deck to the screen, saves a few keystrokes
	private static void printDeck(DeckOfCards deck) {

		// for each card in the deck call the toString method
		for (Card card : deck.getCards()) {
			System.out.println(card);
		}

	}

}