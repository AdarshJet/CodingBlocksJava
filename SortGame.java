package codingBlocks;

import java.util.*;

class employee{
	String name;
	int salary;
	
	void setName(String name) {
		this.name=name;
	}
	
	void setSalary(int salary) {
		this.salary=salary;
	}
}

class sort2 implements Comparator<employee>{

	@Override
	public int compare(employee e1, employee e2) {
		// TODO Auto-generated method stub
		if(e1.salary>e2.salary) return -1;
		else if(e1.salary<e2.salary) return 1;
		else {
			return e1.name.compareTo(e2.name);
		}
	}
	
}

public class SortGame {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		ArrayList<employee> arr =new ArrayList<>();
		
		int n=sc.nextInt();
		int N=sc.nextInt();

		
		for(int i=0;i<N;i++)
		{
			employee temp = new employee();
			String name = sc.next();
			int sal = sc.nextInt();
			
			if(sal>=n) {
				temp.setName(name);
				temp.setSalary(sal);
				arr.add(temp);
			}
			
		}
		System.out.println(arr);
		Collections.sort(arr,new sort2());
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i).name+" "+arr.get(i).salary);
		}
		
	}
}
