package bankaccountapp;

public class Checking extends Account {
	//List properties specific to a checking account
	//constructor to initialize checking account properties
//	public Checking(String name)
//	{
//		super(name);

	@Override
	public void setRate() {
rate=getBaseRate()*.15;
	}
//	}

	int debitCardNumber;
	int debitPIN;

	public Checking(String name,String ssn,double initDeposit)
	{
	super(name,ssn,initDeposit);
	accountNumber="2"+accountNumber;
		System.out.println("ACCOUNT NUMBER"+this.accountNumber);
		System.out.println("NEW CHECKING ACCOUNT");
		setDebitCard();
	}
	//List methods  specific to a checking account

	public void showInfo(){
		super.showInfo();
		System.out.println("Checking Account Features"+"\n Debit Card Number"+debitCardNumber+" "+"\nDebitCardPin"+debitPIN);

	}
	private void setDebitCard(){

		debitCardNumber=(int)(Math.random()*Math.pow(10,12));
		debitPIN=(int)(Math.random()*Math.pow(10,4));
	}

}
