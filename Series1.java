package codingBlocks;

import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N1=sc.nextInt();
		int N2=sc.nextInt();
		int c=0;
		int t=1;
		int s=0;
		for(int i=1;i<=100;i++)
		{
			s=3*t+2;
			if(s%N2!=0)
			{
				System.out.println(s);
				
			}
			else {
				t++;
				continue;
			}
		c++;
		t++;
		if(N1==c)
		{
			return;
		}
		}
	}

}
