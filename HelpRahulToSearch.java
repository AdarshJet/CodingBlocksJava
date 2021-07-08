package codingBlocks;

import java.util.Scanner;

public class HelpRahulToSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		int n=sc.nextInt();
		int l=0;
		int r=N-1;
		while(l<=r)
		{
			int mid=(l+r)/2;
			if(arr[mid]==n)
			{
				System.out.println(mid);
				return;
			}
			else
			{
				//left array is sorted
				if(arr[mid]>arr[r])
				{
					int lower=arr[l];
					int high=arr[mid];
					if(n>=lower && n<=high)
					{
					r=mid-1;
					}
					else {
						l=mid+1;
					}
				}
				//right array is sorted
				else {
					int lower=arr[mid];
					int higher=arr[r];
					if(n>=lower && n<=higher)
					{
						l=mid+1;
					}
					else {
						r=mid-1;
					}
				}
			}
		}
		System.out.println("-1");
		
	}
	
}

