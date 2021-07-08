package codingBlocks;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int n=sc.nextInt();
		int temp=N;
		int d=0;
		int c=0;
		while(temp>0)
		{
			d=temp%10;
			if(d==n)
			{
				c++;
			}
			temp=temp/10;
		}
		System.out.println(c);
	}

}
