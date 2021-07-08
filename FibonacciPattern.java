package codingBlocks;

import java.util.Scanner;

public class FibonacciPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		if(N==1)
		{
			System.out.println("0");
			return;
		}
		else {
			int a=0;
			int b=1;
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<=i;j++)
				{
					int c=a+b;
					if(i==0 && j==0 || i==1 && j==0)
					{
						System.out.print((i+j)+"\t");
					}
					else {
						System.out.print(c+"\t");
						a=b;
						b=c;
					}
			}
				System.out.println();		
		}
	}
}
}
