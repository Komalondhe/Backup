package com.Day19;

import java.util.Arrays;

public class TravellingSalesMan {
	public static int FindMinCost(int[][] graph) {
		int n=graph.length;
		int VISITTED_All=(1<<n)-1;
		int[][]dp=new int[n][1<<n];
		for(int[]row:dp) {
			Arrays.fill(row, -1);
			
		}
		return tsp(graph,1,0,dp,VISITTED_All);
		}
	private static int tsp(int[][]graph,int mask,int pos,int[][]dp,int VISITTED_All) {
		if(mask==VISITTED_All) {
			return graph[pos][0];
			
		}
		if(dp[pos][mask]!=-1) {
			return dp[pos][mask];
		}
		int minCost=Integer.MAX_VALUE;
		for(int city=0;city<graph.length;city++) {
			if((mask & (1<<city))==0) {
				int newCost=graph[pos][city]+tsp(graph, mask|(1<<city),city,dp,VISITTED_All);
				minCost=Math.min(minCost, newCost);
			}
		}
		dp[pos][mask]=minCost;
		return minCost;
	}

	public static void main(String[] args) {
		int graph[][]= {
				{0,10,15,20},
				{10,0,35,25},
				{15,35,0,30},
				{20,25,30,0},
		};
		System.out.println("The minimum cost to visit all cities and return to the starting citys is:"+FindMinCost(graph));

	}

}
