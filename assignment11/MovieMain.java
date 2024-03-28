package assignment11;

class Movie {
	String movieName;
	double duration;
	String releaseYear;
	String genre;
	static int noOfDirector = 1;

	public Movie(String movieName, double duration, String releaseYear, String genre) {
		super();
		this.movieName = movieName;
		this.duration = duration;
		this.releaseYear = releaseYear;
		this.genre = genre;
	}

	public void getDetails() {
		System.out.println(
				"\nMovie Details :  \n\n Movie Name = " + movieName + "\n Duration = " + duration + "\n Release Year = "
						+ releaseYear + "\n Genre =" + genre + "\n No of Director = " + noOfDirector + "\n");
	}
}

class ThrillerMovie extends Movie {

	public ThrillerMovie(String movieName, double duration, String releaseYear, String genre) {
		super(movieName, duration, releaseYear, genre);
	}

}

class RomCom extends Movie {

	public RomCom(String movieName, double duration, String releaseYear, String genre) {
		super(movieName, duration, releaseYear, genre);
	}

}

public class MovieMain {
	public static void main(String[] args) {
		Movie m = new RomCom("RomeoJuliyet", 2.30, "2015", "romatic");
		m.getDetails();
		m=new ThrillerMovie("Kanchana", 3.00, "2018", "Horrror");
		m.getDetails();
	}

}
