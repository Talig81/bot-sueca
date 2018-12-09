import java.util.*;


public class PlayerDeck{
    ArrayList<Card> deck;

    public PlayerDeck(){
        this.deck = new ArrayList<>();
    }

    public void addCard(Card a){
        this.deck.add(a);
    }

    public ArrayList<Card> cleanDeck(){
        this.deck.clear();
        return this.deck;
    }

    public ArrayList<Card> getDeck(){
        return this.deck;
    }

    public String printDeck(){
        String aux = "";
        
        for (Card c : this.deck) {
            aux += c.getPlayerCard();
            aux += '-';
        }
            return aux.substring(0,aux.length()-1);
        }
    }
