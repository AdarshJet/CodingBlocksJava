package codingBlocks;

import java.util.Scanner;

public class Patternmountain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=1;i<=N;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"\t");
			}
			for(int j=N-1;j>=i;j--)
			{
				System.out.print("\t");
			}
			for(int j=N-2;j>=i;j--)
			{
				System.out.print("\t");
			}
			for(int j=i;j>=1;j--)
			{
				if(j==N)
				{
					continue;
			 	}
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}

}
