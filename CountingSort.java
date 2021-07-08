package codingBlocks;

import java.util.Scanner;

public class CountingSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int a[]=new int[1000001];
		for(int i=0;i<n;i++)
		{
			a[arr[i]]++;
		}
		for(int i=0;i<=1000000;i++)
		{
			int temp=a[i];
			if(temp==0)
			{
				continue;
			}
			else {
//				System.out.println((i+1)+" "+temp);
				for(int j=0;j<temp;j++)
				{
					System.out.print(i+" ");
				}
			}
		}
		}
}


