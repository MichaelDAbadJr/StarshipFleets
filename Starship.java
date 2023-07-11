/*
Jun Abad
rbr028
CS-3443
10/19/2020
Lab3
*/

/**
*  Starship.java
*  Class representing a Starship object. 
*  @author Jun Abad
*/
import java.util.*;

public class Starship {

	// ---------------------------------------------------------
	// Instance variables for Starship object.
	// ---------------------------------------------------------
	private String starshipName;	// name of Starship
	private String registry;	// registry for Starship
	private String classStarShip;	// class of  Starship
	private ArrayList <CrewMember> members;	// ArrayList of CrewMember
	
	/**
	*  Constructor that sets the starshipName, registry and classStarShip.
	*  @param starshipName for Starship
	*  @param registry for Starship
	*  @param classStarShip Starship
	*/
	public Starship(String starshipName, String registry, String classStarShip) {
		this.starshipName = starshipName;
		this.registry = registry;
		this.classStarShip = classStarShip;
		members = new ArrayList<>();
	}
	
	/**
	*  Setter that allows private instance variable starshipName 
	*  to be manipulated.
	*  @param starshipName for Starship
	*/
	public void setStarshipName(String starshipName) {
		this.starshipName = starshipName;
	}
	
	/**
	*  Getter that allows private instance variable starshipName 
	*  to be accessed
	*  @return String starshipName of Starship
	*/
	public String getStarshipName() {
		return starshipName;
	}
	
	/**
	*  Setter that allows private instance variable registry 
	*  to be manipulated.
	*  @param starshipName for Starship
	*/
	public void setRegistry(String registry) {
		this.registry = registry;
	}
	
	/**
	*  Getter that allows private instance variable registry 
	*  to be accessed
	*  @return String registry of Starship
	*/
	public String getRegistry() {
		return registry;
	}
	
	/**
	*  Setter that allows private instance variable classStarShip 
	*  to be manipulated.
	*  @param classStarShip for Starship
	*/
	public void setClassStarShip(String classStarShip) {
		this.classStarShip = classStarShip;
	}
	
	/**
	*  Getter that allows private instance variable classStarShip 
	*  to be accessed
	*  @return String classStarShip of Starship
	*/
	public String getClassStarShip() {
		return classStarShip;
	}
	
	/**
	*  Setter that allows private ArrayList members 
	*  to be manipulated
	*  @param members ArrayList
	*/
	public void setMembers(ArrayList<CrewMember> members) {
		this.members = members;
	}
	
	/**
	*  Getter that allows private ArrayList members 
	*  to be accessed
	*  @return ArrayList members of Starship
	*/
	public ArrayList<CrewMember> getMembers() {
		return members;
	}
	
	/**
	*  Method that adds new members to the members ArrayList
	*  and sequentially sets the registry
	*  @param member to be added
	*/
	public void addMember(CrewMember member) {
		members.add(member);
		member.setRegistry(this.registry);
	}
	
	/**
	*  Method that removes members from the members ArrayList
	*  @param student to be removed
	*/
	public void removeMember(CrewMember member) {
		members.remove(member);
	}
	
	/**
	*  Method that returns members ArrayList size
	*  @return members.size() of ArrayList
	*/
	public int getMemberCount() {
		return members.size();
	}
	
	/**
	* Returns summary information of Starship and members in that registry
	* @return String memberString representing the Starship summary
	*/
	public String toString() {
		String memberString = String.format("%s [%s], Class %s:, \n", starshipName, registry, classStarShip + ", Crew: " + members.size());
		
		int memberCounter = getMemberCount();
		for(int i = 0; i < memberCounter; i++) {
			memberString += members.get(i) + "\n";
		}
		return memberString;
	}
}