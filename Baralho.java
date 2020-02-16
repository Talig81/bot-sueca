import java.util.*;

public class Baralho {
  ArrayList deck = new ArrayList<>();

  public Baralho() {
    int j, k = 2;
    char aux = 'C';
    char value = '-';

    for (int i = 0; i < 4; i++) {
      switch (i) {
        case 0:
          aux = 'S';
          break;
        case 1:
          aux = 'H';
          break;
        case 2:
          aux = 'D';
          break;
        case 3:
          aux = 'C';
          break;
      }
      k = 2;
      for (j = 0; j < 10; j++) {

        if (j < 6) {
          value = (char) (k + '0');
          k++;
        } else {
          switch (j) {
            case 6:
              value = 'Q';
              break;
            case 7:
              value = 'J';
              break;
            case 8:
              value = 'K';
              break;
            case 9:
              value = 'A';
              break;
          }
        }
        Card c = new Card(value, aux);
        deck.add(c);
      }
    }
  }

  public ArrayList<Card> getDeck() {
    return this.deck;
  }

  public ArrayList<Card> getRandomDeck() {
    Collections.shuffle(this.deck);
    Collections.shuffle(this.deck);
    return this.deck;
  }
}
