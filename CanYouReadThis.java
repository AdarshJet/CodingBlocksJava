package codingBlocks;

import java.util.*;

public class CanYouReadThis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		ArrayList<Integer> pos=new ArrayList<Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
			{
				pos.add(i);
			}
		}
		pos.add(s.length());
		int n=pos.size();
		for(int i=0;i<n-1;i++)
		{
			String temp=s.substring(pos.get(i),pos.get(i+1));
			System.out.println(temp);
		}
	}

}
