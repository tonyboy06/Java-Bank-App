package bankDetails;

import java.util.Scanner;

public class BankDetails {
	Scanner sc = new Scanner(System.in);
	private String accno;
	private String acc_type;
	private String name;
	private long balance;
		
	public void openAccount() {
		System.out.print("Enter account number : ");
		accno = sc.nextLine();
		System.out.print("Enter accound type : ");
		acc_type = sc.nextLine();
		System.out.print("Enter name :");
		name = sc.nextLine();
		System.out.print("Enter Balance : ");
		balance = sc.nextLong();
	}
	
	public void showAccount() {
		System.out.println("Name of account holder : " + name);
		System.out.println("Account no. : " + accno);
		System.out.println("Account type : " + acc_type);
		System.out.println("balance : " + balance);
	}
	
	public void deposit() {
		long amt;
		System.out.print("Enter the amount you want to deposit : ");
		amt = sc.nextLong();
		balance = balance + amt;
	}
	
	public void withdrawal() {
		long amt;
		System.out.print("Enter the amount you want to withdraw : ");
		amt = sc.nextLong();
		
		if (balance >= amt) {
			balance = balance - amt;
			System.out.println("Balance after withdrawal : " + balance);
		} else {
			System.out.println("Your balance is less than " + amt + " \tTransaction Failed...!!!");
		}
	}
	
	public boolean search(String ac_no) {
		if (accno.equals(ac_no)) {
			showAccount();
			return true;
		}
		return false;
	}
		
}

