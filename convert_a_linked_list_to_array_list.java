package LIST;

import java.util.ArrayList;
import java.util.LinkedList;

public class convert_a_linked_list_to_array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to convert a linked list to array list
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(42);
		list1.add(16);
		list1.add(33);
		list1.add(94);
		list1.add(87);
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		myCode(list1,al);
	}
	//EndOfMainMethod

public static void myCode(LinkedList<Integer> list1,ArrayList<Integer> al) 
{
	list1.addAll(al);
	System.out.println(list1);
	
	}

}
