package codingBlocks;

public class Recursio_IsArraySorted {

	public static void main(String[] args) {
		int a[]= {1,2,8,4,5};
		System.out.println(isSorted(a, 0));
	}
	public static boolean isSorted(int arr[], int si)
	{
		if(arr.length-1==si)
		{
			return true;
		}
		if(arr[si]>arr[si+1])
		{
			return false;
		}
		else {
			boolean restAns=isSorted(arr,si+1);
			return restAns;
		}
	}

}
