
package codingBlocks;

import java.util.Scanner;

public class PythagorasTriplet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long b=sc.nextLong();
		if(b%2==0)
		{
			evenb(b);
		}
		else {
			oddb(b);
		}
	}
	public static void evenb(long n)
	{
		long a=(n/2)*(n/2)-1;
		long c=(n/2)*(n/2)+1;
		if(a<=0) {
			System.out.println("-1");
			System.exit(0);
		}
		System.out.println(a+" "+c);
	}
	public static void oddb(long m)
	{
		long a=2*(m+1)/2*(m-1)/2;
		long c=((m+1)/2)*((m+1)/2)+((m-1)/2)*((m-1)/2);
		if(a<=0) {
			System.out.println("-1");
			System.exit(0);
		}
		System.out.println(a+" "+c);
	}
}
