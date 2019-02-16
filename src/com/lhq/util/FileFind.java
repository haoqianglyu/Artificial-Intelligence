package com.lhq.util;

/*
find all the testdata
*/
import java.util.*;
import java.io.*;

public class FileFind {
	public static void main(String[] args) {
		List<String> paths = new ArrayList<String>();
		paths = getAllFilePaths(new File("TestData"), paths);
		System.out.println("The following are the TestData,input one index for the test.");
		for (int i=0;i<paths.size();i++) {
			System.out.println(i+" "+paths.get(i));
		}
	}

	private static List<String> getAllFilePaths(File filePath, List<String> filePaths) {
		File[] files = filePath.listFiles();
		if (files == null) {
			return filePaths;
		}
		for (File f : files) {
			if (f.isDirectory()) {
				filePaths.add(f.getPath());
				getAllFilePaths(f, filePaths);
			} else {
				filePaths.add(f.getPath());
			}
		}
		return filePaths;
	}
}
