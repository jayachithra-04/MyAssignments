package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName()
	{
		System.out.println("Student Name : Jayachithra");
	}
	public void studentDept()
	{
		System.out.println("Student Department : CSE");
	}
	public void studentId()
	{
		System.out.println("Student Id :57");
	}
public static void main(String[] args)

{
	Student stdobj = new Student();
	stdobj.collegeName();
	stdobj.collegeCode();
	stdobj.collegeRank();
	stdobj.deptName();
	stdobj.studentName();
	stdobj.studentDept();
	stdobj.studentId();
	
}
}
