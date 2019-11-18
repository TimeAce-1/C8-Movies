import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class MovieListAL here.
 *
 * @author (Mr. Kim)
 * @version (2019-11-16)
 */
public class MovieListAL
{
    // instance variables - replace the example below with your own
    private ArrayList<Movie> pool;

    /**
     * Constructor for objects of class MovieListsAL
     */
    public MovieListAL(Movie[] movieList)
    {
        for (int i = 0; i<movieList.length; i++)
        {
            pool.add(movieList[i]);
        }
    }

    public ArrayList<Movie> getPool()
    {
        return pool;
    }
    
    /**
     * Given an arraylist of Movies and a studio name, create a new ArrayList of movies
     * by that studio
     */
    public ArrayList<Movie> getByStudio(String studio)
    { ArrayList<Movie> getByStudio = new ArrayList<Movie>();
        for (int i = 0; i<pool.size(); i++)
        {
            if (pool.get(i).getStudio().equals(studio))
                getByStudio.add(pool.get(i));
    }
    return null;
}
    
    /** 
     * get the movie with the highest rating within an ArrayList
     */
    public Movie getHighestrating(ArrayList<Movie> movies)
    {

        
        return null;
        
    }
    
    

    
    /**
     * Find the highest movies by studio
     */
    public ArrayList<Movie> findHighestRatedByStudio()
    {
        ArrayList<Movie> highestRated = new ArrayList<Movie>();
        
        // Your code goes here
         return null;
        // return highestRated;
        
    }

}
