package codingBlocks;

import java.util.*;

public class LowerUpperString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c = sc.next().charAt(0);   
		if (Character.isAlphabetic(c))
		{
			if(Character.isUpperCase(c))
			{
				System.out.println("UPPERCASE");
			}
			else {
				System.out.println("lowercase");
			}
		}
		else {
			System.out.println("Invalid");
		}
	}

}
