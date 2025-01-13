package _02_userException;

public class Bank {
	private int balance;
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void getBalance() {
		System.out.println("Balance : " + balance + "원");	
	}

	/*
	int getBalance() {
		return balance;
	}
	*/
	public void deposit(int dWon) {
		balance += dWon;
		System.out.println(dWon + "원 입금");
		
		
	}
	
	public void withdrawal(int wWon) throws UserException {
		if(wWon > balance) {
			throw new UserException("잔고부족 : " + (wWon - balance) + "모자람");
		} else {
			balance -= wWon;
			System.out.println(wWon + "원 출금");
		}
	}
	
	
}
