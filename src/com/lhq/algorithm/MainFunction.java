package com.lhq.algorithm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lhq.util.FileToArray;

public class MainFunction {
	public static void main(String[] args) {
		
		List<String> paths = new ArrayList<String>();
		paths = getAllFilePaths(new File("TestData"), paths);
		
		Scanner sc = new Scanner(System.in);
		int input;
		while(true) {
			long startTime=System.currentTimeMillis();   //get the start time  
			System.out.println("The following are the TestData, input one index for the test, or input -1 to end.");
			for (int i=0;i<paths.size();i++) {
				System.out.println(i+" "+paths.get(i));
			}
			
			if((input=sc.nextInt())!=-1){
				//System.out.println(input);
				System.out.println("OK, file "+paths.get(input)+" has been selected!");
				
				System.out.print("Please input a start point: ");
				Scanner sc2 = new Scanner(System.in);
				int start = sc2.nextInt();
				
				System.out.print("Please input an end point: ");
				Scanner sc3 = new Scanner(System.in);
				int end = sc3.nextInt();
				
				File file = new File(paths.get(input));
				FileToArray fto = new FileToArray();
				int[][] arr = fto.ToArray(file);
				Dijkstra dijkstra = new Dijkstra();
				System.out.println(dijkstra.dij(start, end, arr));
				long endTime=System.currentTimeMillis(); //get the end time
				System.out.println("the runtime is： "+(end-start)+"ms");  
				
				System.out.println();
				System.out.println();
			} else {
				System.out.println("Algorithm ends!");
				System.exit(0);
			}
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
