//==============================================
// Andrew Asquith
// COMP 1131
// Assignment 5 
// Card Class 
//
// This is the Card class.
// It represents a playing card, both suit
// and face value. The constructor will take
// a suit and value or randomly choose one 
// if not provided or provided invalid values.
//
//==============================================

//import the Random class since we need bounds
import java.util.Random;

public class Card {

	//constants for the suits
	public final static int CLUBS = 1;
	public final static int HEARTS = 2;
	public final static int SPADES = 3;
	public final static int DIAMONDS = 4;
	

	//constants for the non numeric face cards
	public final static int ACE = 1;
	public final static int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;

	//card suit
	private int suit;
	
	//card face value
	private int face;

	// private random number generator
	private Random rng = new Random();

	// constructor choosing a random card if none provided
	public Card() {

		// generate a random suit and card;

		suit = getRandomSuit();
		face = getRandomFace();
	}

	// constructor accepting a suit and face value
	public Card(int setFace, int setSuit) {
		
		// if the provided value is valid use it, if not, choose a random one
		// didn't use Card.ACE and Card.King for clarity of range
		if ((setFace < 1) || (setFace > 13)) {
			face = getRandomFace();
		} else {
			face = setFace;
		}
		
		// if the provided suit was not recognized, choose a random one
		// didn't use Card.HEARTS and Card.CLUBs for clarity of range
		if ((setSuit < 1) || (setSuit > 4)) {
			suit = getRandomSuit();
		} else {
			suit = setSuit;
		}
	}
	
	// private helper method to choose a random suit
	private int getRandomSuit() {
		//chose not to use the constant here for clarity
		return rng.nextInt(4) + 1;
	}

	// private helper method to choose a random face value
	private int getRandomFace() {
		//chose not to use the constant here for clarity
		return rng.nextInt(13) + 1;
	}

	// public getter to return the numeric value of the suit
	public int getSuit() {
		return suit;
	}

	// public setter to set the value of the suit, if the input is invalid it is ignored
	public void setSuit(int newSuit) {
		if ((newSuit >= 1) && (newSuit <= 4))
			suit = newSuit;
	}
	
	// public method to return the string representation of the suit
	public String getSuitName() {

		if (suit == HEARTS) {
			return "Hearts";
		} else if (suit == DIAMONDS) {
			return "Diamonds";
		} else if (suit == SPADES) {
			return "Spades";
		} else {
			return "Clubs";
		}
	}

	// public getter to get the numeric face value
	public int getFace() {
		return face;
	}

	// public setter to set the face value, if the input is invalid it is ignored
	public void setFace(int newFace) {
		if ((newFace >= 1) && (newFace <= 13))
			face = newFace;
	}

	// public method to return the string representation of the face value
	public String getFaceString() {
		
		String formattedName = null;

		// simple switch to pick the correct representation
		switch (face) {
		case 1:
			formattedName = "Ace";
			break;
		case 2:
			formattedName = "Two";
			break;
		case 3:
			formattedName = "Three";
			break;
		case 4:
			formattedName = "Four";
			break;
		case 5:
			formattedName = "Five";
			break;
		case 6:
			formattedName = "Six";
			break;
		case 7:
			formattedName = "Seven";
			break;
		case 8:
			formattedName = "Eight";
			break;
		case 9:
			formattedName = "Nine";
			break;
		case 10:
			formattedName = "Ten";
			break;
		case 11:
			formattedName = "Jack";
			break;
		case 12:
			formattedName = "Queen";
			break;
		case 13:
			formattedName = "King";
			break;
		}
		// we could have saved the allocation and returned directly from the case
		// statements, but this is "nicer" to read
		return formattedName;
	}

	// toString implementation that returns a friendly description of the card
	public String toString() {
		//reuse the pretty methods we already created instead of  doing all the work again
		return getFaceString() + " of " + getSuitName();
	}
}