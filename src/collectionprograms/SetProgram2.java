package collectionprograms;

import java.util.LinkedHashSet;
import java.util.Set;

class Student
{
	private int id;
	public Student(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
}

public class SetProgram2 
{
	public static void main(String[] args)
	{
		Set<Student> allStudents=new LinkedHashSet<Student>();
		allStudents.add(new Student(10));
		allStudents.add(new Student(20));
		allStudents.add(new Student(30));
		allStudents.add(new Student(40));

		for (Student student : allStudents) 
		{
			System.out.println(student.getId());	
		}
	}
}
