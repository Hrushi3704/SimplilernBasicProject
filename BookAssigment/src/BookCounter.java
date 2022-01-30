
public class BookCounter {

	//createBooks & showBooks should not be member functions of Book class
	public Books CreateBooks(String booktitle,double bookprice)
	{
		Books book = new Books();
		book.setBookprice(bookprice);
		book.setBooktitle(booktitle);
		return book;
	}
	
	public void Showbook(Books book) {
		
		System.out.println(book.getBooktitle()+"\t \t"+" Rs."+book.getBookprice());
		
		
	}
}
