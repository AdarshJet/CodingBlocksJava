package codingBlocks;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n%2==1)
		{
			System.out.println(n+" is odd");
		}
		else
		{
			System.out.println(n+" is even");
		}
	}

}
