package codingBlocks;

import java.util.Scanner;

public class HollowDiamond {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int l = N/2+1;
		for(int i=1;i<=N;i++)
		{
			for(int j=1;j<=N;j++)
			{
				if(i+j>=2+l && j-i<=l-2 && j-i>=l-N+1 && j+i<=N+l-1)
				{
					System.out.print(" "+"\t");
				}
				else {
					System.out.print("*"+"\t");
				}
			}
			System.out.println();
		}

	}

}
