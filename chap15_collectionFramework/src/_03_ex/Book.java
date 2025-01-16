package _03_ex;

public class Book {
	//속성
	private String title;
	private String author;
	private String publisher;
	//생성자
	public Book()	 {
		
	}
	public Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	//getter setter 메소드
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle(String title) {
		return title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	//오버라이딩
	@Override
	public String toString() {
		return "제목 : " + title + ", 저자 : " + author + ", 출판사 : " + publisher;
	}
}
