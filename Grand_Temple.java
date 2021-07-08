package codingBlocks;

import java.util.Arrays;
import java.util.Scanner;

public class Grand_Temple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int w[]=new int[N];
		int h[]=new int[N];
		for(int i=0;i<N;i++)
		{
			w[i]=sc.nextInt();
			h[i]=sc.nextInt();
		}
		Arrays.sort(w);
		Arrays.sort(h);
		int width=0;
		for(int j=0;j<N-1;j++)
		{
			int temp=w[j+1]-w[j];
			if(temp>width)
			{
				width=temp-1;
			}
		}
		int height=0;
		for(int j=0;j<N-1;j++)
		{
			int temp=h[j+1]-h[j];
			if(temp>height)
			{
				height=temp-1;
			}
		}
		System.out.println(width*height);
	}

}
