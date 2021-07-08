package codingBlocks;

import java.util.Scanner;

public class HelpRamu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		while(N>0) {
			
			int c1=sc.nextInt();
			int c2=sc.nextInt();
			int c3=sc.nextInt();
			int c4=sc.nextInt();
			int na=sc.nextInt();
			int nc=sc.nextInt();
			int minAC = 0;
			int minCC=0;
			for(int i=0;i<na;i++) {
				int nr = sc.nextInt();
				minAC+=Math.min(nr*c1, c2);
			}
			minAC = Math.min(minAC, c3);
			for(int i=0;i<nc;i++) {
				int nr = sc.nextInt();
				minCC+=Math.min(nr*c1, c2);
			}
			minCC = Math.min(minCC, c3);
			int minTC = Math.min(minAC+minCC, c4);
			System.out.println(minTC);
			
			N--;
		}
		
	}

}
