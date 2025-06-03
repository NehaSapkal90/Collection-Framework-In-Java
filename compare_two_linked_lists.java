package LIST;

import java.util.LinkedList;

public class compare_two_linked_lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> c1= new LinkedList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		LinkedList<String> c2= new LinkedList<String>();
		c2.add("Red");
		c2.add("Green");
		c2.add("Black");
		c2.add("Orange");
		myCode(c1,c2);
	}
	//EndOfMainMethod
	public static void myCode(LinkedList<String> c1,LinkedList<String> c2) 
	{
		//write code here
		int size=Math.max(c1.size(), c2.size());
		LinkedList<String> result = new LinkedList<>();
		for(int i=0; i<size; i++)
		{
		if(i<c1.size()&& i<c2.size() && c1.get(i).equals(c2.get(i)))
			{
				result.add("Yes");
			}
			else
			{
				result.add("No");
			}
		}
		System.out.println(result);

	}

}
