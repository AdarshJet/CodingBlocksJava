package codingBlocks;

import java.util.Scanner;

public class RotateImage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[][]=new int[N][N];
		int a[][]=new int[N][N];	
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<N;i++)
		{
			int c=N-1;
			for(int j=0;j<N;j++) 
			{
				a[c][i]=arr[i][j];
				c=c-1;
			}
		}
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
