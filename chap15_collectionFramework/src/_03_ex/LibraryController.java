package _03_ex;

import java.util.ArrayList;

public class LibraryController {
	private Member member = new Member();
	private ArrayList<Book> aList = new ArrayList<>();
	
	public LibraryController(Member member) {
		this.member = member;
		this.aList = new ArrayList<>();
	}
	
	public void info() {
		System.out.println(member.toString());
	}
	public void insertBook() {
		aList.add(new Book("King KICHAN", "KIMKICHAN", "the Empire"));
		aList.add(new Book("QUEEEEEN", "YERIIIN", "ROOMMM"));
		aList.add(new Book("nothing", "even", "better"));
	}
	public ArrayList<Book> selectAll() {
		return aList;
	}
	public Book searchBook(String bookTitle) {
		Book book = null;
		for(int i = 0; i<aList.size(); i++) {
			if(aList.get(i).getTitle(bookTitle).equalsIgnoreCase(bookTitle)) {
				return aList.get(i);
			}
		}
		return null;
	}
	
	
}
