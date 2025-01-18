package _03_ex;

public class BookRun {

	public static void main(String[] args) {
		//Member member = new Member();
		LibraryController library = new LibraryController(new Member("kichan", 29, "man"));
		
		library.insertBook();
		
		for(Book book : library.selectAll()) {
			System.out.println(book);
		}
		
		Book book = library.searchBook("nothing");
		//String searchTitle = "nothing";
		//Book foundBook = library.searchBook(searchTitle);
		if(book == null) {
			System.out.println("책을 찾을 수 없습니다");
		} else {
			System.out.println("찾은 책 : " + book);
		}
		
		

	}

}
