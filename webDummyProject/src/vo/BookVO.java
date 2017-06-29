package vo;

public class BookVO {
	
	private int bookNum;
	private String bookTitle;
	private String bookPublisher;
	private int bookPrice;
	private String bookYear;
	
	public BookVO() {}
	
	public BookVO(int bookNum, String bookTitle, String bookPublisher, int bookPrice, String bookYear) {
		
		this.bookNum = bookNum;
		this.bookTitle = bookTitle;
		this.bookPublisher = bookPublisher;
		this.bookPrice = bookPrice;
		this.bookYear = bookYear;
		
	}
	
	public BookVO(String bookTitle, String bookPublisher, int bookPrice, String bookYear) {
		
		this.bookTitle = bookTitle;
		this.bookPublisher = bookPublisher;
		this.bookPrice = bookPrice;
		this.bookYear = bookYear;
		
	}
	
	public int getBookNum() {
		
		return bookNum;
		
	}
	
	public void setBookNum(int bookNum) {
		
		this.bookNum = bookNum;
		
	}
	
	public String getBookTitle() {
		
		return bookTitle;
		
	}
	
	public void setBookTitle(String bookTitle) {
		
		this.bookTitle = bookTitle;
		
	}
	
	public String getBookPublisher() {
		
		return bookPublisher;
		
	}
	
	public void setBookPublisher(String bookPublisher) {
		
		this.bookPublisher = bookPublisher;
		
	}
	
	public int getBookPrice() {
		
		return bookPrice;
		
	}
	
	public void setBookPrice(int bookPrice) {
		
		this.bookPrice = bookPrice;
		
	}
	
	public String getBookYear() {
		
		return bookYear;
		
	}
	
	public void setBookYear(String bookYear) {
		
		this.bookYear = bookYear;
		
	}
	
	@Override
	public String toString() {
		
		return "BOOK[TITLE="+this.bookTitle+"/PUBLISHER="+this.bookPublisher+"/PRICE="+this.bookPrice+"/YEAR="+this.bookYear+"]";
		
	}
	
}
