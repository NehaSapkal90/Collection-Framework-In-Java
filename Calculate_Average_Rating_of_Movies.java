package LIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Calculate_Average_Rating_of_Movies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a program to calculate the average rating of different movies watched by users. The program should take a list of movie titles and their corresponding ratings. It should also determine which movie has the highest average rating.
//
//		Input:
//		ArrayList<String> movies = new ArrayList<>(Arrays.asList("Inception", "Avatar", "Interstellar", "Inception", "Avatar", "Inception", "Avatar"));
//		ArrayList<Double> ratings = new ArrayList<>(Arrays.asList(9.0, 8.0, 8.5, 9.5, 7.5, 9.0, 8.0));
//
//		Output:
//		Average Ratings: {Inception=9.17, Avatar=8.17, Interstellar=8.5}
//		Highest Rated Movie: Inception
		
		 ArrayList<String> movies = new ArrayList<>(Arrays.asList("Inception", "Avatar", "Interstellar", "Inception", "Avatar", "Inception", "Avatar"));
	        ArrayList<Double> ratings = new ArrayList<>(Arrays.asList(9.0, 8.0, 8.5, 9.5, 7.5, 9.0, 8.0));
	        myCode(movies, ratings);
	    }
	    //EndOfMainMethod

	    private static void myCode(ArrayList<String> movies, ArrayList<Double> ratings) {
	        //WriteCode Here
	    	
	    	 Map<String, double[]> movieData = new HashMap<>();
	         
	         // Populate the map
	         for (int i = 0; i < movies.size(); i++) {
	             String movie = movies.get(i);
	             double rating = ratings.get(i);
	             
	             // Initialize or update the movie data
	             movieData.putIfAbsent(movie, new double[2]);
	             movieData.get(movie)[0] += rating; // Sum of ratings
	             movieData.get(movie)[1] += 1; // Count of ratings
	         }
	         
	         // Calculate average ratings and find the highest-rated movie
	         String highestRatedMovie = null;
	         double highestAverageRating = 0.0;
	         Map<String, Double> averageRatings = new HashMap<>();
	         
	         for (Map.Entry<String, double[]> entry : movieData.entrySet()) {
	             String movie = entry.getKey();
	             double[] data = entry.getValue();
	             double average = data[0] / data[1]; // Calculate average rating
	             
	             averageRatings.put(movie, average);
	             
	             if (average > highestAverageRating) {
	                 highestAverageRating = average;
	                 highestRatedMovie = movie;
	             }
	         }
	         
	         // Print the average ratings
	         System.out.println("Average Ratings: " + averageRatings);
	         
	         // Print the highest-rated movie
	         System.out.println("Highest Rated Movie: " + highestRatedMovie);
	     

	}

}
