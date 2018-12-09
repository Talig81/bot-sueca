import java.util.*;

public class Game{
    String nsei;

    public Game(){
        this.nsei = "";
    }
    
    public void startGame(Baralho b){
        PlayerDeck pd1 = new PlayerDeck();
        PlayerDeck pd2 = new PlayerDeck();
        PlayerDeck pd3 = new PlayerDeck();
        PlayerDeck pd4 = new PlayerDeck();
        PlayerDeck gP = new PlayerDeck();
        for(int i = 0; i<10;i++){
            pd1.addCard(b.getDeck().get(i));
        }
        for(int i = 10; i<20;i++){
            pd2.addCard(b.getDeck().get(i));
        }
        for(int i = 20; i<30;i++){
            pd3.addCard(b.getDeck().get(i));
        }
        for(int i = 30; i<40;i++){
            pd4.addCard(b.getDeck().get(i));
        }
        gP.addCard(b.getDeck().get(2));
        gP.addCard(b.getDeck().get(3));
        Templas t = new Templas();
        t.infos(1,1,pd1,'S',gP);
    }
}