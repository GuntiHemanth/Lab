package com.lab3.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class CheckedExceptionEx1 {

	public void file_reader() throws FileNotFoundException, IOException {
		String file_contents = null;
		FileReader fr;
		File filename=new File("C:\\Users\\HEMANTH\\OneDrive\\Desktop\\demofile.txt");
		if(filename.exists()) {
			fr = new FileReader(filename);
			BufferedReader br= new BufferedReader(fr);
			
			System.out.println("The file contents are as follows :-");
			while((file_contents=br.readLine())!=null) {
				System.out.println(file_contents);
			}
			br.close();
		}
	}

	public static void main(String[] args) {
		
			
			try {
			CheckedExceptionEx1 ex1 = new CheckedExceptionEx1();
			ex1.file_reader();
			}catch (FileNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		

	}

}
