package codingBlocks;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		int n=s1.length();
		String s2="";
		for(int i=n-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		if(s1.equals(s2))
		{
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
