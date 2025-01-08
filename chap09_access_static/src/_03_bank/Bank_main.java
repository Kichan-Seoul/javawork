package _03_bank;

import java.util.Scanner;

public class Bank_main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Choose the work");
			System.out.println("1:deposit 2:withdrawal 3:check balance 0:finish");
			int input = sc.nextInt();
			
			switch(input) {
			case 1: 
				System.out.println("Input deposit money");
				int money = sc.nextInt();
				bank.deposit(money);
				break;
			case 2:
				System.out.println("Input withdrawal money");
				int money2 = sc.nextInt();
				bank.withdrawal(money2);
				break;
			case 3:
				bank.getBalance();
				break;
			}
			System.out.println("");
		} 
		/*System.out.println("Balance : ");
		bank.setBalance(sc.nextInt());
		System.out.println("Deposit");
		bank.deposit(sc.nextInt());
		System.out.println(" ");
		
		System.out.println("Withdrawal");
		bank.withdrawal(sc.nextInt());
		System.out.println(" ");
		
		bank.getBalance();*/
		/*int balance = bank.getBalance();*/
		/*System.out.println("Balance : " + balance + "원");	*/
	}

}
