package codingBlocks;

import java.util.Scanner;

public class ChewbaccaAndNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long d=0;
		long s=0;
		long temp=N;
		int counter=0;
		while(temp>0)
		{
			if(temp==9) {
				s=s+9*(long)Math.pow(10,counter);
				counter++;
			}
			d=temp%10;
			if(d>=5)
			{
				s=s+(9-d)*(long)Math.pow(10,counter);
			}
			else {
				s=s+(d)*(long)Math.pow(10,counter);
//				s=s*10+d;
			}
			counter++;
			temp=temp/10;
		}
		System.out.println(s);
//		long d2=0;
//		long ans=0;
//		while(s>0)
//		{
//			d2=s%10;
//			ans=ans*10+d2;
//			s=s/10;
//		}
//		System.out.println(ans);
	}

}
