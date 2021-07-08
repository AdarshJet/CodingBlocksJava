package codingBlocks;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			
			int c=0;
			if(i!=0 && s.charAt(i)==s.charAt(i-1))
			{
//				System.out.println("Entered");
				continue;
			}
			else 
			{
			for(int j=i;j<n;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					c++;
				}
				else {
					break;
				}
				}
			if(c>1)
			{
				System.out.print(s.charAt(i));
				System.out.print(c);
			}
			else {
				System.out.print(s.charAt(i));
			}
			}
		}

	}

}
