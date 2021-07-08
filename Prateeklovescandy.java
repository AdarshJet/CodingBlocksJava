package codingBlocks;

import java.util.Scanner;

public class Prateeklovescandy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[] = new int[1000000];
		int c2=0;
		for(int j=2;j<=1000000;j++)
		{
			if(Prime(j))
			{
				arr[c2] = j;
				c2++;
//				System.out.println(j);
			}
		}
		for(int i=1;i<=N; i++)
		{
			int t=sc.nextInt();
			System.out.println(arr[t-1]);
		}
	}
	public static boolean Prime(int n)
	{
		int c=0;
		if(n==2) return true;
		if(n%2==0) return false;
		double sq = Math.sqrt(n);
		int lim = (int)sq;
		for(int i=3;i<=lim;i=i+2)
		{
			if(n%i==0) return false;
		}
		
		return true;
	}
}
