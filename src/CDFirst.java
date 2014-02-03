
public class CDFirst {
	

	//Create attributes.
	private String artist;
	private String genre;
	private int numTracks;
	private int year;

	/* 
	Parameterized Constructor
	------------------------
	- Accepts color, genre, numTracks, and year, and
	- Initializes each of the attributes
	*/

	public CDFirst (String artist, String genre, int numTracks, int year)
	{
		this.artist = artist;
		this.genre = genre;
		this.numTracks = numTracks;
		this.year = year;
	}

	/*
	Public Methods
	--------------
	- Create getters and setters for all the instance variables
	*/

	public String getArtist()
	{
		return artist;
	}

	public void setArtist(String artist)
	{
		this.artist = artist;
	}

	public String getGenre()
	{
		return genre;
	}

	public void setGenre(String genre)
	{
		this.genre = genre;
	}

	public int getNumTracks()
	{
		return numTracks;
	}

	public void setNumTracks(int numTracks)
	{
		this.numTracks = numTracks;
	}

	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

}
