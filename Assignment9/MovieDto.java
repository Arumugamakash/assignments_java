package Assignment9;

public class MovieDto {
	private String MovieName;
	private static byte NumberOfDirector = 1;
	private String DiretorName;
	private double BoxOfCollection;
	private String MovieGenre;
	private String releaseYear;

	public String getMovieName() {
		return MovieName;
	}

	public void setMovieName(String movieName) {
		MovieName = movieName;
	}

	public static byte getNumberOfDirector() {
		return NumberOfDirector;
	}

	public String getDiretorName() {
		return DiretorName;
	}

	public void setDiretorName(String diretorName) {
		DiretorName = diretorName;
	}

	public double getBoxOfCollection() {
		return BoxOfCollection;
	}

	public void setBoxOfCollection(double boxOfCollection) {
		BoxOfCollection = boxOfCollection;
	}

	public String getMovieGenre() {
		return MovieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		MovieGenre = movieGenre;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	public void getDetails() {
		System.out.println("\n\tMovie Details:\n\n" + "Movie Name :-" + getMovieName() + "\nMovie No of Director:-"
				+ getNumberOfDirector() + "\nMovie DirectorName:-" + getDiretorName()
				+ "\nMovie Box Ofiice Collection:-" + getBoxOfCollection() + "\nMovie Genre:-" + getMovieGenre()
				+ "\nMovie ReleaseYear:-" + getReleaseYear());
	}

}