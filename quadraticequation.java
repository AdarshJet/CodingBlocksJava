package codingBlocks;

import java.util.Scanner;

public class quadraticequation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();   
		double D=Math.pow(b, 2)- 4*(a)*(c);
		if(D<0) {
		System.out.println("Imaginary");
		System.exit(0);
		}
		else if(D==0)
		{
		System.out.println("Real and Equal");
		}
		else {
			System.out.println("Real and Distinct");
		}
		double x1 = (-b-Math.sqrt(D))/(2*a);
		double x2 = (-b+Math.sqrt(D))/(2*a);
		System.out.println((int)x1+" "+(int)x2);
		//double x1=(-(b)+Math.sqrt((Math.pow(b,2)-4*(a)*(c))))/2*a;
		//double x2=(-(b)-Math.sqrt((Math.pow(b,2)-4*(a)*(c))))/2*a;
//		if(x1>x2 || x1==x2)
//		{
//			System.out.println((int)x2+" "+(int)x1);
//		}
//		else if(x2>x1)
//		{
//			System.out.println((int)x1+" "+(int)x2);
//		}
		}
	
}
