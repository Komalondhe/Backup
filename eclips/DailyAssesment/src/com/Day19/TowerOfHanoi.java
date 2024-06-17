package com.Day19;

public class TowerOfHanoi {
	public static void towerOfHanoi(int n,char source,char auxi,char desti) {
		if(n==1) {
			System.out.println("Move disk 1 from "+ source+  "to "+desti);
			return;
		}
		towerOfHanoi(n-1, source,  desti,auxi);
		System.out.println("Move disk "+n +" from "+  source+  " to "+ desti);
		towerOfHanoi(n-1, auxi,source, desti);
	}

	public static void main(String[] args) {
		int n=3;
		towerOfHanoi(n,'A', 'B', 'C');

	}

}
