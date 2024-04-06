package firstbank;

import java.util.Scanner;
class BankAccount {
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	 
	// creating constructor to get customer name and id
	BankAccount( String cname, String cid){
		
		customerName= cname;
		customerId= cid;
		
	}
	
	
	
	void deposit ( int amount) {
		if (amount !=0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
		
	}
	
	void withdraw (int amount) {
		
		if (amount !=0) {
			balance = balance- amount;
			previousTransaction= -amount;
		}
	}
	
	
	void getPreviousTransaction () {
		
		if (previousTransaction >0) {
			System.out.println ("Deposited:" +  previousTransaction);
			
		}
		else if  (previousTransaction <0) {
			System.out.println ("Withdraw:" + Math.abs(previousTransaction));
			
		}
		else {
			System.out.println("No transaction occured");
		}
	}
	
	void showMenu() {
		char option= '\0';
		try (Scanner scanner = new Scanner (System.in)) {
			System.out.println ("Welcome:" + customerName );
			System.out.println ("Your ID:" + customerId );
			System.out.println ("\n" );
			System.out.println (" A. Check Balance");
			System.out.println (" B. Deposit");
			System.out.println (" C. Withdraw");
			System.out.println (" D. Previous Transaction");
			System.out.println (" E. Exit");
			
			
			
			do
			{
				System.out.println ("======================");
				System.out.println ("Enter an option:");
				System.out.println ("======================");
				 option=scanner.next().charAt(0);
				System.out.println ("\n");
				
				switch (option)
				{
				case 'A':
				System.out.println ("=================");
				System.out.println ("Balance =" + balance);
				System.out.println ("\n");
				break;
				
				case 'B':
					System.out.println("==============");
					System.out.println ("Enter an amounto deposit:");
					System.out.println("----------------");
					 int amount=scanner.nextInt();
					 deposit (amount);
					 System.out.println("\n");
					 break;
					 
					 
				case 'C':
					
					System.out.println("==============");
					System.out.println("Enter Withdraw amount");
					System.out.println("==============");
					  int amount2=scanner.nextInt();
					 withdraw(amount2);
					 System.out.println("==============");
					 break;
					 
				case 'D':
					System.out.println("==============");
					getPreviousTransaction ();
					System.out.println("==============");
					System.out.println ("\n");
				case'E':
					System.out.println("****************");
					break;
					
					default:
						System.out.println("Invalid options");
						break;
				}
				} while (option!= 'E');
		}
		
		System.out.println("Thanks for using service");
			
			
			
			
			
			
			
		}
		
		
		
		
	}	
	
