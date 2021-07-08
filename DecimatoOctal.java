package codingBlocks;

import java.util.Scanner;

public class DecimatoOctal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		int temp=N;
		int d=0;
		long s=0;
		while(temp>0)
		{
			d=temp%8;
			s=s*10+d;
			temp=temp/8;
		}
		long d1=0;
		long s2=0;
		long t=s;
		while(t>0)
		{
			d1=t%10;
			s2=s2*10+d1;
			t=t/10;
		}
		System.out.println(s2);
				
	}

}
