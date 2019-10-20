package com;

import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO{

	List<Student> students;

	public StudentDAOImpl(){
		students = new ArrayList<Student>();
		Student student1=new Student(123, "naresh", "bangalore");
		Student student2=new Student(2, "suresh", "guntur");
		Student student3=new Student(10, "ramesh", "pamur");
		students.add(student1);
		students.add(student2);
		students.add(student3);
	}




	public List<Student> getAllStudents(){

 		return students;
	}

	public  void  updateStudent(Student student, int index){
		students.get(index).setName(student.getName());
		System.out.println("Updated student "+" "+student.getRollNO()+" "+student.getName());
		for(Student st:students)
		{
			System.out.println(st.getRollNO()+" "+st.getName()+" "+st.getAddress());
		}
	}

	public void deleteStudent(Student student){
students.remove(student);
		for(Student st:students)
		{
			System.out.println(st.getRollNO()+" "+st.getName()+" "+st.getAddress());
		}

	}

	public void addStudent(Student student){
	students.add(student);
		System.out.println("Added student to students list");
	for(Student st:students)
	{
		System.out.println(st.getRollNO()+" "+st.getName()+" "+st.getAddress());
	}

	}

public Student getStudent(int rollNO){

		return students.get(rollNO);
}

}
