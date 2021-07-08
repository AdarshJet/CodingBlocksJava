package codingBlocks;

import java.util.Scanner;

public class HigherAndLowerBound2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int t=sc.nextInt();
			int l=lowerbound(arr, t);
			int h=higherbound(arr, t);
			System.out.println(l+" "+h);
		}
	}
	public static int lowerbound(int arr[], int a)
	{
		int l=0, h=arr.length-1;
		int ans=-1;
		while(l<=h)
		{
			int mid=(h+l)/2;
			if(arr[mid]==a)
			{
				ans=mid;
				h=mid-1;
			}
			else if(a<arr[mid])
			{
				ans=mid;
				h=mid-1;
			}
			else {	
				l=mid+1;
			}
		}
		return ans;
	}
	public static int higherbound(int arr[], int a)
	{
		int l=0, h=arr.length-1;
		int ans=-1;
		while(l<=h)
		{
			int mid=(h+l)/2;
			if(arr[mid]==a)
			{
				ans=mid;
				l=mid+1;
			}
			else if(a<arr[mid])
			{
				h=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		return ans;
	}

}
