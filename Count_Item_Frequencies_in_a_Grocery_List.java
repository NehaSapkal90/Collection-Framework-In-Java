package LIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Count_Item_Frequencies_in_a_Grocery_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to count the frequency of each item in a grocery list and determine which item has the highest frequency. The program should use two lists: one for item names and another for their corresponding quantities.
//
//		Input:
//		ArrayList<String> items = new ArrayList<>(Arrays.asList("Milk", "Eggs", "Bread", "Milk", "Eggs", "Butter", "Butter", "Milk"));
//		ArrayList<Integer> quantities = new ArrayList<>(Arrays.asList(1, 12, 2, 1, 6, 1, 2, 1));
//		Output:
//			Item Frequencies: {Milk=3, Eggs=2, Bread=1, Butter=2}
//			Highest Frequency Item: Milk
		 ArrayList<String> items = new ArrayList<>(Arrays.asList("Milk", "Eggs", "Bread", "Milk", "Eggs", "Butter", "Butter", "Milk"));
	        ArrayList<Integer> quantities = new ArrayList<>(Arrays.asList(1, 12, 2, 1, 6, 1, 2, 1));
	        myCode(items, quantities);
	    }
	    //EndOfMainMethod

	    private static void myCode(ArrayList<String> items, ArrayList<Integer> quantities) {
	    	
	    	Map<String, Integer> itemFrequencies= new HashMap<>();
	    	for(String item: items) {
	    		itemFrequencies.put(item, itemFrequencies.getOrDefault(item, 0)+1);
	    		
	    	}
	    	String highestFrequencyItem=null;
	    	int maxFrequency=0;
	    	for(Map.Entry<String, Integer>entry:itemFrequencies.entrySet()) {
	    		if(entry.getValue()>maxFrequency) {
	    			highestFrequencyItem=entry.getKey();
	    			maxFrequency=entry.getValue();
	    		}
	    	}
	    	
	    	System.out.println("Item Frequencies: "+itemFrequencies);
	    	System.out.println("Highest Frequency: "+highestFrequencyItem);

	}

}
