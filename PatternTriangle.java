package codingBlocks;

import java.util.Scanner;

public class PatternTriangle {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();	
	for(int i=0;i<N;i++)
	{
		for(int j=N-i-1;j>0;j--) {
			System.out.print("\t");
		}
		for(int j=i+1;j<=2*i+1;j++) {
			System.out.print(j+"\t");
		}
		for(int j=2*i;j>=i+1;j--) {
			System.out.print(j+"\t");
		}
		System.out.println();
	}
	}
}
