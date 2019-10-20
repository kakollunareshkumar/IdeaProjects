package userdefinedlist;

import java.util.ArrayList;

public class AddingData {

	public static void main(String[] args) {

		ArrayList<Student> studentlist=new ArrayList<Student>();
		Student s1=new Student("naresh", 101, 12345);
		Student s2=new Student("harsha", 102, 67890);
		Student s3=new Student("sandeep",103, 345678);
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);
		for (Student student : studentlist) {
			System.out.println(student.name);
			System.out.println(student.id);
			System.out.println(student.rollno);
		}
	}



}
