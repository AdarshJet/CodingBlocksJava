package codingBlocks;

import java.util.*;

class CBNumber{
	String number;
	int end;
	int start;
	public CBNumber(String number, int start, int end) {
		super();
		this.number = number;
		this.end = end;
		this.start = start;
	}
}

class sort1 implements Comparator<CBNumber>
{
	@Override
	public int compare(CBNumber n1,CBNumber n2)
	{
		if(n1.end>n2.end)
		{
			return 1;
		}
		else {
			return -1;
		}
	}
}

public class FindingCBnumbers {

	public static void main(String[] args) {
		ArrayList<CBNumber> arr =new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		if(s.length()==1)
		{
			System.out.println("1");
			return;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				String number=s.substring(i,j+1);
				long t=Long.valueOf(number);
				if(cb(t))
				{
					arr.add(new CBNumber(number,i,j));
				}
			}
		}
		Collections.sort(arr, new sort1());
		int temp=arr.get(0).end;
		int c=1;
		for(int i=1;i<arr.size();i++)
		{
			if(arr.get(i).start>temp)
			{
				temp=arr.get(i).end;
				c++;
			}
		}
		System.out.println(c);
	}
	public static boolean cb(long num) {
	    if(num == 0 || num==1)
	    {
	        return false;
	    }

	    if(num == 2
	    || num == 3
	    || num == 5
	    || num == 7
	    || num == 11
	    || num == 13
	    || num == 17
	    || num == 19
	    || num == 23
	    || num == 29
	    )
	    {
	        return true;
	    }
	        

	    if(num % 2==0
	    || num % 3==0
	    || num % 5==0
	    || num % 7==0
	    || num % 11==0
	    || num % 13==0
	    || num % 17==0
	    || num % 19==0
	    || num % 23==0
	    || num % 29==0
	    )
	    {
	        return false;
	    }

	    return true;
	}

}
