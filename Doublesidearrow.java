package codingBlocks;

import java.util.Scanner;

public class Doublesidearrow {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int p=N-1;
		for(int i=1;i<=N/2+1;i++)
		{
			for(int j=p;j>=1;j--)
			{
				System.out.print("  ");
			
			}
			p=p-2;
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i-2;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				if(i==1)
				{
					break;
				}
				else {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
		int x=2;
		for(int i=N/2;i>=1;i--)
		{
			for(int j=1;j<=x;j++)
			{
				if(x>N)
				{
					break;
				}
				else {
					System.out.print("  ");
				}
			}
			x=x+2;
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print("  ");
			}
			for(int j=i-1;j>=2;j--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				if(i==1)
				{
					break;
				}
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
