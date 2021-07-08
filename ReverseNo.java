package codingBlocks;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int d=0;
		int s=0;
		int temp=N;
		while(temp>0)
		{
			d=temp%10;
			s=s*10+d;
			temp=temp/10;
		}
		System.out.println(s);
	}

}
