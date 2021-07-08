package codingBlocks;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<N-1;i++)
		{
			int min=i;
			for(int j=i+1;j<N;j++)
			{
				 if(arr[j]<arr[min])
				 {
					 min=j;
				 }
				 int temp=arr[min];
				 arr[min]=arr[i];
				 arr[i]=temp; 
			}
		}
		for(int i=0;i<N;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
