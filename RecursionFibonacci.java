package codingBlocks;

public class RecursionFibonacci {

	public static void main(String[] args) {
		System.out.println(Recursion_Fibonacci(1));
	}
	public static int Recursion_Fibonacci(int n)
	{
		if(n==1 || n==0)
		{
			return n;
		} 
		int fnm1=Recursion_Fibonacci(n-1);
		int fnm2=Recursion_Fibonacci(n-2);
		int ans=fnm1+fnm2;
		return ans;
	}	  
}