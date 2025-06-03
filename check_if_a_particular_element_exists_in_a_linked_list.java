package LIST;

import java.util.LinkedList;

public class check_if_a_particular_element_exists_in_a_linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to check if a particular element exists in a linked list.
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(42);
		list1.add(16);
		list1.add(33);
		list1.add(94);
		list1.add(87);
		
		int ele=94;
		myCode(list1,ele);
	}
	//EndOfMainMethod

public static void myCode(LinkedList<Integer> list1,int ele) 
{
	//write code here
	System.out.println(list1.contains(ele));
	}

}
