package LIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Count_Frequencies_of_Elements_in_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 2, -1, 3, 1, 4, -1, 2, 3));
		myCode(numbers);
	}
	//EndOfMainMethod
	private static void myCode(ArrayList<Integer> numbers) 
	{
		//WriteCode Here
		Map<Integer, Integer> map = new HashMap<>();
		for(int num:numbers)
		{
			map.put(num, map.getOrDefault(num,0)+1);
		}
		System.out.println(map);

	}

}
