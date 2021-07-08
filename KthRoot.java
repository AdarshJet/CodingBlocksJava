package codingBlocks;

import java.util.Scanner;

public class KthRoot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			long n=sc.nextLong();
			long k=sc.nextLong();
			long l=1;
			long r=n;
			long ans=0;
			while(l<=r)
			{
				long mid=(l+r)/2;
//				long c=(long) Math.pow(n, 1/k);
				long c= (long) Math.pow(mid, k);
				if(c==n)
				{
					ans = mid;
					break;
				}
				else if(c>n)
				{
					r=mid-1;
				}
				else {
					ans = mid;
					l=mid+1;
				}
			}
			System.out.println(ans);
			sc.close();
		}
	}

}
