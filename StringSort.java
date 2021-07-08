package codingBlocks;

import java.util.*;
class words{
	String word;
	void SetWord(String w) {
		this.word=w;
	}
}
class wordssort implements Comparator<words>
{
	@Override
	public int compare(words w1,words w2)
	{
		int l1=w1.word.length();
		int l2=w2.word.length();
		String s;
		
		if(l1>l2)
		{
			s=w1.word.substring(0,l2);
			if(s.equalsIgnoreCase(w2.word))
			{
				return -1;
			}
			else {
				return w1.word.compareToIgnoreCase(w2.word);
				}
			}
		else{
			s=w2.word.substring(0,l1);
			if(s.equalsIgnoreCase(w1.word))
			{
				return 1;
			}
			else
			{
				return w1.word.compareToIgnoreCase(w2.word);
			}
		}
		
	}
}

public class StringSort {

	public static void main(String[] args) {
		ArrayList<words> arr= new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			words temp = new words();
			String word = sc.next();
			temp.SetWord(word);
			arr.add(temp);
		}
		System.out.println(arr);
		Collections.sort(arr,new wordssort());
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i).word);
		}
		
	}

}
