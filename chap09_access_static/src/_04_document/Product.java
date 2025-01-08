package _04_document;

public class Product {
	/*static int count;
	String name;
	int sum;
	
	Product() {
		
	}
	Product(String name) {
		this.name = name;
	}*/
	 private static int productCount = 0; // 생성된 총 제품 수
	    private String productNumber; // 고유 제품 번호

	    // 생성자
	    public Product() {
	        productCount++; // 제품 생성 시 카운트 증가
	        this.productNumber = "더조은" + productCount; // 고유 제품 번호 설정
	        System.out.println("고유의 제품번호: " + this.productNumber);
	        
	        // 생성된 총 제품 수 출력
	        System.out.println("생성된 총 제품의 개수: " + productCount);
	
	    }
}
