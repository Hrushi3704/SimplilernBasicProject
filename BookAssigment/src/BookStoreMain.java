
public class BookStoreMain {

	public static void main(String[] args) {
		
		BookCounter Counter = new BookCounter();
		Books book1 = Counter.CreateBooks("java", 100.50);
		Books book2 = Counter.CreateBooks("java1", 110.50);
		System.out.println("Booktitle"+"\t "+"BookPrice");
		Counter.Showbook(book1);
		Counter.Showbook(book2);
	}
}
