package _06_ex;

public class Book {
/*
Book API
속성 : 	title
author
price
publisher
	
생성자 2개
매개변수가 없는 생성자(빈생성자)
모든 매개변수를 받는 생성자
getter, setter 메소드
모든필드값을 리턴해주는 메소드
	
Book_main
생성자 또는 setter메소드를 이용하여 3개의 도서 정보 입력
	
도서 책 제목으로 검색하여 검색이 되면 
모든필드값을 리턴해주는 메소드를 이용하여 출력하기
검색이 안되면
"책이 없습니다"
*/
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	// 기본 생성자
	public Book() {
		
	}
	
	//모든 필드를 받는 생성자
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	// get & set 메소드
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	//모든 필드값을 리턴해주는 메소드
	public String getDetails() {
		return String.format("title : %s, author : %s, price : %s, publisher : %s", title, author, price, publisher);
	}
	
}
