package com;

import java.io.*;
import java.util.Properties;
import java.util.stream.Stream;

public class PropertiesFile {
	public static void main(String[] args) {

		//store properties file
		try(FileOutputStream out=new FileOutputStream("c:\\leag\\prop.txt")){
			Properties p=new Properties();
				p.setProperty("url","localhost");
				p.setProperty("username","naresh");
				p.setProperty("password","kumar");
				p.store(out, null);
		}
		catch(IOException e)
		{

		}

		//Load properties file
		try(FileInputStream f=new FileInputStream("c:\\leag\\prop.txt")){
			Properties p= new Properties();
			p.load(f);
			System.out.println(p.getProperty("url"));
			System.out.println(p.getProperty("username"));
			System.out.println(p.getProperty("password"));
		}
		catch (IOException e ){
			System.out.println(e);
		}
	}
}
