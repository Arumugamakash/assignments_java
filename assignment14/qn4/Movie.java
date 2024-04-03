package assignment14.qn4;

public abstract class Movie {

	String movieName;
	String duration;
	String releaseYear;
	String genre;

	public Movie(String movieName, String duration, String releaseYear, String genre) {
		super();
		this.movieName = movieName;
		this.duration = duration;
		this.releaseYear = releaseYear;
		this.genre = genre;
	}

	public abstract void getDetails();
}

class ThrillerMovie extends Movie {

	public ThrillerMovie(String movieName, String duration, String releaseYear, String genre) {
		super(movieName, duration, releaseYear, genre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getDetails() {
		System.out.println("\nMovie Details :  \n\n Movie Name = " + movieName + "\n Duration = " + duration
				+ "\n Release Year = " + releaseYear + "\n Genre =" + genre + "\n");
	}

}

class RomanticMovie extends Movie {

	public RomanticMovie(String movieName, String duration, String releaseYear, String genre) {
		super(movieName, duration, releaseYear, genre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getDetails() {
		System.out.println("\nMovie Details :  \n\n Movie Name = " + movieName + "\n Duration = " + duration
				+ "\n Release Year = " + releaseYear + "\n Genre =" + genre + "\n");
	}

}
