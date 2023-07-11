/*
Jun Abad
rbr028
CS-3443
10/19/2020
Lab3
*/

/**
*  Fleet.java
*  Class representing a Fleet object. 
*  @author Jun Abad
*/
import java.io.*;
import java.util.*;

public class Fleet {
	
	// ---------------------------------------------------------
	// Instance variables for Fleet object.
	// ---------------------------------------------------------
	private String fleetName;			// name of Fleet
	private ArrayList<Starship> starships;		// an ArrayList of starships
	private String crewMemberFile;		// file path for crewMembers
	private String starshipFile;		// file path for Starships
	
	/**
	*  Constructor that sets the fleetName and starships ArrayList.
	*  @param fleetName for fleet
	*/
	public Fleet(String fleetName) {
		this.fleetName = fleetName;
		starships = new ArrayList<>();
	}
	
	/**
	*  Setter that allows private instance variable fleetName 
	*  to be manipulated
	*  @param fleetName of fleet
	*/
	public void setFleetName(String fleetName) {
		this.fleetName = fleetName;
	}
	
	/**
	*  Getter that allows private instance variable fleetName 
	*  to be accessed
	*  @return String fleetName of fleet
	*/
	public String getFleetName() {
		return fleetName;
	}
	
	/**
	*  Setter that allows private ArrayList starships 
	*  to be manipulated
	*  @param starships of fleet
	*/
	public void setStarShips(ArrayList<Starship> starships) {
		this.starships = starships;
	}
		
	/**
	*  Getter that allows private ArrayList starships 
	*  to be accessed
	*  @return ArrayList starships of fleet
	*/
	public ArrayList<Starship> getStarships() {
		return starships;
	}
	
	/**
	*  Method that takes in starshipFile and throw an IOException. 
	*  Object methods will load data in given file into the
	*  appropriate objects
	*  @param csvFile for starships
	*  @throws IOException if String is less than length of 3
	*/
	public void loadStarShips(String csvFile) throws IOException {
		this.starshipFile = csvFile;
		BufferedReader read = null;
		String line = "";
		String delimiter = ",";
		int lineCount = 1;
		
		read = new BufferedReader(new FileReader(csvFile));
		
		while((line = read.readLine()) != null) {
			// comma will serve as a delimiter
			String[] starshipString = line.split(delimiter);
			
			// invalid input will spit
			if(starshipString.length < 3) {
				read.close();
				throw new IOException("Error while reading" + csvFile + ". String is less than 3 at line" + lineCount + "\n");
			}
		
			// Starship is created
			Starship starship = new Starship(starshipString[0], starshipString[1], starshipString[2]);
			
			// Starship is added by calling addStarship method
			addStarship(starship);
			
			lineCount++;
		}
		read.close();
	}
	
	/**
	*  Method that takes in crewMemberFile  and throw an IOException. 
	*  Object methods will load data in given file into the
	*  appropriate objects
	*  @param csvFile for crewMembers
	*  @throws IOException if String is less than length of 5
	*  @throws IOException if Starship cannot be found
	*/
	public void loadCrewMembers(String csvFile) throws IOException {
		this.crewMemberFile = csvFile;
		BufferedReader read = null;
		String line = "";
		String delimiter = ",";
		int lineCount = 1;
			
		read = new BufferedReader(new FileReader(csvFile));
			
		while((line = read.readLine()) != null) {
			// comma will serve as a delimiter
			String[] membersString = line.split(delimiter);
				
			// invalid input will spit
			if(membersString.length < 5) {
				read.close();
				throw new IOException("Error while reading" + csvFile + ". String is less than 5 at line" + lineCount + "\n");
			}
				
			// Identify Starship object that belongs to that registry
			Starship starship = getRegistryFromRegistryCode(membersString[3]);
			
			// Starship cannot be found
			if(starship == null) {
				read.close();
				throw new IOException("Error while reading" + csvFile + ". Cannot find registry code at line" + lineCount + "\n");
			}
		
			// CrewMember is created
			CrewMember crewMember = new CrewMember(membersString[0], membersString[1],membersString[2],membersString[3],membersString[4]);
			
			// Add member to starship
			starship.addMember(crewMember);;
			
			lineCount++;
		}
		read.close();
	}
	
	/**
	*  Search for registry 
	*  @param registry for registry required
	*  @return Starship currentStarship that is found
	*/
	private Starship getRegistryFromRegistryCode(String registry) {
		for(Starship currentStarship : getStarships()) {
			if(currentStarship.getRegistry().equals(registry)) {
				return currentStarship;
			}
		}
		return null;
	}
	
	/**
	*  Method that allows ArrayList Starship size to be returned
	*  @return starships.size()
	*/
	public int getStarshipSize() {
		return starships.size();
	}
	
	/**
	*  Method that adds new starships to the fleet
	*  @param star for the Starship being added
	*/
	public void addStarship(Starship star) {
		starships.add(star);
	}
	
	/**
	*  Returns the contents of the school together with summary
	*  information of the zones and students in that zone.
	*  @return String zoneString representing the school summary
	*/
	public String toString() {
		String starshipString = fleetName  + "\n\n\n";
		
		int starshipCounter = getStarshipSize();
		for(int i = 0; i < starshipCounter; i++) {
			starshipString += starships.get(i) + "\n";
		}
		return starshipString;
	}
}
