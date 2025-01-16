package _03_ex;

public class BookRun {

	public static void main(String[] args) {
		Member member = new Member();
		LibraryController library = new LibraryController(member);
		
		library.insertBook();
		
		System.out.println("책 목록");
		for(Book book : library.selectAll()) {
			System.out.println(book);
		}
		
		String searchTitle = "nothing";
		Book foundBook = library.searchBook(searchTitle);
		if(foundBook != null) {
			System.out.println("검색 결과 : " + foundBook);
		} else {
			System.out.println("책을 찾을 수 없습니다." + searchTitle);
		}
		
		

	}

}
