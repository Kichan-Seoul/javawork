package _03_bank;

public class Bank {
	private int balance;
	void setBalance(int balance) {
		this.balance = balance;
	}
	void getBalance() {
		System.out.println("Balance : " + balance + "원");	
	}

	/*
	int getBalance() {
		return balance;
	}
	*/
	void deposit(int dWon) {
		balance += dWon;
		System.out.println(dWon + "원 입금");
		
		
	}
	
	void withdrawal(int wWon) {
		if(wWon > balance) {
			System.out.println("잔액이 부족합니다.");
		} else {
			balance -= wWon;
			System.out.println(wWon + "원 출금");
		}
	}
	
	
}
