public class Card{

	char value;
	char suite;

	public class Card(){
		this.value = '';
		this.suite = '';
	}

	public class Card(char v, char s){
		this.value = v;
		this.suite = s;
	}

	public class Card(Card c){
		this.value = c.getValue();
		this.suite = c.getSuite();
	}

	public char getValue(){
		return this.value;
	}

	public char getSuite(){
		return this.suite;
	}

	public void setValue(char v){
		this.value = v;
	}

	public void setSuite(char s){
		this.suite = s;
	}

	
}