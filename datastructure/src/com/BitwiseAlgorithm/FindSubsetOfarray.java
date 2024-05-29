package com.BitwiseAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class FindSubsetOfarray {
	public static List<List<Integer>>findSubsets(int[]arr){
		int n=arr.length;
		List<List<Integer>>subsetsList=new ArrayList<>();
		for(int i=0;i<(1<<n);i++) {
			List<Integer>subsetIntegers=new ArrayList<>();
			for(int j=0;j<n;j++) {
				if((i&(1<<j))!=0) {
					subsetIntegers.add(arr[j]);
				}
			}
			subsetIntegers.addAll(subsetIntegers);
		
		}
		return subsetsList;
		}

	public static void main(String[] args) {
		int[]arr= {1,2,3};
		List<List<Integer>>allSubsets=findSubsets(arr);
		for(List<Integer>suList:allSubsets) {
			System.out.println(suList);
		}
		
	}

}
