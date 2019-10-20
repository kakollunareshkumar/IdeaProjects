package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
	public static void main(String[] args) {
        List<Account> accounts= new LinkedList<Account>();

		String file="C:\\Ashok_videos\\NewBankAccounts.csv";
		//Read  a csv file and create new accounts based on that data

//   Checking ch=new Checking("naresh","321456789",1500);
//		System.out.println("After checking method object creation");
//		Savings s=new Savings( "harsha","1234455",1200);
//		System.out.println("After savings method object creation");
//
//		s.showInfo();
//		System.out.println("*****************************");
//		ch.showInfo();
//		s.deposit(5000);
//		s.withdraw(200);
//		s.transfer("brokerage", 3000);
//		s.compound();

		List<String[]> newAccountHolder=utilities.csv.read(file);
		for(String[] accountholder:newAccountHolder){
			System.out.println("NEW ACCOUNT");
			String name=accountholder[0];
			String ssn=accountholder[1];
			String accountType=accountholder[2];
			double intDeposit=Double.parseDouble(accountholder[3]);
//			System.out.println(accountholder[0]);
//			System.out.println(accountholder[1]);
//			System.out.println(accountholder[2]);
//			System.out.println(accountholder[3]);
			System.out.println(name+" "+ssn+" "+accountType+" "+intDeposit);
			if(accountType.equals("Savings")){
				System.out.println("OPEN A A SAVINGS ACCOUNT");
				accounts.add(new Savings(name, ssn, intDeposit));
			}
			else if(accountType.equals("Checking")){
				System.out.println("OPENING A CHECKING ACCOUNT");
				accounts.add(new Checking(name, ssn, intDeposit));
			}
			else
			{
				System.out.println("Error Reading Account Type");
			}

		}


		for(Account acc:accounts){
			System.out.println("\n********************************");
        acc.showInfo();
		}
	}
}
