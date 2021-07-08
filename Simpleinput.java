package codingBlocks;

import java.util.Scanner;

public class Simpleinput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=0;
		while(true)
		{
			int b=sc.nextInt();
			s=s+b;
			if(s>0)
			System.out.println(b);
			else
			System.exit(0);
		}
	}
}

