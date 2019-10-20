package com;

import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private String email;
    private int mailboxcapacity=500;
    private String alternateEmail;
    private String companySuffix="hpe.com";

//Ask for a department
//Generate a random password
//set the mailbox capacity
//set the alternate email
//change the password
//call a method that reurns a random password

	//constructor to receive firstname and lastname
	public Email(String firstname,String lastname)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		System.out.println("email created "+this.firstname+" "+this.lastname);

		//call a method asking for the department --return the department
		this.department=setDepartment();
		System.out.println("department given"+" "+this.department);
		this.password=randomPassword(8);
		System.out.println("your password is"+" "+this.password);
		email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companySuffix;
		System.out.println("your email is "+email);
	}

	private String setDepartment(){

		System.out.println("Enter department id \n 1.sales \n 2.Development \n 3. Accounting  \n 4.None \n Enter your input");
		Scanner sc=new Scanner(System.in);
		int deptChoice=sc.nextInt();
		if(deptChoice==1){
			return  "sales";

		}else if(deptChoice==2)
		{
			return  "Development";
		}
		else  if(deptChoice==3)
		{
			return  "Accounting";
		}
		else
		{
			return "None";
		}
	}

	private  String randomPassword(int  length)
	{
		String key="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] password=new char[length];
		for(int i=0;i<length;i++)
		{
			double d=(Math.random());

			double d1=d*26;

			int rand=(int)(d1);

			password[i]=key.charAt(rand);

		}
		return  new String(password);
	}

	public void setMailboxcapacity(int capacity)
	{
		this.mailboxcapacity=mailboxcapacity;
	}
public void setAlternateEmail(String altEmail ){

    	this.alternateEmail=altEmail;
}

	public String getPassword() {
		return password;
	}


	public int getMailboxcapacity() {
		return mailboxcapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String showInfo(){
		return "Displayname"+firstname+"."+lastname+"@"+companySuffix+" "+"mailboxcapacity"+mailboxcapacity;

	}
}
