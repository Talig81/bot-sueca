import java.util.*;

public class Motor{
	public static void main(String[] args){
		char as = 'A';
		char copas = 'C';
		
		Card a = new Card(as,copas);
		System.out.println(a.getPlayerCard());
		PlayerDeck pd = new PlayerDeck();
		Baralho b = new Baralho();
		ArrayList<Card> deck = b.getRandomDeck();
		for(int i = 0; i<10;i++){
			pd.addCard(deck.get(i));
			Card a1 = deck.get(i);
			//System.out.println("valor: " + a1.getValue() + " naipe: " + a1.getSuite());
		}
		Game g = new Game();
		g.startGame(b);
	}
}