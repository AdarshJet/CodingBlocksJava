package codingBlocks;

public class RecursionEx2 {

	public static void main(String[] args) {
		PDISkip(5); 
	}
	public static void PDISkip(int n)
	{
		if(n==0)
		{
			return;
		}
		if(n%2!=0)
		{
			System.out.println(n);
		}
		PDISkip(n-1);
		if(n%2==0)
		{
			System.out.println(n);
		}
	}

}
