package _10_ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LibraryController {
	private ArrayList<Book> books = new ArrayList<>();

    // 1. 새 도서 추가
    public void addBook(Book book) {
        books.add(book);
        System.out.println("도서가 추가되었습니다: " + book);
    }

    // 2. 전체 도서 조회
    public ArrayList<Book> displayAllBooks() {
        return books;
    }

    // 3. 도서 검색
    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // 검색 결과가 없을 경우
    }

    // 4. 도서 삭제
    public boolean deleteBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                return true; // 삭제 성공
            }
        }
        return false; // 삭제 실패
    }

    // 5. 도서명 오름차순 정렬
    public void sortBooksByTitle() {
        Collections.sort(books, Comparator.comparing(Book::getTitle));
        System.out.println("도서명 오름차순 정렬이 완료되었습니다.");
    }

}
