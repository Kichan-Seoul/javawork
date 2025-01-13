package _08_interfacePolymorphism;

public interface Product {
	void PowerOn();
	void PowerOff();
	void VolumeUp(int amount);
	void VolumeDown(int amount);
	
	default void chatWithAI() {
		System.out.println("AI와 대화를 시작합니다.");
	}
	
	default void search(String query) {
		System.out.println("검색 중입니다 : " + query);
	}
}
