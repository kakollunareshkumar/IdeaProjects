package com;

public class EmailApp {
	public static void main(String[] args) {
		Email email=new Email("naresh", "kakollu");
     email.setAlternateEmail("naresh3456@gmail.com");
		System.out.println(" ALternate Email is "+email.getAlternateEmail());
		System.out.println(email.getMailboxcapacity());
		email.setPassword("naresh3456");
		System.out.println("New Password"+email.getPassword());
		System.out.println(email.showInfo());
	}
}
