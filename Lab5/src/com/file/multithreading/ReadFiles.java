package com.file.multithreading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles implements Runnable {

	private File url;

	public ReadFiles(File url) {
		super();
		this.url = url;
	}

	@Override
	public void run() {
		try {
			FileReader fr = new FileReader(url);
			BufferedReader br = new BufferedReader(fr);

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}