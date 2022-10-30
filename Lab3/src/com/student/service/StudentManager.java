package com.student.service;

import com.student.exception.InSufficientAttendenceException;
import com.student.exception.StudentAdmissionException;
import com.student.exception.StudentClassPromotionException;
import com.student.exception.StudentMarksException;
import com.student.exception.StudentNotFoundException;

public interface StudentManager {
	public Boolean findStudent(String id) throws StudentNotFoundException;
	public String checkAttendance(String id) throws InSufficientAttendenceException, StudentNotFoundException;
	public String Marks(String id,String grade) throws StudentAdmissionException, StudentNotFoundException, InSufficientAttendenceException, StudentClassPromotionException, StudentMarksException;
	public String StudentPromotion(String id,String grade) throws StudentAdmissionException, StudentNotFoundException, InSufficientAttendenceException, StudentClassPromotionException, StudentMarksException;
	

}
