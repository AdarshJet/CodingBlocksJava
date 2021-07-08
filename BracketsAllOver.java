package codingBlocks;

import java.util.Scanner;

public class BracketsAllOver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		int c=0;
		for(int i=0;i<n;i++)
		{
			if(i!=0 && s.charAt(i)==s.charAt(i-1))
			{
				continue;
			}
			else 
			{
			for(int j=0;j<n;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					c++;
				}
				if(c>1)
				{
					System.out.print(s.charAt(j));
					System.out.print(c);
				}
				else {
					System.out.print(s.charAt(j));
				}
				
			}
			}
		}
	}

}
