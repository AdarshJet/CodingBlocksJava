package codingBlocks;

import java.util.*;

public class Maximum_Subarray_Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		while(N-->0)
		{
			int t=sc.nextInt();
			int arr[]=new int[t];
			for(int i=0;i<t;i++)
			{
				arr[i]=sc.nextInt();
			}
			int s=Integer.MIN_VALUE;
			int temp=0;
			for(int i=0;i<t;i++)
			{
				temp=temp+arr[i];
				if(s<temp)
				{
					s=temp;
				}
				if(temp<0)
				{
					temp=0;
				}
			}
			System.out.println(s);
		}
	}
}
