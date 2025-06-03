package LIST;

import java.util.ArrayList;
import java.util.Arrays;

public class Count_Vowel {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "grape", "kiwi", "avocado"));
		myCode(words);
	}
	//EndOfMainMethod
	private static void myCode(ArrayList<String> words) 
	{
		//WriteCode Here
		int vowelCount=0;
		int consonantCount=0;
		for(String word: words){
		char firstChar= Character.toLowerCase(word.charAt(0));
		switch(firstChar)
		{
			case 'a':case 'e': case 'i': case 'o': case 'u':
			vowelCount++;
			break;
			default:
			consonantCount++;
		}
	}
	System.out.println("Vowel Count: "+vowelCount);
	System.out.println("Consonanat Count: "+consonantCount);

	}

}
