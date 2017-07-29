
// use the random class since we need bounds
import java.util.Random;

public class DeckOfCards {

	// 52 card array to hold the deck
	private Card[] cards = new Card[4 * 13];

	// constructor which initializes the deck
	public DeckOfCards() {
		initializeDeck();
	}

	private void initializeDeck() {

		// loop through the 4 different suits
		for (int suit = Card.CLUBS; suit <= Card.DIAMONDS; suit++) {

			// for each of the 13 face cards
			for (int face = Card.ACE; face <= Card.KING; face++) {

				// the index needed is the (suit-1) * 13 + (the face - 1)
				// the ace of clubs = 0*13 + 1-1 = 0
				// the 3 of spades = (3-1)*13 + 3-1 = 28

				// conversely we could have started the loops at the 0 index
				// but then we'd have to add 1 in the Card constructor which
				// doesn't read as well
				cards[(suit - 1) * 13 + (face - 1)] = new Card(face, suit);
			}
		}
	}

	// deal the first card in the deck
	public Card dealCard() {

		// the card we're going to "deal" at the end
		Card topCard = cards[0];

		// create a new array with one less card in it
		Card[] temp = new Card[cards.length - 1];

		// loop through remaining cards and shift them "up" one position in the
		// deck
		for (int index = 0; index < temp.length; index++) {
			temp[index] = cards[index + 1];
		}

		// replace the original deck with the new smaller one
		cards = temp;

		// return the card that was on top
		return topCard;
	}

	// return the number of cards currently in the deck
	public int getNumberOfCardsInDeck() {
		return cards.length;
	}

	// return the entire deck of cards
	// this sort of breaks encapsulation since it will be references
	// but this class makes no guarantees about anything
	// except it's initial state of a full deck
	// so if the caller wants to do something foolish, they are free to
	public Card[] getCards() {
		return cards;
	}

	//shuffle the deck of cards
	// there's a name for this algorithm but I can't remember it
	public void shuffle() {

		Random rng = new Random();

		// index of the random card to swap
		int index;

		// temporary card holder for swapping
		Card temp;

		// we need to traverse in reverse
		// to make the bounds work nicely
		// and not swap the same cards over and over
		for (int current = cards.length - 1; current >= 0; current--) {

			// swap with one of the existing cards
			index = rng.nextInt(current + 1);

			// the card that was randomly chosen
			temp = cards[index];

			// swap with the current one in the deck
			cards[index] = cards[current];

			// put the random one in the current position
			cards[current] = temp;
		}
	}
}