
public class YearAfterFilter implements Filter {
	private int myYear;
	
	public YearAfterFilter(int year) {
		myYear = year;
	}
	
	@Override
	public boolean satisfies(String id) {
	    //access year of movie with given id
	    //compare to myYear, return value
		return MovieDatabase.getYear(id) >= myYear;
	}

}
