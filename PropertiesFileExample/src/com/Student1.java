package com;

public class Student1 implements java.io.Serializable{
	private int no;
	private int age;
	private String name;
	private transient String address;
	private int height;

	public Student1(int no,int age,String name,String address,int height){

		this.no=no;
		this.age=age;
		this.name=name;
		this.address=address;
		this.height=height;
	}

	public int getno(){

		return no;
	}
	public void  setno(){
		this.no=no;

	}
	public int getAge(){
		return age;
	}

	public void setAge()
	{
		this.age=age;
	}

	public String getName(){
		return name;
	}
	public void setName(){
		this.name=name;
	}

	public void setAddress(){
		this.address=address;

	}
	public String getAddress(){
		return address;
	}

	public void setHeight(){
		this.height=height;
	}
	public int getHeight(){
		return height;
	}
}
