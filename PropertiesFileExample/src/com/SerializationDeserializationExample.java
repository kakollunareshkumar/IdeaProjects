package com;

import java.io.*;

public class SerializationDeserializationExample {
	public static void main(String[] args) {

		Student1 obj=new Student1(10, 25, "naresh", "nellore", 510);

		try{
			FileOutputStream fout=new FileOutputStream("c:\\leag\\myser.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(obj);
			out.close();
			System.out.println("serialization done");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
