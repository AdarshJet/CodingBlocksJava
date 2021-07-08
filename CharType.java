package codingBlocks;

import java.util.Scanner;

public class CharType {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c = sc.next().charAt(0); 
		if (Character.isAlphabetic(c))
		{
		if(Character.isUpperCase(c))
		{
			System.out.println("U");
		}
		else if(Character.isLowerCase(c)){
			System.out.println("L");
		}
		}
		else {
			System.out.println("I");
		}
	}

}
