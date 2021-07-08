package codingBlocks;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumTriplets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		int T=sc.nextInt();
		Arrays.sort(arr);
		
		for(int i=0;i<N;i++)
		{
			int temp=arr[i];
			int r=N-1;
			int l=i+1;
			while(l<r)
			{
				int s=T-temp;
				int cur = arr[l]+arr[r];
				if(cur==s)
				{
					System.out.println(temp+", "+arr[l]+" and "+arr[r]);
					l++;
					r--;
				}
				else if(cur>s)
				{
					r--;
				}
				else {
					l++;
				}
			}
			}
		}
}
