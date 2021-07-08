package codingBlocks;

public class Recursion_FirstIndex {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		System.out.println(FirstIndex(a, 0, 6));
	}
	public static int FirstIndex(int arr[], int si, int data)
	{
		if(arr.length==si)
		{
			return -1;
		}
		if(arr[si]==data)
		{
			return si;
		}
		else {
			int ans= FirstIndex(arr,si+1,data);
			return ans;
		}
	}
}

