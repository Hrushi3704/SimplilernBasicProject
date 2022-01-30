//Create a class Book which describes its Book_title and Book_price
public class Books {

	private String booktitle;
	private double bookprice;
	

	//Use getter and setter methods to get & set the Books description.

	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	public double getBookprice() {
		return bookprice;
	}
	public void setBookprice(double bookprice) {
		this.bookprice = bookprice;
	}
	@Override
	public String toString() {
		return "Books [booktitle=" + booktitle + ", bookprice=" + bookprice + "]";
	}
	
}
