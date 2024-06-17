package com.BacktrackingAlgorithm;

public class KnightTourProblem {
	private static final int[] dx= {2,1,-1,-2,-2,-1,1,2};
	private static final int[] dy= {1,2,2,1,-1,-2,-2,-1};
	private static final int n=8;

	public static void main(String[] args) {
		solveKnightTour();
		
	}
	private static void solveKnightTour() {
		int[][] board=new int[n][n];
		
		//Initialization the board with -1 indicating unvisited squares
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]=-1;
				
				
			}
		}
		//Knight starts at the first block
		board[0][0]=0;
		if(solveKTUtil(0,0,1,board)) {
			printSolution(board);
		}
		else {
			System.out.println("Solution does not exist");
		}
	}
private static boolean solveKTUtil(int x,int y,int movei,int [][]board) {
	if(movei==n*n) {
		return true;
	}
	for(int k=0;k<8;k++) {
		int nextX=x+dx[k];
		int nextY=y+dy[k];
		if(isSafe(nextX,nextY,board)) {
			board[nextX][nextY]=movei;
			if(solveKTUtil(nextX, nextY, movei+1, board)) {
				return true;
			}
			else {
				board[nextX][nextY]=-1;// backtracking
			}
		}
	}
	return false;
}
private static boolean isSafe(int x,int y,int[][] board) {
	return(x>=0 && x<n && y>=0 && y<n && board[x][y]==-1 );
}
private static void printSolution(int[][] board) {
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			System.out.printf("%2d ",board[i][j]);
			
		}
		System.out.println();
	}
}
}
