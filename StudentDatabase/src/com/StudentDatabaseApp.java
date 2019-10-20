package com;

import java.util.Scanner;

public class StudentDatabaseApp {
	public static void main(String[] args) {
		// write your code here
		System.out.println("Enter how many students to enroll");
		Scanner sc=new Scanner(System.in);
		int numOfStudents=sc.nextInt();
		Student[] students=new Student[numOfStudents];
		for (int i = 0; i <numOfStudents ; i++) {
			students[i]=new Student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println(students[i].toString());
		}

	}
}
