package com.BacktrackingAlgorithm;

public class RatInMaze {
	private static final int N=4;
	// utility function to print the solution
	private void printSolution(int[][] sol) {
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(" "+sol[i][j]+" ");
				
			}
			System.out.println();
		}
	}
	// A utility function to check if x ,y is valid index for N*N maze
	private boolean isSafe(int[][] maze,int x,int y) {
		return(x>=0 && x<N && y>=0 && y<N && maze[x][y]==1);
	}
	private boolean solveMaze(int[][]maze) {
		int [][] sol= {
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0},
		};
		if(!solveMazeUtil(maze,0,0,sol)) {
			System.out.println("Solution does not exist");
			return false;
		}
		printSolution(sol);
		return false;
	}
// A recursive utility function to solve maze problem
	private boolean solveMazeUtil(int [][] maze,int x,int y,int [][]sol) {
		// If(X,Y is goal ) return true
		if(x==N-1 && y==N-1) {
			sol[x][y]=1;
			return true;
		}
		// check if maze [x][y] is valid
		if(isSafe(maze, x, y)) {
			// mark x,y,as part of solution part
			sol[x][y]=1;
			
			// move forward in x direction
			if(solveMazeUtil(maze, x+1,y, sol)) {
				return true;
			}
			if(solveMazeUtil(maze, x, y+1, sol))
				return true;
			
			// if moving in y direction doesn't give solution
			// move back y dirextion
			if(solveMazeUtil(maze, x-1,y, sol)) {
				return true;
			}
			if(solveMazeUtil(maze, x, y-1, sol)) {
				return true;
			}
			
			sol[x][y]=0;
			return false;
		}
		return false;
	}
	public static void main(String[] args) {
		RatInMaze  ratInMaze=new RatInMaze();
		int[][] maze= {
				{1,0,0,0},
				{1,1,0,1},
				{0,1,0,0},
				{1,1,1,1},
				
		};
		ratInMaze.solveMaze(maze);

	}

}
