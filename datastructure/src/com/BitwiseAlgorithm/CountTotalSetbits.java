package com.BitwiseAlgorithm;

public class CountTotalSetbits {
	public static int countTotalsetBits(int n) {
		int totalsebits=0;
		int i=0;
		while((1<<i)<=n) {
			int blockSize=1<<(i+1);
			int fullBlocks=n/blockSize;
			totalsebits+=fullBlocks*(1<<i);
			int remainingBits=n%blockSize;
			totalsebits+=Math.max(0, remainingBits-(1<<i)+1);
			i++;
		}
		return totalsebits;
	}

	public static void main(String[] args) {
int n=7;
System.out.println("Total set bits from 1 to"+n+"is"+countTotalsetBits(n));
	}

}
