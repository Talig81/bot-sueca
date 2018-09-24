import java.util.*;

public class Motor{
	public static void main(String[] args){
		char as = 'A';
		char copas = 'C';
		Card a1 = new Card(as,copas);

		System.out.println("valor: " + a1.getValue() + " naipe: " + a1.getSuite());
	}
}