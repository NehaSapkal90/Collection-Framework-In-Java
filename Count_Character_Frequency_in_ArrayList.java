package LIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Count_Character_Frequency_in_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<Character> characters = new ArrayList<>(Arrays.asList('a', 'b', 'a', 'c', 'b', 'd', 'a'));
		myCode(characters);
	}
	//EndOfMainMethod
	private static void myCode(ArrayList<Character> characters) 
	{
		//WriteCode Here
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(char c:characters)
		{
			map.put(c, map.getOrDefault(c,0)+1);
		}
		System.out.println(map);

	}

}
