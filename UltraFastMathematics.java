package codingBlocks;

import java.util.Scanner;

public class UltraFastMathematics {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0)
		{
		String s1=sc.next();
		String s2=sc.next();
		StringBuilder ans=new StringBuilder();
		int l=s1.length();
		for(int i=0;i<l;i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
			{
				ans.append('0');
			}
			else {
				ans.append('1');
			}
		}
		System.out.println(ans);
		}
	}

}
