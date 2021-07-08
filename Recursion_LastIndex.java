package codingBlocks;

public class Recursion_LastIndex {

	public static void main(String[] args) {
		int a[]= {1,2,3,3,4,5};
		System.out.println(LastIndex(a, 0, 3));
	}
	public static int LastIndex(int arr[], int si, int data)
	{
		if(arr.length==si)
		{
			return -1;
		}
		int index=LastIndex(arr, si+1, data);
		if(index==-1)
		{
			if(arr[si]==data)
			{
				return si;
			}
			else {
				return -1;
			}
		}
		else {
			return index;
		}
	}
}
