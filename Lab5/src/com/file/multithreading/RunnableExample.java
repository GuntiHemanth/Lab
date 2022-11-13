package com.file.multithreading;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExample {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		for(int i=0;i<10;i++) {
		File f = new File("E:\\Demo_FIles\\files"+(i+1)+".txt");
		ReadFiles task = new ReadFiles(f);
		service.submit(task);

	  }

	}
}
	
