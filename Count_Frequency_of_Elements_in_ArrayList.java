package LIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Count_Frequency_of_Elements_in_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Problem Statement:
//			Write a program to count the frequency of each element in an ArrayList of strings.
//			i/p : ArrayList<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "pear", "banana", "banana"));
//			o/p :
//			{apple=2, banana=3, pear=1}
		ArrayList<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "pear", "banana", "banana"));
		myCode(words);
	}
	//EndOfMainMethod

	private static void myCode(ArrayList<String> words) {
		
		//WriteCode Here
		  // Create a HashMap to store the frequency of each word
        HashMap<String, Integer> map = new HashMap<>();

        // Loop through each word in the words ArrayList
        for (String word : words) {
            // Update the frequency of each word in the HashMap
            map.put(word,map.getOrDefault(word, 0) + 1);
        }

        // Print the frequency of each word
        System.out.println(map);


	}

}
