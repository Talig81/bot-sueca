import java.util.*;

public class Templas{
    String input;

    public Templas(){
        this.input = "";
    }

    public void infos(int nP,int nT, PlayerDeck pd, char tR, PlayerDeck gD){
        this.setPlay(nP);
        this.setTurn(nT);
        this.setInplay(gD.printDeck());
        this.setTrump(tR);
        this.setDeck(pd.printDeck());
        this.setEarlyPlays("is it me your looking for?");
        System.out.println(this.input);
    }
    
    

    public void setPlay(int i){
        this.input += "Play: "+i;
    }
    public void setTurn(int i){
        this.input += "\nTurn: "+i;
    }
    public void setInplay(String s){
        this.input += "\nCards in Play: "+s;
    }
    public void setTrump(char c){
        this.input += "\nTrump: "+c;
    }
    public void setDeck(String s){
        this.input += "\nDeck: "+s;
    }
    public void setEarlyPlays(String s){
        this.input += "\nEarly Plays: -";
    }
    
}


