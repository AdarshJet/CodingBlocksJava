package codingBlocks;

import java.util.Scanner;

public class SortingInLinearTime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int a[]=new int[3];
		for(int i=0;i<n;i++)
		{
			a[arr[i]]++;
		}
		for(int i=0;i<=2;i++)
		{
			int temp=a[i];
			if(temp==0)
			{
				continue;
			}
			else {
				for(int j=0;j<temp;j++)
				{
					System.out.println(i);
			}
		}
		}
	}
}

