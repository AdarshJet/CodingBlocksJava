package codingBlocks;

import java.util.Scanner;

public class BookAllocation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int l=arr[n-1];
		int h=0;
		for(int i=0;i<n;i++)
		{
			h=h+arr[i];
		}
		int ans=0;
		while(l<=h)
		{
			int mid=(l+h)/2;
			int c=1;
			int cw=0;
			for(int i=0;i<n;i++)
			{
				if(cw+arr[i]>mid)
				{
					c++;
					cw=arr[i];
				}
				else {
					cw=cw+arr[i];
				}
			}
			if(c<=m) {
				ans=mid;
			    h=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		System.out.println(ans);
	}
	}

}
