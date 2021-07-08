package codingBlocks;

public class Recursion_Power {

	public static void main(String[] args) {
		System.out.println(RecursionPower(4, 3));

	}
	public static int RecursionPower(int x, int n)
	{
		if(n==1)
		{
			return x;
		}
		int temp=RecursionPower(x,n-1);
		int ans= x*temp;
		return ans;
	}

}
