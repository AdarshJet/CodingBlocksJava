package codingBlocks;

import java.util.Scanner;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int a[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
			a[i]=sc.nextInt();
		}
		int n2=sc.nextInt();
		int b[]=new int[n2];
		for(int i=0;i<n2;i++)
		{
			b[i]=sc.nextInt();
		}
		if(n2>n1)
		{
			int[] temp = b;
			b = a;
			a = temp;
		}
//		for(int el:a) System.out.print(el+" ");
//		System.out.println();
//		for(int el:b) System.out.print(el+" ");
		int l1=a.length;
		int l2=b.length;
		int s=0;
		int c=0;
		for(int i=l2-1,j=l1-1;i>=0;i--,j--)
		{
			int p=a[j]+b[i]+c;
			if(p>=10 && j!=0||p>=10 && i!=0)
			{
				int t1=p%10;
				a[j]=t1;
				c=1;
			}
			else if(j==0 && i==0)
			{
				if(p/10>0)
				{
					int d=p/10;
					System.out.print(d+", ");
					a[j]=p%10;
				}
				else {
				a[j]=p;

			}
			}
			else {
				c=0;
				a[j]=p;
			}
		}
		for(int el:a) System.out.print(el+", ");
		System.out.print("END");
	}

}
