package com.lab3.immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Student Validator using Immutable class

public final class MyStudentValidator {
	
	private String StudentID;
	 List<String> std_info ;
	
	MyStudentValidator(final String studentNo) {
		this.StudentID = studentNo;
		std_info = Arrays.asList("B.TECH","Second_Year","E.C.E");
	}
	
	public Boolean doValidate() {
		System.out.println("StudentID : "+this.StudentID);
		System.out.println("Student Info : "+this.std_info);
		return Boolean.TRUE;	
	}

	public String getStudentID() {
		return StudentID;
	}

	public List<String> returnData() {
		List<String> cloned = new ArrayList<>();
		cloned.addAll(std_info);
        return cloned;
	}
	
	
	public static void main(String[] args) {
		MyStudentValidator emp = new MyStudentValidator("TSUQ1A0485"); 
		emp.doValidate();
		
		List<String> res = emp.returnData();
		res.add("410");
		System.out.println("res:"+res);
		emp.doValidate();
		

	}

}
