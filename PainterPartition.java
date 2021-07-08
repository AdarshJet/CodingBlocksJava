package codingBlocks;

import java.util.*;

public class PainterPartition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int K=sc.nextInt();
		int N=sc.nextInt();
		long arr[]=new long[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextLong();
		}
//		Arrays.sort(arr);
		long ans=0; 
//		System.out.println(l);
		long max=0;
		for(int i=0;i<N;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		long l=max;
		long r=0;
		for(int i=0;i<N;i++)
		{
			r=r+arr[i];
		}
		
		while(l<=r)
		{
			long c=1;
			long mid=(l+r)/2;
//			System.out.println(mid);
			long cw=0;
			for(int i=0;i<N;i++)
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
			if(c<=K){
				ans=mid;
				r=mid-1;
			}
			else
			{
				l=mid+1;
			}
		}
		System.out.println(ans);
	}

}
