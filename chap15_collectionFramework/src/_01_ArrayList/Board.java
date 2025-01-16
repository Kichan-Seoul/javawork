package _01_ArrayList;

public class Board {
	private String subject;
	private String writter;
	private String contents;
	
	// 생성자 2개
	public Board() {
		
	}
	public Board(String subject, String writter, String contents) {
		this.subject = subject;
		this.writter = writter;
		this.contents = contents;
	}
	
	// getter setter 메소드
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	
	public void setWritter(String writter) {
		this.writter = writter;
	}
	public String getWritter() {
		return writter;
	}
	
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getContents() {
		return contents;
	}
	
	@Override
	public String toString() {
		return "제목 : " + subject + ", 글쓴이 : " + writter + ", 가격 : " + contents;
	}
	
}
