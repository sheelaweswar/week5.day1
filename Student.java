package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name is : test");
	}
	public void studentDept() {
		System.out.println("Student Dept is : IT");
	}
	public void studentId() {
		System.out.println("Student Id is : 2");
	}
	
	public static void main(String[] args) {
		Department objdept = new Department();
		Student objstu = new Student();
		College objcoll =new College();
		objdept.DepartmentName();
		objstu.studentName();
		objstu.studentDept();
		objstu.studentId();
		objcoll.collegeName();
		objcoll.collegeCode();
		objcoll.collegeRank();
	}

}
