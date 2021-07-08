package codingBlocks;

public class SpiralPrint1 {

	public static void main(String[] args) {
		int[][] arr= {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
		int top=0;
		int left=0;
		int right=arr[top].length-1;
		int bottom=arr.length-1;
		int c=(bottom+1)*(right+1);
		int d=1;
		while(left<=right && top<=bottom)
		{
			if(c>0)
			{
				if(d==1)
				{
					for(int i=left;i<=right;i++)
					{
						System.out.print(arr[top][i]+" ");
						c--;
					}
					d=2;
					top++; 
				}
			}
			if(c>0)
			{
			if(d==2)
			{ 
				for(int i=top;i<=bottom;i++)
				{
					System.out.print(arr[i][right]+" ");
					c--;
				}
				d=3;
				right--;
			}
			}
			if(c>0)
				{
				if(d==3)
				{
					for(int i=right;i>=left;i--)
					{
						System.out.print(arr[bottom][i]+" ");
						c--;
					}
					d=4;
					bottom--;
				}
				}
			if(c>0)
			{
				if(d==4){
					for(int i=bottom;i>=top;i--)
					{
						System.out.print(arr[i][left]+" ");
						c--;
					} 
					d=1;
					left++;
				}
			}
		}
	}
}

		
