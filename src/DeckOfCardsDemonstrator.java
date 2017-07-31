//==============================================
// Andrew Asquith
// COMP 1131
// Assignment 5 
// DeckOfCardsDemonstrator Class 
//
// This is the DeckOfCardsDemonstrator class.
// It runs through a few demonstrations 
// showing the functionality of the DeckOfCards 
// class and confirming it works as expected.
//
//==============================================
public class DeckOfCardsDemonstrator {
	
	public static void main(String[] args) {
		
		DeckOfCards deck = new DeckOfCards();

		// print the unshuffled deck
		System.out.println("Unshuffled deck:");
		System.out.println("====================");
		System.out.println(deck);

		System.out.println(System.lineSeparator() + "====================");
		System.out.println("Shuffling...");
		// shuffle the deck
		deck.shuffle();

		System.out.println("====================" + System.lineSeparator());

		// ask the deck for how many cards are in it
		int numberOfCardsToDeal = deck.getNumberOfCardsInDeck();
		// and deal each card from the new deck
		for (int i = 0; i < numberOfCardsToDeal; i++) {
			System.out.println("Dealt: " + deck.dealCard());
		}

		// confirm we dealt all the cards
		System.out.println("Dealt all the cards: " + deck.getNumberOfCardsInDeck() + " cards remaining in deck");

		System.out.println(System.lineSeparator() + "====================");

		// another demonstration of the DeckOfCards methods
		// showing we don't need to work with full decks

		System.out.println("New Deck");
		// reset the deck so we can shuffle it
		deck = new DeckOfCards();

		System.out.println("====================" + System.lineSeparator());

		// print the new unshuffled deck
		System.out.println("New unshuffled deck:");
		System.out.println("====================");
		System.out.println(deck);

		// deal 5 cards off the top while still ordered ace - 5 of clubs
		for (int i = 0; i < 5; i++) {
			System.out.println(System.lineSeparator() + "====================");
			System.out.println("Dealt: " + deck.dealCard());
			System.out.println("Remaining " + deck.getNumberOfCardsInDeck() + " cards:");
			System.out.println("====================");
			System.out.println(deck);
		}

		System.out.println(System.lineSeparator() + "====================");
		System.out.println("Shuffling...");
		// shuffle the deck
		deck.shuffle();
		System.out.println("====================" + System.lineSeparator());
		// inspect the shuffled deck
		System.out.println(System.lineSeparator() + "====================");
		System.out.println("Shuffled deck:");
		System.out.println("Remaining " + deck.getNumberOfCardsInDeck() + " cards:");
		System.out.println("====================");
		System.out.println(deck);

		// and deal 5 more from the non full deck
		for (int i = 0; i < 5; i++) {
			System.out.println(System.lineSeparator() + "====================");
			System.out.println("Dealt: " + deck.dealCard());
			System.out.println("Remaining " + deck.getNumberOfCardsInDeck() + " cards:");
			System.out.println("====================");
			System.out.println(deck);
		}
	}
}
