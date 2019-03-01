/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card aceOfSpades = new Card("Ace", "Spades", 1);
		
		System.out.println(aceOfSpades.toString());
		
		Card aceOfDiamonds = new Card("Ace", "Diamonds", 1);
		
		System.out.println(aceOfDiamonds.toString());
		
		System.out.println(aceOfDiamonds.matches(aceOfSpades));
		
		Card AceOfSpades = new Card("Ace", "Spades", 1);
		
		System.out.println(AceOfSpades.matches(aceOfSpades));
	}
}