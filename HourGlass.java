package codingBlocks;

import java.util.Scanner;

public class HourGlass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=N;i>=0;i--)
		{
			for(int j=i;j<=N-1;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j>=0;j--)
			{
				System.out.print(j+" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(i==0)
				{
					System.out.print("0"+" ");
				}
				else {
					System.out.print(j+" ");
				}
			}
			if(i!=0)
			{
			System.out.println();
		}
		}
		for(int i=0;i<=N;i++)
		{
			for(int j=N-1;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int j=i;j>=0;j--)
			{
				if(i==0)
				{
					break;
				}
				else {
					System.out.print(j+" ");
				}
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
