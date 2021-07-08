package codingBlocks;

import java.util.*;

public class MatrixSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] arr=new int[m][n];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int N=sc.nextInt();
		int c=0;
		int a[]=new int[n*m];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				a[c]=arr[i][j];
				c++;
			}
		}
		Arrays.sort(a);
//		for(int i=0; i<a.length;i++)
//		{
//			System.out.println(a[i]+" ");
//		}
		int ans=0;
		int l=0;
		int h=(n*m)-1;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(a[mid]==N)
			{
				System.out.println("1");
				return;
			}
			else if(a[mid]<N)
			{
				l=mid+1;
			}
			else {
				h=mid-1;
			}
		}
		System.out.println(ans);
	}

}
