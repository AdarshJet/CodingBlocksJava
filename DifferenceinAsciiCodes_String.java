package codingBlocks;

import java.util.*;

public class DifferenceinAsciiCodes_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		String s=sc.next();
		int n=s.length();
		if(n==1)
		{
			System.out.println(s);
		}
		else
		{
		for(int i=0;i<n-1;i++)
		{
			sb.append(s.charAt(i));
			sb.append((int)s.charAt(i+1)-s.charAt(i));
		}
		sb.append(s.charAt(n-1));
		System.out.println(sb);
		}
	}
}
