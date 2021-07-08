package codingBlocks;

import java.util.*;

class sort implements Comparator<String>
{
	@Override
	public int compare(String w1,String w2)
	{
		String x = w1+w2;
		String y = w2+w1;
		if(x.compareTo(y)>0) return -1;
		else return 1;
	}
}


public class Form_Biggest_Number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			ArrayList<String> arr =new ArrayList<>();
			int m=sc.nextInt();
			sc.nextLine();
			for(int i=0;i<m;i++)
			{
				arr.add(sc.next());
			}
			Collections.sort(arr,new sort());
			String f="";
			for(int i=0;i<m;i++) {
				f+=arr.get(i);
			}
			System.out.println(f);
		}
		
	}
	
}
