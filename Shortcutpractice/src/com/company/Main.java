package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {


    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getJ() {
        return j;
    }

    public void setJ(String j) {
        this.j = j;
    }

    private int i;

    private String j;



    public static void main(String[] args) {

        System.out.println("welcome world");
	// write your code here

        String str="naresh";
        System.out.println("substring"+str.substring(0,6));


        String operation="naresh";
        String s3=Calling.called();
        System.out.println(operation+" "+" "+s3);
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

StringBuffer sb=new StringBuffer("welcome to programming");






    }


    public Main() {
    }

    @Override
    public  String toString() {
        return "Main{" +
                "i=" + i +
                ", j='" + j + '\'' +
                '}';
    }



}
