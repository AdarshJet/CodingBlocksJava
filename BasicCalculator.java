package codingBlocks;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			char ch=sc.next().charAt(0);
			if(ch=='+')
			{
				int n1=sc.nextInt();
				int n2=sc.nextInt();
				System.out.println(n1+n2);
			}
			else if(ch=='-')
			{
				int n1=sc.nextInt();
				int n2=sc.nextInt();
				System.out.println(n1-n2);
			}
			else if(ch=='*')
			{
				int n1=sc.nextInt();
				int n2=sc.nextInt();
				System.out.println(n1*n2);
			}
			else if(ch=='/')
			{
				int n1=sc.nextInt();
				int n2=sc.nextInt();
				System.out.println((int)n1/n2);
			}
			else if(ch=='X' ||ch=='x')
			{
				return;
			}
			else {
				System.out.println("Invalid operation. Try again.");
				continue;
			}
		}
	}

}
