package codingBlocks;

import java.util.Scanner;

public class PiyushAndMagicalPark {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int K=sc.nextInt();
		int S=sc.nextInt();
		char arr[][]=new char[N][M];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<M;j++)
			{
				arr[i][j]= sc.next().charAt(0); 
			}
		}
//		System.out.println("I got");
//		for(int i=0;i<N;i++)
//		{
//			for(int j=0;j<M;j++)
//			{
//				System.out.print(arr[i][j]+" "); 
//			}
//			System.out.println();
//		}
		int temp=S;
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<M;j++)
			{
				if(arr[i][j]=='.' && j!=M-1)
				{
					temp=temp-3;
				}
				else if(arr[i][j]=='.' && j==M-1)
				{
					temp=temp-2;
				}
				else if(arr[i][j]=='#')
				{
					break;
				}
				else if(arr[i][j]=='*' && j==N-1)
				{
					temp=temp+5;
				}
				else if(arr[i][j]=='*' && j!=N-1)
				{
					temp=temp+4;
				}
				if(temp<K)
				{
					System.out.println("No");
					return;
				}
			}
//			System.out.println(temp);
	}
			System.out.println("Yes");
			System.out.println(temp);
	}
}
