package codingBlocks;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeVisits {

	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		boolean a[]=new boolean[1000001];
		for(int i=0;i<a.length;i++)
		{
			a[i]=true;
		}
		a[0]=false;
		a[1]=false;
		for(int i=2;i<a.length-1;i++)
		{
			if(a[i]==true)
			{
				for(int j=2*i;j<1000001;j=j+i) {
					a[j]=false;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==true) {
				arr.add(i);
			}
		}
//		System.out.println(arr);
		while(N-->0) {
			int l=sc.nextInt();
			int u=sc.nextInt();
			System.out.println(upperbound(arr,u)-lowerbound(arr,l)+1);
			
		}
		
		
	}
	
	public static int lowerbound(ArrayList<Integer> arr, int a)
	{
		int l=0, h=arr.size()-1;
		int ans=-1;
		while(l<=h)
		{
			int mid=(h+l)/2;
			int cur = arr.get(mid);
			if(cur==a)
			{
				ans=mid;
				h=mid-1;
			}
			else if(a<cur)
			{
				ans=mid;
				h=mid-1;
			}
			else {	
				l=mid+1;
			}
		}
		return ans;
	}
	
	public static int upperbound(ArrayList<Integer> arr, int a)
	{
		int l=0, h=arr.size()-1;
		int ans=-1;
		while(l<=h)
		{
			int mid=(h+l)/2;
			int cur = arr.get(mid);
			if(cur==a)
			{
				ans=mid;
				l=mid+1;
			}
			else if(a<cur)
			{
				h=mid-1;
			}
			else {
				l=mid+1;
				ans=mid;
			}
		}
		return ans;
	}

}
