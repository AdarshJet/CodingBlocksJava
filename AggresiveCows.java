package codingBlocks;

import java.util.*;

public class AggresiveCows {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int c=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int ans=0;
		int l=1;
		int r=arr[N-1]-arr[0];
		while(l<=r)
		{
			int count=1;
			int mid=(l+r)/2;
			int p=arr[0];
//			System.out.println(p);
			for(int i=1;i<N;i++)
			{
				if(arr[i]-p>=mid)
				{
					count++;
					p=arr[i];
				}
			}
		if(count>=c)
		{
			ans=mid;
			l=mid+1;
		}
		else {
			r=mid-1;
		}
		}
		System.out.println(ans);
	}

}
