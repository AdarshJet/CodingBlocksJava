package codingBlocks;

import java.util.*;

public class Maximum_Circular_Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			if(n==1) {
				System.out.println(arr[0]);
			}
			int s=0;
			for(int i=0;i<n;i++)
			{
				s=s+arr[i];
			}
			 int cmax=arr[0];
			 int cmin=arr[0];
			 int maxsf=arr[0];
			 int minsf=arr[0];
			 for(int i=1;i<n;i++)
			 {
				 cmax=Math.max(cmax+arr[i], arr[i]);
				 
				 maxsf=Math.max(maxsf, cmax);
				 
				 cmin=Math.min(cmin+ arr[i], arr[i]);
				 
				 minsf=Math.min(cmin,minsf);
				 
			 }
			 if(minsf==s)
			 {
				 System.out.println(maxsf);
			 }
			 else {
				 System.out.println(Math.max(maxsf, s-minsf));
			 }
		}
	}

}
