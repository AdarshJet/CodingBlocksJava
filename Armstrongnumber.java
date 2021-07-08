package codingBlocks;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int temp=N;
		int c=0;
		while(temp>0)
		{
			c++;
			temp=temp/10;
		}
		int d=0;
		double s=0;
		int t=N;
		while(t>0)
		{
			d=t%10;
			s=s+ Math.pow(d, c);
			t=t/10;
		}
		if((int)s==N)
		{
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
