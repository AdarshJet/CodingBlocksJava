package codingBlocks;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<arr.length;i++)
		{
			int t=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>t)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=t; 
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
