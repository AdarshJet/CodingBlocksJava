package codingBlocks;

import java.util.Scanner;

public class vanneumannlovesbinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			long t=sc.nextLong();
			long temp=t;
			int c=0;
			double s=0;
			double d=0;
			while(temp>0)
			{
			d=temp%10;
			s=s+d*Math.pow(2, c);
			c++;
			temp=temp/10;
			}
			System.out.println((int)s);
		}

	}

}
