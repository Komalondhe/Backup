package com.Searching;

public class SearchDemo {

	public static void main(String[] args) {
		int [] arr= {1,2,7,4,5,8};
		System.out.println(LinearSearch.find(arr,9));
		System.out.println(LinearSearch.contains(arr,1));
		String name="Komal";
		System.out.println(LinearSearch.find(name,'o'));
		System.out.println(LinearSearch.contains(name,'K'));
		
	}

}
