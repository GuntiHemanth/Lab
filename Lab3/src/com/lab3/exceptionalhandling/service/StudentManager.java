package com.lab3.exceptionalhandling.service;

import com.lab3.exceptionalhandling.exception.InSufficientAttendenceException;
import com.lab3.exceptionalhandling.exception.StudentAdmissionException;
import com.lab3.exceptionalhandling.exception.StudentClassPromotionException;
import com.lab3.exceptionalhandling.exception.StudentMarksException;
import com.lab3.exceptionalhandling.exception.StudentNotFoundException;

public interface StudentManager {
	public Boolean findStudent(String id) throws StudentNotFoundException;
	public String checkAttendance(String id) throws StudentNotFoundException, InSufficientAttendenceException  ;
	public String Marks(String id,String grade) throws StudentClassPromotionException, StudentNotFoundException ;
	public String StudentPromotion(String id,String grade) throws StudentClassPromotionException, StudentNotFoundException;
	

}
