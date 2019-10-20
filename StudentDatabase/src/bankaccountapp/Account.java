package bankaccountapp;

public abstract  class Account implements IBaseRate {


	private String name;
	private String ssn;
	private double balance;

	protected String accountNumber;
	protected  double rate;
	protected  static int index = 1000;
	//List common properties for savings and checking accounts

	//constructor to set base properties and intitialize the accounts
//public  Account()
//{
//this("naresh");
//}
//	public Account(){
//		System.out.println("default account constructor invoked");
//	}

	public Account(String name, String ssn, double initDeposit) {
		this.name = name;
		this.ssn = ssn;
		balance = initDeposit;
		System.out.println("Name" + " :" + name + " " + "ssn" + " :" + ssn + " " + "initDeposit" + " :" + initDeposit);
		index++;
		this.accountNumber = setAccountNumber();
		System.out.println("Account Number" + this.accountNumber);
		System.out.println(getBaseRate());
	}

	private String setAccountNumber() {
		String lastTwoSSN = ssn.substring(ssn.length() - 2, ssn.length());
		int uniqueid = index;
		int randomnumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoSSN + uniqueid;
	}



	public void showInfo() {
		System.out.println("Name" + " :" + name + " " + "Account Number" + " :" + accountNumber + " " + "balance" + " :" + balance+"rate"+" "+rate+"%");
	}

	public abstract void setRate();


	public void compound(){
		double accruedInterest=balance*(rate/100);
		balance=balance+accruedInterest;
		System.out.println("accrued interest"+accruedInterest);
	}
	public void deposit(double amount){
		balance=balance+amount;
		System.out.println("Depositing $"+amount);
	}
	public void  withdraw(double amount){
		balance=balance-amount;
		System.out.println("withdrawing $"+amount);
	}
	public void transfer(String toWhere,double amount){

    balance=balance-amount;
		System.out.println("Transferring $"+amount+" to "+toWhere);
	}
	public void printBalance(){
		System.out.println("your balance is now"+balance);
	}

}

