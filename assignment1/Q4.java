package com.ineuron.assignment1;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int n=15;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if( j==0 && i==n-1/2  || j==n-1 && i==n-1/2 || i-j >=(n-1)/2 || i+j >= n-1 + n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();

	}

	}

}
