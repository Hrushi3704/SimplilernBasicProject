
public class BookArrayMain {

	public static void main(String[] args) {
		
		Books[] book = new Books[3]; // array of class
		BookCounter bookCounter = new BookCounter();
		
		book[0] = bookCounter.CreateBooks("java1", 100.10);
		book[1] = bookCounter.CreateBooks("c", 111.11);
		book[2] = bookCounter.CreateBooks("java3", 123.12);
		System.out.println("Booktitle"+"\t "+"BookPrice");
		for (Books books : book) {
			bookCounter.Showbook(books);
		}
		
	}
	
}
