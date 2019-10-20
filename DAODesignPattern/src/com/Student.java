package com;

public class Student {
	private int rollNO;
	private String name;
	private String Address;

	Student()
	{


	}

	public Student(int rollNO,String name,String Address)

	{
		this.rollNO=rollNO;
		this.name=name;
		this.Address=Address;
	}

	public int getRollNO(){
		return rollNO;
	}
	public void setRollNO(){

		this.rollNO=rollNO;
	}

	public String getName(){
		return name;
	}
	public void setName(String name){

		this.name=name;
	}
	public String  getAddress(){

		return Address;

	}

	public void SetAddress(){

		this.Address=Address;

	}
}
