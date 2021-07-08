package codingBlocks;

import java.util.Scanner;

public class FahrenheittoCelcius {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int min=sc.nextInt();
		int max=sc.nextInt();
		int range=sc.nextInt();
		for(int i =min;i<=max;i=i+range)
		{
			double c= (5.0/9.0)*(i-32);
//			System.out.println(i);
//			System.out.println(c);
			System.out.println(i+"\t"+(int)c);
		}
	}

}
