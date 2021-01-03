
public class Ques28 {

	public static void main(String[] args) {
		
		Book obj1 = new Book(1719,15.20,"Daniel Defoe", "Robinson Crusoe");
		Book obj2 = new Book( 1902, 12.80,"Joseph Conrad", "Heart of Darkness");
		Book obj3 = new Book( 1996, 9.50,"Pat Conroy", "Beach Music");
		
	}

}

class Book{
	
	int yop;
	double price;
	String author,book_title;
	public Book(int yop, double price, String author, String book_title) {
		super();
		this.yop = yop;
		this.price = price;
		this.author = author;
		this.book_title = book_title;
	}
	
	
	
}