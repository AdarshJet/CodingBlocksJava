package codingBlocks;

import java.util.Scanner;

public class HollowRhombus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		if(N==1)
		{
		System.out.println("*");
		}
		else
		{
			int f=2*N;
			int t=N;
			for(int i=1;i<=N;i++)
			{
				for(int j=1;j<=2*N;j++)
				{
					if(i==1)
					{
						if(j<=t)
						{
							System.out.print(" ");
						}
						else
						{
							System.out.print("*");
						}
					}
					else if(i>=1 && i<N){
						if(j==t || j==f)
						{
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					else if(j==N){
							for(int k=1;k<=N;k++)
							{
							System.out.print("*");
						}
					}
				}
				f--;
				t--;
				System.out.println();
			}
	}
	}
}
	



