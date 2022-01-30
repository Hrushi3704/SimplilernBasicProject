
public class ArrayDemo {

	public static void main(String[] args) {
		
		Books[] book = new Books[2];
		BookCounter bookCounter = new BookCounter();
		
		book[0] = bookCounter.CreateBooks("hello", 4);
		book[1] = bookCounter.CreateBooks("hi", 2);
		
		
	}
	
}
