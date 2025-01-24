package _03_Observer;

public class T01_Observer {

	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		
		ObserverA oa = new ObserverA();
		ObserverB ob = new ObserverB();
		
		// 구독자(감시자)를 등록
		subject.registerObserver(oa);
		subject.registerObserver(ob);
		
		subject.notifiyObserver();
		System.out.println();
		subject.notifiyObserver();
		
		subject.removeObserver(oa);
		subject.notifiyObserver();
		
		
	}

}
