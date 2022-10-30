package com.lab3.exceptionalhandling.controller;

import com.lab3.exceptionalhandling.exception.InSufficientAttendenceException;
import com.lab3.exceptionalhandling.exception.StudentAdmissionException;
import com.lab3.exceptionalhandling.exception.StudentClassPromotionException;
import com.lab3.exceptionalhandling.exception.StudentNotFoundException;
import com.lab3.exceptionalhandling.service.MyStudentManager;
import com.lab3.exceptionalhandling.service.StudentManager;

public class MyController extends BaseController {

	public static void main(String[] args) throws StudentAdmissionException, StudentNotFoundException, InSufficientAttendenceException {
		StudentManager student = new MyStudentManager();
		
		String data = "";
		try {
			data = student.StudentPromotion("100", "First Class");
		} catch (StudentClassPromotionException sce) {
			System.out.println("Expected one");
			sce.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Bug in my code");
			ex.printStackTrace();
		}
		
		System.out.println(data);

	}
}
