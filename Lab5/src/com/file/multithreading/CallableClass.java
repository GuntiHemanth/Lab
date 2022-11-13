package com.file.multithreading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Callable;

public class CallableClass implements Callable<String> {

	private File url;
	private String content;

	public CallableClass(File url) {
		super();
		this.url = url;
	}

	@Override
	public String call() throws IOException {

		FileReader fr = new FileReader(url);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while ((line = br.readLine()) != null) {
			content += line;
		}
		return content;
	}
}
