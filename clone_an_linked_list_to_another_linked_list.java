package LIST;

import java.util.LinkedList;

public class clone_an_linked_list_to_another_linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(4);
		list1.add(6);
		list1.add(3);
		list1.add(9);
		list1.add(7);
		
		
		LinkedList<Integer> list3=new LinkedList<Integer>();
		
		myCode(list1,list3);
	}
	//EndOfMainMethod

@SuppressWarnings("unchecked")
public static void myCode(LinkedList<Integer> list1,LinkedList<Integer> list3) 
{
	list3= (LinkedList<Integer>)list1.clone();
	System.out.println(list3);

	}

}
