package _02_ExcutionControl;

public class Bank {
	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	public void withdraw(int money) {
		if(balance < money) {
			System.out.println("잔액 부족");
		} else {
			balance -= money;
		}
	}
}
