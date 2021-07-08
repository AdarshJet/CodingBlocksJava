package codingBlocks;

import java.util.Scanner;

public class TargetSumPairs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int N=sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
//for(int i=0;i<n;i++)
//	{
//		System.out.println(arr[i]);
//	}
int l=0;
int r=n-1;
while(l<r)
	{
	int s=arr[l]+arr[r];
	if(s==N)
		{
			System.out.println(arr[l]+" and "+arr[r]);
			l++;
		}
		else if(s>N)
		{
			r--;
		}
		else {
			l++;
		}
	}
//		if(n==1)
//		{
//			if(arr[0]==N)
//			{
//				System.out.println(arr[0]);
//			}
//		}
//		for(int i=0;i<n;i++)
//		{
//			for(int j=i;j<n;j++)
//			{
//				if(arr[i]+arr[j]==N)
//				{
//					if(arr[i]>arr[j])
//					{
//						System.out.println(arr[j]+" and "+arr[i]);
//					}
//					else {
//						System.out.println(arr[i]+" and "+arr[j]);
//					}
//				}
//			}
//		}
//	}
	}
}