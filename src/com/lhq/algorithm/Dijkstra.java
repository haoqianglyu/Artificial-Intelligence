package com.lhq.algorithm;

public class Dijkstra {
	public String dij(int orig, int dest, int[][] map) {
		final int M = -1;
		
		int n = map.length; // the number of vertex
		int[] shortest = new int[n]; // store the shortest path from start to other points
		boolean[] visited = new boolean[n]; // mark if this point's shortest path has been calculated
		shortest[orig] = 0;
		visited[orig] = true;

		// store the shortest path from start to other points
		String[] path = new String[n];	//store the path
		for (int i = 0; i < n; i++) {
			path[i] = new String(orig + "--->" + i);
		}
		for (int count = 0; count != n - 1; count++) {
			// select one point which is closest to the start as mark point
			int k = M;
			int min = M;
			for (int i = 0; i < n; i++)// traverse each point
			{
				if (!visited[i] && map[orig][i] != M) // if the point has not been traversed and is connected to start
				{
					if (min == -1 || min > map[orig][i]) // find a point closest to start
					{
						min = map[orig][i];
						k = i;
					}
				}
			}
			
			if (k == M) {
				System.out.println("the input map matrix is wrong!");
				return null;
			}
			shortest[k] = min;
			visited[k] = true;
			// use k as the center,update the distance that orig has not visited
			for (int i = 0; i < n; i++) {
				if (!visited[i] && map[k][i] != M) {
					int callen = min + map[k][i];
					if (map[orig][i] == M || map[orig][i] > callen) {
						map[orig][i] = callen;
						path[i] = path[k] + "--->" + i;
					}
				}
			}
		}

		if (shortest == null) {
			return "no path";
		}
		String answer = "";
		for (int i = 0; i < shortest.length; i++) {
			if (i == dest) {
				answer += "the shortest distance from " + (orig) + " to " + (i) + " is: " + shortest[i];
			}
		}
		answer += "\nthe shorest path from " + orig + " to " + dest + " is: " + path[dest];
		return answer;
	}
}