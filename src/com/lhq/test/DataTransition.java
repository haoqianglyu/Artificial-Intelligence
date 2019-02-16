package com.lhq.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class DataTransition{
	public static String toArray(File file) {
		StringBuilder result = new StringBuilder();
		try{
		BufferedReader br = new BufferedReader(new FileReader(file));
		String s = null;
		while((s = br.readLine())!=null){//use readLine，read one line each time
		if (s.charAt(0)=='#') continue;
		result.append(System.lineSeparator()+s);
		}
		br.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
		return result.toString();
		}
	public static void main(String[] args) {
		File file = new File("TestData/test.txt");
		System.out.println(toArray(file));
	}
}