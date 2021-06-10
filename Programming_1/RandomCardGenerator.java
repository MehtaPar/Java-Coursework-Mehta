// RANDOM CARD GENERATOR 
// With corresponding rank and suit
//Author PARAM MEHTA


public class RandomCardGenerator {
	public static void main(String[] args) {
		
		int[] cards = new int[52];
		
		String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
		String[] suit = {"Spades", "Hearts", "Diamonds", "Clubs"};

		for (int i = 0; i < cards.length; i++) {
			cards[i] = i;
		}		
		

		String cardSuit = suit[cards[(int) (Math.random() * cards.length)] / 13];
		String cardRank = rank[cards[(int) (Math.random() * cards.length)] % 13];
		System.out.println("The card is " + cardRank + " of " + cardSuit);
		
	}
	
}
