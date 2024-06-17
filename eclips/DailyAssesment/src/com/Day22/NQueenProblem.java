package com.Day22;


public class NQueenProblem {
	static final int n=8;
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
			for(i=0;i<col;i++) 
				if(board[row][i]==1)
					return false;
				// check upper diagonal
				for(i=row,j=col;i>=0 && j>=0;i--,j--)
					if(board[i][j]==1)
						return false;
				//Checkbox lower diagonal
				for(i=row,j=col;j>=0 && i<n;i++,j--)
					if(board[i][j]==1)
						return false;
				
			return true;
		
	}
		boolean solveNQueenUtil(int board[][],int col) {
			if(col>=n)
				return true;
			
			for(int i=0;i<n;i++) {
				if(isSafe(board, i, col)) {
					board[i][col]=1;
					if(solveNQueenUtil(board, col+1)==true)
						return true;
					
					board[i][col]=0;
				}
			}
			return false;
		}
		boolean solveNqueen() {
			int board[][]=new int[n][n];
					if(solveNQueenUtil(board, 0)==false) {
						System.out.println("solution does not exiest");
						return false;
					}
					printSolution(board);
					return true;
			
		}
	public static void main(String[] args) {
		NQueenProblem queenProblem=new NQueenProblem();
		queenProblem.solveNqueen();

	}

}
