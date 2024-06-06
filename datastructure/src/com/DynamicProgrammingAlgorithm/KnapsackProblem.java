package com.DynamicProgrammingAlgorithm;

public class KnapsackProblem {
	public static int knapSack(int[] weight,int[]value,int weightLimit) {
		int n=weight.length;
		int[][] dp=new int[n+1][weightLimit+1];
		for(int i=0;i<=n;i++) {
			for(int w=0;w<=weightLimit;w++) {
				if(i==0 || w==0) {
					dp[i][w]=0;
					}
				else if(weight[i-1]<=w) {
					dp[i][w]=Math.max(dp[i-1][w], dp[i-1][w-weight[i-1]]+value[i-1]);
					
				}
				else {
					dp[i][w]=dp[i-1][w];
				}
			}
		}
		return dp[n][weightLimit];
	
	}

	public static void main(String[] args) {
		int[]weight= {2,3,4,5};
		int[]values= {3,4,5,6};
		int weightLimit=5;
		System.out.println("Maximum value in knapSack= "+knapSack(weight, values, weightLimit));
		
	}

}
