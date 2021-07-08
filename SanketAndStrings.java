package codingBlocks;

import java.util.Scanner;

public class SanketAndStrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String s=sc.next();
		int n=s.length();
		int left=0;
		int max_a=0;
		int counter=0;
		
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='b') counter++;
			while(counter>N) {
				if(s.charAt(left)=='b') counter--;
				left++;
			}
			int cur = i-left+1;
			if(cur>max_a) max_a=cur;
		}
		
		left=0;
		counter=0;
		int max_b = 0;
		
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='a') counter++;
			while(counter>N) {
				if(s.charAt(left)=='a') counter--;
				left++;
			}
			int cur = i-left+1;
			if(cur>max_b) max_b=cur;
		}
		
		System.out.println(Math.max(max_a, max_b));
		
//		while(left<n)
//		{
//			System.out.println(left);
//			int right=left;
//			while(counter<N)
//			{
//				if(s.charAt(right)!='a')
//				{
//					counter++;
//					right++;
//				}
//				else {
//					right++;
//				}
//			}
//			String temp=s.substring(left,right);
//			int sslength=temp.length();
//			if(sslength>max)
//			{
//				max=sslength;
//			}
//			left=right;
//		}
//		System.out.println(max);
//		System.out.println(max);
//		int l2=0;
//		int temp2=0;
//		while(l2<n)
//		{
//			System.out.println("Entered");
//			int c2=0;
//			while(c2<=N)
//			{
//				if(s.charAt(l2)!='b')
//				{
//					c2++;
//					l2++;
//				}
//				else {
//					l2++;
//				}
//			}
//			l2++;
//			if(c2>temp2)
//			{
//				temp2=c2;
//			}
//		}
//		int m=Math.max(temp2,temp);
//		System.out.println(m);
		}
}
