package com.lab3.immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public final class MyEmpValidator {
                  
	private String employeeID;
	
	List<String> emp_details;

	public String getEmployeeID() {
		return employeeID;
	}
	
	MyEmpValidator(final String employeeNo){
		this.employeeID=employeeNo;
		emp_details=Arrays.asList("IT","Junior Developer","Tier2","Project1");
	}
	
	public Boolean doValidate() {
		System.out.println("empID:"+this.employeeID);
		System.out.println("emp details info:-"+emp_details);
		return Boolean.TRUE;
	}
	
	public List<String> returnData(){
		List<String> cloned=new ArrayList<String>();
		cloned.addAll(emp_details);
		return cloned;
		//return names.stream().collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		MyEmpValidator emp=new MyEmpValidator("TYW15740");
		List<String> res=emp.returnData();
		res.add("456");
		System.out.println("cloned :"+res);
		emp.doValidate();
	
		
	}
	
}
