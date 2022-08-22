
/**
 * Write a description of MovieRunnerAverage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class MovieRunnerAverage {
    public void printAverageRatings() {
        SecondRatings sr = new SecondRatings("data/ratedmoviesfull.csv", "data/ratings.csv");
	System.out.println("The number of movies: " + sr.getMovieSize());
	System.out.println("The number of raters: " + sr.getRaterSize());
//	System.out.println(sr.getAverageByID("0068646", 4));
	int minimalRaters = 12;
	ArrayList<Rating> ratings = sr.getAverageRatings(minimalRaters);
	Collections.sort(ratings);
	for(Rating r: ratings) {
	    	System.out.println(r.getValue() + " " + sr.getTitle(r.getItem()));
	}
    }
    
    public void getAverageRatingOneMovie() {
        SecondRatings sr = new SecondRatings("data/ratedmoviesfull.csv", "data/ratings.csv");
	String movieTitle = "Vacation";
	String movieID = sr.getID(movieTitle);
	int minimalRaters = 0;
	ArrayList<Rating> ratings = sr.getAverageRatings(minimalRaters);
	for(Rating r: ratings) {
	    if(r.getItem().equals(movieID))
		System.out.println("The average rating for the movie \"" + movieTitle + "\" is " + r.getValue());
        }
    }
}
