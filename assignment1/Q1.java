package com.ineuron.assignment1;

public class Q1 {
	public static void main(String args[]) {
	int n=5;
	for(int i=0;i<n;i++)
		{
		
		//Alphabet I
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1||j==n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
		System.out.print(" ");
		//Alphabet N
				for(int j=0;j<n;j++)
				{
					if(j==0||j==n-1||i==j)
						  System.out.print("* ");
					  else
						  System.out.print("  ");
				}
				System.out.print(" ");
		//Alphabet E
				for(int j=0;j<n;j++)
				{
					if(i==0||i==n-1||i==n/2||j==0)
						  System.out.print("* ");
					  else
						  System.out.print("  ");
				}
				System.out.print(" ");
		//Alphabet U
				for(int j=0;j<n;j++)
				{
					if((j==0&&i!=n-1)||(j==n-1&&i!=n-1)||(i==n-1&&j!=0&&j!=n-1))
						  System.out.print("* ");
					  else
						  System.out.print("  ");
				}
				System.out.print(" ");
		//Alphabet R
				for(int j=0;j<n;j++)
				{
					if(j==0||(i==0&&j!=n-1)||(i==n/2&&j!=n-1)||(i>=n/2&&i==j)||(i>0&&i<n/2&j==n-1))
						  System.out.print("* ");
					  else
						  System.out.print("  ");
				}
				System.out.print(" ");
		//Alphabet O
				for(int j=0;j<n;j++)
				{
					if((j==0&&i!=0&&i!=n-1)||(j==n-1&&i!=0&&i!=n-1)||(i==0&&j!=0&&j!=n-1)||(i==n-1&&j!=0&&j!=n-1))
						  System.out.print("* ");
					  else
						  System.out.print("  ");
				}
		//Alphabet N
				for(int j=0;j<n;j++)
				{
					if(j==0||j==n-1||i==j)
						  System.out.print("* ");
					  else
						  System.out.print("  ");
				}
		  System.out.println();
		}
	
	
	}
}
