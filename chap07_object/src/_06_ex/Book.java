package _06_ex;
//속성	저자 (String)
//		ISBN (int)
//		가격 (int)
//새성자 4개 오버로딩
public class Book {
	String name;
	int isbn;
	int price;
	
	Book() {
		this("Kichan", 971204, 999999);
	}
	
	Book(String name) {
		this(name, 12345, 30000);
	}
	
	Book(String name, int isbn) {
		this(name, isbn, 30000);
	}
	Book(String name, int isbn, int price) {
		this.name = name;
		this.isbn = isbn;
		this.price = price;
	}
	
	int sale(String name) {
		return 50000;
	}
	
}
