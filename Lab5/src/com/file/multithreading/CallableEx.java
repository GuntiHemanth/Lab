package com.file.multithreading;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableEx {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(11);
		List<Callable<String>> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			File f = new File("E:\\Demo_FIles\\files\\" + (i + 1) + ".txt");
			CallableClass task = new CallableClass(f);
			list.add(task);
		}
		List<Future<String>> results = service.invokeAll(list);
		service.shutdown();

		System.out.println("Result:");
		String content = "";
		try {
			for (Future<String> future : results) {
				content += future.get() + System.lineSeparator();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println(content);

	}

}
