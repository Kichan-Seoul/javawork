package _10_ex;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
	 private LibraryController controller = new LibraryController();
	    private Scanner sc = new Scanner(System.in);

	    public void displayMenu() {
	        int choice;
	        do {
	            System.out.println("\n********* 메뉴 *********");
	            System.out.println("1. 새 도서 추가");
	            System.out.println("2. 전체 도서 조회");
	            System.out.println("3. 도서 검색");
	            System.out.println("4. 도서 삭제");
	            System.out.println("5. 도서명 오름차순 정렬");
	            System.out.println("0. 종료");
	            System.out.print("선택: ");
	            choice = sc.nextInt();
	            sc.nextLine(); // 버퍼 비우기

	            switch (choice) {
	                case 1 -> addBook();
	                case 2 -> displayAllBooks();
	                case 3 -> searchBook();
	                case 4 -> deleteBook();
	                case 5 -> sortBooks();
	                case 0 -> System.out.println("프로그램을 종료합니다.");
	                default -> System.out.println("잘못된 입력입니다. 다시 시도하세요.");
	            }
	        } while (choice != 0);
	    }

	    // 1. 새 도서 추가
	    private void addBook() {
	        System.out.print("도서명 입력 : ");
	        String title = sc.nextLine();
	        System.out.print("저자 입력 : ");
	        String author = sc.nextLine();
	        System.out.println("출판사 입력 : ");
	        String publisher = sc.nextLine();
	        controller.addBook(new Book(title, author, publisher));
	    }

	    // 2. 전체 도서 조회
	    private void displayAllBooks() {
	        ArrayList<Book> books = controller.displayAllBooks();
	        if (books.isEmpty()) {
	            System.out.println("등록된 도서가 없습니다.");
	        } else {
	            books.forEach(System.out::println);
	        }
	    }

	    // 3. 도서 검색
	    private void searchBook() {
	        System.out.print("검색할 도서명 입력 : ");
	        String title = sc.nextLine();
	        Book book = controller.searchBook(title);
	        if (book != null) {
	            System.out.println("검색 결과 : " + book);
	        } else {
	            System.out.println("해당 도서를 찾을 수 없습니다.");
	        }
	    }

	    // 4. 도서 삭제
	    private void deleteBook() {
	        System.out.print("삭제할 도서명 입력 : ");
	        String title = sc.nextLine();
	        if (controller.deleteBook(title)) {
	            System.out.println("도서가 삭제되었습니다.");
	        } else {
	            System.out.println("삭제할 도서를 찾을 수 없습니다.");
	        }
	    }

	    // 5. 도서명 오름차순 정렬
	    private void sortBooks() {
	        controller.sortBooksByTitle();
	    }
}