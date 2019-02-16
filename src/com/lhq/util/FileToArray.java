package com.lhq.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class FileToArray {

	public int[][] ToArray(File file) {

		int[][] data = new int[1000][1000];
		for (int i = 0; i < data.length; i++)
			Arrays.fill(data[i], -1);
		
		StringBuilder result = new StringBuilder();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s = null;
			boolean edgesToggle = false;
			while ((s = br.readLine()) != null) {

				if (s.equals("Edges")) {
					edgesToggle = true;
				}
				if (edgesToggle == true) {
					if (s.charAt(0) < '0' || s.charAt(0) > '9') {
						continue;
					}
					
					s.replace("\n","");
					
					String[] buff = s.split(",");
					int fromIndex = Integer.parseInt(buff[0]);
					int toIndex = Integer.parseInt(buff[1]);
					int edgeCost = Integer.parseInt(buff[2]);
					
					data[fromIndex][toIndex] = edgeCost;
					data[toIndex][fromIndex] = edgeCost;

					
				}
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
}
