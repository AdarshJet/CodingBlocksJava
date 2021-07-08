package codingBlocks;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int d=0;
		int c=0;
		double s=0;
		int temp=N;
		while(temp>0)
		{
			d=temp%10;
			s=s+ d*Math.pow(2,c);
			c++;
			temp=temp/10;
		}
		System.out.println((int)s);
	}

}
