package _04_document;

// 다른 package의 클래스를 사용하려면 import한 후 사용가능
// import 패키지이름.클래스이름
// 클래스이름 : 패키지이름.클래스이름 (클래스이름은 패키지이름.클래스이름이 원래 클래스 이름)
import _03_bank.Bank;
import _02_car.*;

public class OtherClassUse_main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.deposit(90000);
		bank.getBalance();
		bank.withdrawal(5000);
		bank.getBalance();
		
		Ambulance ab = new Ambulance("i4", "BMW");
		System.out.println(ab.model);
		System.out.println(ab.Company);
		ab.siren();
		ab.siren();

	}

}
