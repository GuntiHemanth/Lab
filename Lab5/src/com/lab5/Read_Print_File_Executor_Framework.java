package com.lab5;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Read_Print_File_Executor_Framework {
     static File file;
     static FileInputStream fin;
     static BufferedInputStream bin;
	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		Runnable task1 =()->{
			for(int i=0;i<10;i++){
				file= new File("E:\\ForceFit-Re-Training-2022\\Lab5\\Files");
				System.out.println("File created"+file.getName());
			}
		};
		
		Runnable task2 = () ->{
			try {
				for(int i=0;i<10;i++) {
					fin = new FileInputStream(file);
					bin = new BufferedInputStream(fin); 
					System.out.println("BufferedInputStream "+i);
				   }    
				} 
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    };
	    
	    Runnable task3 =()->{
	    	   
	    	    try {
	    	    	for(int i=0;i<10;i++) {
		    	    	int j;
						while((j=bin.read())!=-1){    
							System.out.print((char)i); 
							}
						System.out.println("File is read"+i);
						bin.close();    
				    	fin.close();  
			    	}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}    
	    	    
	    };
	    
	    service.submit(task1);
	    service.submit(task2);
	    service.submit(task3);
	    
	    System.out.println("**********************");
	    
	    service.shutdown();
	    service.awaitTermination(10, TimeUnit.SECONDS);

}
}	
