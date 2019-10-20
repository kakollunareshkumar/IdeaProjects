package com;

import java.io.*;

class Student implements Serializable {

	int id;
	String name;
	public Student(int id, String name)
	{
		this.id=id;
		this.name =name;
	}
}

public class SeDeExample {
	public static void main(String[] args) {
Student s1=new Student(101,"naresh");
try{
ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("c:\\leag\\serdeser.txt"));
	out.writeObject(s1);
out.flush();
out.close();
}
catch(IOException e)
		{
			System.out.println(e);
		}

try
{
	ObjectInputStream in=new ObjectInputStream(new FileInputStream("c:\\leag\\serdeser.txt"));
	   Student s=(Student)in.readObject();

	System.out.println(s.id+" "+s.name);
}
catch(IOException e){
	System.out.println(e);
} catch (ClassNotFoundException e) {
	e.printStackTrace();
}


	}
}
