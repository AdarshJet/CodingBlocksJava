package codingBlocks;

public class Recursion_Factorial {

	public static void main(String[] args) {
		System.out.println(RecursionFactorial(5));
	} 
	public static int RecursionFactorial(int n)
	{
		if(n==1)
		{
			return 1;
		}
		int fnm1=RecursionFactorial(n-1);
		int fn=n*fnm1;
		return fn;
	}

}
