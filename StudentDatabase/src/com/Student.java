package com;

import java.util.Scanner;

public class Student {

    //constructor for name and year of student
    //generate an id
    //Enroll course
    //view balance
    //pay tution
    //show status
    private String firstname;
    private String lastname;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tutionBalance;
    private  static int costOfCourse=600;
    private static int id=1001;

    public Student(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student first name");
        this.firstname=sc.nextLine();
        System.out.println("Enter student last name");
        this.lastname=sc.nextLine();
        System.out.println("1.Freshman\n2.Sophmore\n3.Junior\n4.senior\nEnter student class level");
        this.gradeYear=sc.nextInt();
        setStudentID();
        System.out.println("firstname"+" "+firstname+" "+"lastname"+" "+lastname+" "+"gradeYear"+" "+gradeYear+" "+"studentID"+" "+studentID);
        id++;

    }
    public void setStudentID(){
     this.studentID =gradeYear+" "+id;
    }
    //Enroll in courses
    public void enroll()
    {

        do{
        System.out.println("Enter course to enroll(Q to quit):");
        Scanner sc=new Scanner(System.in);
        String course=sc.nextLine();
        if(!course.equals("Q"))
        {
            courses=courses+"\n"+course;
            tutionBalance=tutionBalance+costOfCourse;

        }
        else{
            break;
        }}while(1!=0);


        System.out.println("Enrolled in "+courses);
        System.out.println("tution balance"+tutionBalance);

    }

    public void viewBalance()
    {
        System.out.println("your balance is"+tutionBalance);

    }
    //pay tution
    public void payTuition( )
    {
        System.out.println("Enter tution fees in numbers");
        Scanner n=new Scanner(System.in);
        int payment=n.nextInt();
        tutionBalance=tutionBalance-payment;
        System.out.println("Thank you fro the payment"+payment);
        viewBalance();
    }
    public String toString(){

        return firstname+" "+lastname+" "+courses+" "+tutionBalance+" "+studentID;
    }

}
