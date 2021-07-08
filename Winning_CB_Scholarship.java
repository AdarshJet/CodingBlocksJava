package codingBlocks;

import java.util.Scanner;

public class Winning_CB_Scholarship {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long M=sc.nextLong();
		long X=sc.nextLong();
		long Y=sc.nextLong();
		long l=0;
		long h=N;
		long ans=0;
		while(l<=h)
		{
			long m=(l+h)/2;
			if(m*X<=M+(N-m)*Y)
			{
				ans=m;
				l=m+1;
			}
			else {
				h=m-1;
			}
		}
		System.out.println(ans);
	}

}
