package com.BacktrackingAlgorithm;
public class NQueenProblem {
	final int n=8;
	void printSolution(int board[][]) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(" "+board[i][j]+" ");
			}
			System.out.println();
		}
	}
	boolean isSafe(int board[][],int row,int col) {
		int i,j;
		// check this row on left side
		for(i=0;i<col;i++) {
			if(board[row][i]==1) {
				return false;
			}
		}
		//check upper diagonal on left side
		for(i=row,j=col;i>=0 && j>=0;i--,j--) {
			if(board[i][j]==1) {
				return false;
			}
		}
		// check lower diagonal on left side
		for(i=row,j=col;j>=0 && i<n;i++,j--) {
			if(board[i][j]==1) {
				return false;
			}
			
		}
		return true;
	}
	//recursive utility function to solve a N Queen problem
	boolean solveNQUtil(int board[][],int col) {
		if(col>=n) {
			return true;
		}
		// try placing this queen in all rows one by one
		for(int i=0;i<n;i++){
			// check if queen can be placed on board[i][col]]
			if(isSafe(board, i, col)) {
				//place this queen on board
				board[i][col]=1;
				//Recursive  place Rest  of queen
				if(solveNQUtil(board, col+1)==true) {
					return true;
				}
				board[i][col]=0;
			}
			
		}
		return false;
		
	}
	boolean solveNQ() {
		int board[][]= {
				{0, 0 ,0 ,0 ,0 ,0 ,0 ,0 },
				{0, 0 ,0 ,0 ,0 ,0 ,0 ,0 },
				{0, 0 ,0 ,0 ,0 ,0 ,0 ,0 },
				{0, 0 ,0 ,0 ,0 ,0 ,0 ,0 },
				{0, 0 ,0 ,0 ,0 ,0 ,0 ,0 },
				{0, 0 ,0 ,0 ,0 ,0 ,0 ,0 },
				{0, 0 ,0 ,0 ,0 ,0 ,0 ,0 },
				{0, 0 ,0 ,0 ,0 ,0 ,0 ,0 },
		};
		if(solveNQUtil(board, 0)==false) {
			System.out.println("Solution does not exiest");
			return false;
		}
		printSolution(board);
		return true;
	}
	


	public static void main(String[] args) {
		NQueenProblem queenProblem=new NQueenProblem();
		queenProblem.solveNQ();

	}

}
