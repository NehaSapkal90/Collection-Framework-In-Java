package LIST;

import java.util.ArrayList;

public class CloneAnArrayListToAnotherArrayList {

	private static final int ArrayList = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to clone an array list to another array list
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(4);
		list1.add(6);
		list1.add(3);
		list1.add(9);
		list1.add(7);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		myCode(list1,list2);
	}
	//EndOfMainMethod

@SuppressWarnings("unchecked")
public static void myCode(ArrayList<Integer> list1,ArrayList<Integer> list2) 
{
	//write code here
	list2= (ArrayList<Integer>)list1.clone();
	System.out.println(list2);
	}

}
