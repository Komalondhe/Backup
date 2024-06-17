package com.Day21;
public class KnightsTour {
	private static final int N = 8;
	private static final int[] xMove = {2, 1, -1, -2, -2, -1, 1, 2};
	private static final int[] yMove = {1, 2, 2, 1, -1, -2, -2, -1};
	private static boolean isSafe(int x, int y, int[][] board) {
		return (x >= 0 && x < N && y >= 0 && y < N && board[x][y] ==-1);
		}
	private static boolean solveKnightsTour(int[][] board, int moveX,
			int moveY, int moveCount) {
		if (moveCount == N * N) {
			return true;
			}
		for (int k = 0; k < N; k++) {
			int nextX = moveX + xMove[k];
			int nextY = moveY + yMove[k];
			if (isSafe(nextX, nextY, board)) {
				board[nextX][nextY] = moveCount;
				if (solveKnightsTour(board, nextX, nextY, moveCount + 1))
				{
					return true;
					}
				else {
					board[nextX][nextY] = -1;
					}
				}
			}
		return false;
		}
	public static void solve() {
		int[][] board = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				board[i][j] = -1;
				}
			}
		int startX = 0, startY = 0;
		board[startX][startY] = 0;

		if (!solveKnightsTour(board, startX, startY, 1)) {
			System.out.println("Solution does not exist");
			} else {
				printSolution(board);
				}
		}
	private static void printSolution(int[][] board) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.printf("%2d ", board[i][j]);
				}
			System.out.println();
			}
		}
	public static void main(String[] args) {
		solve();
		}
	}
