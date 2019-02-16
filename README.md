# Dijkstra algorithm
## Introduction
Dijkstra's algorithm is an algorithm we can use to find shortest distances or minimum costs depending on what is represented in a graph. You're basically working backwards from the end to the beginning, finding the shortest leg each time. The steps to this algorithm are as follows:

Step 1: Start at the ending vertex by marking it with a distance of 0, because it's 0 units from the end. Call this vertex your current vertex, and put a circle around it indicating as such.


Step 2: #Identify all of the vertices that are connected to the current vertex with an edge. Calculate their distance to the end by adding the weight of the edge to the mark on the current vertex. Mark each of the vertices with their corresponding distance, but only change a vertex's mark if it's less than a previous mark. Each time you mark the starting vertex with a mark, keep track of the path that resulted in that mark.


Step 3: Label the current vertex as visited by putting an X over it. Once a vertex is visited, we won't look at it again.


Step 4: Of the vertices you just marked, find the one with the smallest mark, and make it your current vertex. Now, you can start again from step 2.


Step 5: Once you've labeled the beginning vertex as visited - stop. The distance of the shortest path is the mark of the starting vertex, and the shortest path is the path that resulted in that mark.

## How to Run My Program
Step 1: Download the zip file from my github
