package com;

import java.util.List;

public interface StudentDAO {


	public List<Student>  getAllStudents();

	public void updateStudent(Student student, int index);

	public void deleteStudent(Student student);

	public void addStudent(Student student);

	public Student getStudent(int rollNO);
}
