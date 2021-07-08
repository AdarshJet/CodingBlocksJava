package codingBlocks;

import java.util.Scanner;

public class checkPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int c=0; 
		for(int i=1;i<=N;i++)
		{
			if(N%i==0)
			{
				c++;
			}
		}
		if(c>2)
		{
			System.out.println("Not Prime");
		}
		else
		{
			System.out.println("Prime");
		}
	}

}
