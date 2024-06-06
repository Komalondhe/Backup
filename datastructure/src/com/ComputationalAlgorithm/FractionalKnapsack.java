package com.ComputationalAlgorithm;
import java.util.Arrays;
import java.util.Comparator;

class Iteam{
	int value,weight;
	 Iteam(int value,int weight) {
		 this.value=value;
		 this.weight=weight;
		
	}
}


public class FractionalKnapsack {
	private static double getMaxValue(Iteam[]iteam,int capacity ) {
		Arrays.sort(iteam,new Comparator<Iteam>() {
			@Override
			public int compare(Iteam o1,Iteam o2) {
				double r1=(double)o1.value/o1.weight;
				double r2=(double)o2.value/o2.weight;
				return Double.compare(r2, r1);
			}
				
		});
		double totalValue=0.0;
		for(Iteam iteam1:iteam) {
			if(capacity-iteam1.weight>=0) {
				capacity -=iteam1.weight;
				totalValue +=iteam1.value;
			}
			else {
				totalValue +=iteam1.value *((double)capacity / iteam1.weight);
				break;
			}
			
		}
		return totalValue;
		
		
	}
	

	public static void main(String[] args) {
		Iteam[] iteams= {
				new Iteam(60, 10),
				new Iteam(100, 20),
				new Iteam(120, 30),
		};
		int capacity=50;
		double maxValue=getMaxValue(iteams, capacity);
		System.out.println("Maximum value we can obtain="+maxValue);

	}

}
