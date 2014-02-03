import acm.program.ConsoleProgram;

public class CDCollectionFirst extends ConsoleProgram
{
	public void run()
	{
		CDFirst[] cds = new CDFirst[4];
		cds[0] = new CDFirst("John Lennon", "Classic Rock", 20, 1965);
		cds[1] = new CDFirst("Prince", "Funk", 14, 1975);
		cds[2] = new CDFirst("Lady Gaga", "Gross Music", 18, 2012);
		cds[3] = new CDFirst("Elvis", "Rock n' Roll", 16, 1963);
		
		for (CDFirst cd : cds)
		{
			println(cd.getArtist() + " " + cd.getGenre() + " " + cd.getNumTracks() + " " + cd.getYear());
		}
	}
}
