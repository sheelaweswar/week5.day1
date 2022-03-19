package org.college;

import org.department.Department;
import org.student.Student;

public class College extends Student {
	public void collegeName() {
		System.out.println("College Name is : VCEW");
	}
	public void collegeCode() {
		System.out.println("College code is : VCEW01");
	}
	public void collegeRank() {
		System.out.println("College Rank is : 2");
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
