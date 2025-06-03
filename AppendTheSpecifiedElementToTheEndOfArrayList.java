package LIST;
import java.util.ArrayList;

public class AppendTheSpecifiedElementToTheEndOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to append the specified element to the end of a Array list
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(4);
		list1.add(6);
		list1.add(3);
		list1.add(9);
		list1.add(7);
	System.out.println(list1);
		int ele=30;
		myCode(list1,ele);
	}
	//EndOfMainMethod

public static void myCode(ArrayList<Integer> list1,int ele) 
{
	list1.add(ele);
	System.out.println(list1);

	}

}
