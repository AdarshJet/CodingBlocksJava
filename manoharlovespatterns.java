package codingBlocks;

import java.util.Scanner;

public class manoharlovespatterns {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		if(N==1)
		{
			System.out.println("1");
			System.exit(0);
		}
		else {
			for(int i=1;i<=N;i++)
			{
				for(int j=1;j<=i;j++)
				{
					if(i==1)
					{
						System.out.print("1");
					}
					else 
					{
					if(j==1 || j==i)
					{
						System.out.print(i-1);
					}
					else
					{
						System.out.print("0");
					}
				}
				}
				System.out.println();
			}
		}

	}

}
