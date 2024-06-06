package com.BacktrackingAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSumBacktracking {
	// function to find all subsets of the given set that sum up to the target
static void findSubsets(int[] set,int target) {
	Arrays.sort(set);
	List<Integer>currentSubsetIntegers=new ArrayList<>();
	findSubsetHelper(set,target,0,currentSubsetIntegers);
	// helper function for the backtracking approach
	
}
static void findSubsetHelper(int [] set,int target,int index,List<Integer>currentSubset) {
	if(target==0) {
		//If target is achieved print the current subset
		System.out.println(currentSubset);
		return;
	}
	for(int i=index;i<set.length;i++) {
		// skip if the current element in the subset
		if(set[i]>target) {
			break;
		}
		// Include the current elemet in the subset
		currentSubset.add(set[i]);
		
		//recurse with the reduced target and next Index
		findSubsetHelper(set, target-set[i],i+1, currentSubset);
		
		// backtrack: remove the added element and try the next element
		currentSubset.remove(currentSubset.size()-1);
	}
}
	public static void main(String[] args) {
		int[] set= {10,20,30,40};
		int target=80;
		System.out.println("Subset with sum "+ target + ":");
		findSubsets(set, target);

	}

}
