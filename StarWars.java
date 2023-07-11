
import java.io.IOException;
public class StarWars {
	public static void main( String[] args ) {
		Fleet jedi = new Fleet("United Federation of Planets");
		try {
			// Load data for the school, and print its status 
			jedi.loadStarShips( "data/fleet.csv" );
			jedi.loadCrewMembers( "data/personnel.csv" );
			System.out.println(jedi);
		}catch( IOException e ) {
			System.out.println( "Error loading the file - please check its location." );
			e.printStackTrace();
		}
	}
}