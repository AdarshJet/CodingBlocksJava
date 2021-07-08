package codingBlocks;

import java.util.Scanner;

public class MaxFrequencyCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char ans='x';
		int temp=0;
		for(int i=0;i<s.length();i++)
		{
			int c=0;
			char ch=s.charAt(i);
			for(int j=i;j<s.length();j++)
			{
				if(s.charAt(j)==ch)
				{
					c++;
				}
			}
//			System.out.println(c);
			if(temp<c)
			{
				temp=c;
//				System.out.println(temp);
				ans=ch;
			}
		}
		System.out.println(ans);
	}

}
