package codingBlocks;

import java.util.Scanner;

public class BinarySort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int N=sc.nextInt();
		int l=0;
		int h=n-1;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(arr[mid]==N)
			{
				System.out.println(mid);
				System.exit(0);
			}
			else if(arr[mid]<N)
			{
				l=mid+1;
			}
			else {
				h=mid-1;
			}
		}
		System.out.println("-1");
			
	}

}
