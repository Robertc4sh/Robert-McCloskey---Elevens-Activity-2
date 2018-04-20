/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] rank1 = {"Four", "Five", "Six"};
		String[] suit1 = {"Diamonds", "Spades", "Hearts"};
		int[] value1 = {4, 5, 6};
		
		Deck deck1 = new Deck(rank1, suit1, value1);
	}
}