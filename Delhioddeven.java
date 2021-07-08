package codingBlocks;

import java.util.Scanner;

public class Delhioddeven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=1;i<=N;i++)
		{
			int t=sc.nextInt();
			int temp=t;
			int d=0;
			int s1=0;
			int s2=0;
			while(temp>0)
			{
				d=temp%10;
				if(d%2==0)
				{
					s1=s1+d;
				}
				else {
					s2=s2+d;
				}
				temp=temp/10;
			}
			if(s1%4==0 || s2%3==0)
			{
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}

}
