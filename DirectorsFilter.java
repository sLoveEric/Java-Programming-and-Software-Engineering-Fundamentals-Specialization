
/**
 * Write a description of DirectorsFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DirectorsFilter implements Filter{
    private String[] myDirector;
    
    public DirectorsFilter (String directors){
        myDirector = directors.split(",");
    }
    
        @Override
    public boolean satisfies(String id) {
	for(String d: myDirector) {
		if (MovieDatabase.getDirector(id).contains(d))
		{
		    return true;
		}
	}
	return false;
    }
}
