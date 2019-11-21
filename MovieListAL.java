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
    private ArrayList<Movie> pool = new ArrayList<Movie>();

    /**
     * Constructor for objects of class MovieListsAL
     */
    public MovieListAL(Movie[] movies)
    {
        for (int i = 0; i<movies.length; i++)
        {
            pool.add(movies[i]);
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
        for (Movie m : pool)
        {
            if (m.getStudio().equals(studio))
                getByStudio.add(m);
    }
    return getByStudio;
}
    
    /** 
     * get the movie with the highest rating within an ArrayList
     */
    public Movie getHighestrating(ArrayList<Movie> movies)
    {
        Movie getHighestrating = movies.get(0);
        double high = 0;
        for (Movie n : movies)
        {
            
            if (n.getRating() > high)
                {high = n.getRating();
                getHighestrating = n;
            }
            }
        
        return getHighestrating;
    }
    
    

    
    /**
     * Find the highest movies by studio
     */
    public ArrayList<Movie> findHighestRatedByStudio()
    {
        ArrayList<Movie> highestRated = new ArrayList<Movie>();
        
        // Your code goes here
        Movie Disney = getHighestrating(getByStudio("Disney"));
        Movie Indie = getHighestrating(getByStudio("Indy"));
        Movie Ghibli = getHighestrating(getByStudio("Ghibli"));
        highestRated.add(Disney);
        highestRated.add(Indie);
        highestRated.add(Ghibli);
        // return highestRated;
        return highestRated;
    }

}
