package com.Searching;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;


public class BinarySearch2 {

	public static void main(String[] args) {
		int arr[]={1,3,5,6,10,12,15,20,21,28};
		System.out.println(BinarySearch.search(arr, 6));
		System.out.println("Max value is:"+largest(arr));
		System.out.println("Min value is:"+Minimum(arr));
		int arr1[]= {10,8,6,4,2,1};
		System.out.println(BinarySearch.search(arr1, 18));
		
		
	}
	public static int binarySearch(int a[],int searchVal) {
		int firstVal=0;
		int lastVal=a.length-1;
		
		while(firstVal<=lastVal) {
			int mid=(firstVal+lastVal)/2;
			if(a[mid]==searchVal) {
				return mid;
			}
			else if(searchVal>a[mid]) {
				firstVal=mid+1;
			}
			else {
				lastVal=mid-1;
			}
		}
		
		
		
		return -1;
	}
	public static int largest(int arr[]) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) 
			if(arr[i]>max)
				max=arr[i];
		return max;
	}
	public static int Minimum(int arr[]) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) 
			if(arr[i]<min)
				min=arr[i];
		return min;
	}


}
