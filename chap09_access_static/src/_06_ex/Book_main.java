package _06_ex;

import java.util.Scanner;

public class Book_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//3개의 도서 정보 입력
		Book book1 = new Book("화폐전쟁", "쑹훙빈", 25000, "창기");
		Book book2 = new Book("해리포터", "조앤.K.롤링", 12000, "문화");
		Book book3 = new Book();
		book3.setTitle("아무노래나일단틀어");
		book3.setAuthor("Mr.Nobody");
		book3.setPrice(90000);
		book3.setPublisher("Nobody's");
		
		//도서 정보 배열
		Book[] books = {book1, book2, book3};
		
		//책 제목으로 검색
		System.out.println("검색할 책 제목을 입력하시오.");
		String searchTitle = sc.next();
		boolean found = false;
		
		for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(searchTitle)) {
                System.out.println("검색 결과: " + book.getDetails());
                found = true;
                break;
            }
		}
		if (!found) {
            System.out.println("책이 없습니다.");
        }
	}
	
}
