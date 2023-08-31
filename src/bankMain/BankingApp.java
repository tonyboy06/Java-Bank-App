package bankMain;

import java.util.Scanner;
import bankDetails.*;

public class BankingApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many number of customer you want to input? : ");
		int n = sc.nextInt();
		
		
		// this create an array without element
		BankDetails C[] = new BankDetails[n];
		
		// this add element to array
		for (int i = 0; i < C.length; i++) {
			// instantiate element
			C[i] = new BankDetails();
			C[i].openAccount();
		}
		
		int ch;
		
		do {
			System.out.println("\n ***Banking System Application***");
			System.out.println("1. Display all account details \n 2. Search by Account number \n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");
			
			System.out.print("Enter your choice : ");
			ch = sc.nextInt();
			
			switch(ch) {
				case 1:
					for (int i = 0; i < C.length; i++) {
						C[i].showAccount();
					}
					break;
					
				case 2:
					System.out.print("Enter account no. you want to search : ");
					String ac_no = sc.next();
					
					// this variable can be access even in the next case
					boolean found = false;
					
					for (int i = 0; i < C.length; i++) {
						found = C[i].search(ac_no);
						
						if (found) break;
						if (!found) System.out.println("Search Failed!!...Account doesn't Exist...!!!");
						
					}
					break;
				
				case 3:
					System.out.print("Enter account no. : ");
					ac_no = sc.next();
					// look at this one
					found = false;
					
					for (int i = 0; i < C.length; i++) {
						found = C[i].search(ac_no);
						
						if (found) {
							C[i].deposit();
							break;
						}
						
						if (!found) System.out.println("Search Failed!!...Account doesn't Exist...!!!");
					}
					break;
					
					
				case 4:
					System.out.print("Enter account no. : ");
					ac_no = sc.next();
					found = false;
					
					for (int i = 0; i < C.length; i++) {
						found = C[i].search(ac_no);
						
						if (found) {
							C[i].withdrawal();
							break;
						}
						
						if (!found) System.out.println("Search Failed!!...Account doesn't Exist...!!!");
					}
					break;
				case 5:
					System.out.print("See you soon...!!!!");
					break; 	
			}
			
		} while (ch != 5);
		
		sc.close();
	}
}
