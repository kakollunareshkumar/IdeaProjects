package com;


import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Student>students;
        StudentDAO sdao=new StudentDAOImpl();

        System.out.println("All students List");
students=sdao.getAllStudents();
students=sdao.getAllStudents();

		System.out.println("size"+students.size());

        for(Student st:sdao.getAllStudents()){
            System.out.println("Name"+" "+st.getName()+"RollNO"+" "+st.getRollNO()+"Address"+" "+st.getAddress());
        }
		System.out.println("size"+students.size());
        System.out.println("Updating a student");

        Student student=sdao.getAllStudents().get(0);
        student.setName("Ravi");
        sdao.updateStudent(student, 0);

        System.out.println("deleting a student");

        Student student1=sdao.getAllStudents().get(1);
        sdao.deleteStudent(student1);



        System.out.println("Adding a student");
        Student student2=new Student(4, "venkat", "nellore");
        sdao.addStudent(student2);

		System.out.println("retrieving student by id");
	Student student4=sdao.getStudent(2);
		System.out.println("Student details"+student4.getRollNO()+" "+student4.getName()+" "+student4.getAddress());



    }


}
