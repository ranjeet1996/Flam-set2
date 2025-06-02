For Question 1 NQueen Problem I am giving the process what i have done.
I am trying to place one queen per row.
For each row, try every column.
If the position is safe, place the queen and move to the next row.
If no valid position is found, backtrack (remove the queen and try a new position).
Once all rows are filled without conflict, save the board configuration.


for Question 2 CycleDetection :-
My approach: Depth-First Search (DFS) with Visit States
Represent the graph as an adjacency list.
Use a visited state array:
0 → Unvisited
1 → Visiting (currently in the call stack)
2 → Visited (already processed safely)
For each node:
If unvisited, run DFS.
In DFS:
Mark node as visiting (1).
Recursively visit all neighbors:
If a neighbor is visiting, a cycle is found.
If a neighbor is unvisited, continue DFS.
After visiting all neighbors, mark node as visited (2).

For Question 3 and 4 my knowledge in Android is basic but i will learn that language also.
