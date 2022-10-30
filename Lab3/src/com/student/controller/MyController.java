package com.student.controller;

import com.student.exception.InSufficientAttendenceException;
import com.student.exception.StudentAdmissionException;
import com.student.exception.StudentClassPromotionException;
import com.student.exception.StudentNotFoundException;
import com.student.service.MyStudentManager;
import com.student.service.StudentManager;

public class MyController extends BaseController {

	public static void main(String[] args) throws StudentAdmissionException, StudentNotFoundException, InSufficientAttendenceException {
		StudentManager student = new MyStudentManager();
		
		String data = "";
		try {
			data = student.StudentPromotion("116", "destination");
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
