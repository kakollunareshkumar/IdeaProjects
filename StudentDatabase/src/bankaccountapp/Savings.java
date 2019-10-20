package bankaccountapp;

public class Savings extends Account {
	//List properties specific to a savings account
	//constructor to initialize savings account properties
	//List methods  specific to a savings account

	int safetyDepositBoxID;
	int getSafetyDepositBoxKey;


public Savings(String name,String ssn,double initDeposit)
{
super(name,ssn,initDeposit);
accountNumber="1"+accountNumber;
	System.out.println("ACCOUNT NUMBER"+this.accountNumber);
	System.out.println("NEW SAVINGS ACCOUNT CREATED");
	setSafetyDepositBox();

}
private void setSafetyDepositBox(){
	 safetyDepositBoxID=(int)(Math.random()*Math.pow(10,3));
	 getSafetyDepositBoxKey=(int)(Math.random()*Math.pow(10,3));


}

public void showInfo(){
	System.out.println("A	ccount type: savings");
	super.showInfo();
	System.out.println("your savings Account Features"+"\n safety Deposit BOx ID"+safetyDepositBoxID+" "+getSafetyDepositBoxKey);


}

	@Override
	public void setRate() {
rate=getBaseRate()-.25;
	}


}
