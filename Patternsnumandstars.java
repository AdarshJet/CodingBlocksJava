package codingBlocks;

import java.util.Scanner;

public class Patternsnumandstars {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=N;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=1;j<=N-i;j++)
			{
				System.out.print("*"+" ");
			}
			for(int j=1;j<=N-i-1;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}
}