/**
*  CrewMember.java
*  Class representing a CrewMember object. 
*  @author Jun Abad
*/
public class CrewMember {
	
	// ---------------------------------------------------------
	// Instance variables for CrewMember object.
	// ---------------------------------------------------------
	private String crewMemberName, position, rank, registry, species;

	
	/**
	*  Constructor that sets the crewMemberName, position, rank, registry, species
	*  @param crewMemberName for CrewMember
	*  @param position for CrewMember
	*  @param rank boolean for CrewMember
	*  @param registry for CrewMember
	*  @param species for CrewMember
	*/
	public CrewMember(String crewMemberName, String position, String rank, String registry, String species) {
		this.crewMemberName = crewMemberName;
		this.position = position;
		this.rank = rank;
		this.registry = registry;
		this.species = species;
	}
	
	/**
	*  Setter that allows private instance variable crewMemberName 
	*  to be manipulated.
	*  @param crewMemberName for CrewMember
	*/
	public void setCrewMemberNamee(String crewMemberName) {
		this.crewMemberName = crewMemberName;
	}
	
	/**
	*  Getter that allows private instance variable crewMemberName 
	*  to be accessed
	*  @return String crewMemberName of CrewMember
	*/
	public String getCrewMemberName() {
		return crewMemberName;
	}
	
	/**
	*  Setter that allows private instance variable position 
	*  to be manipulated.
	*  @param position for CrewMember
	*/
	public void setposition(String position) {
		this.position = position;
	}
	
	/**
	*  Getter that allows private instance variable position 
	*  to be accessed
	*  @return String position of CrewMember
	*/
	public String getPosition() {
		return position;
	}
	
	
	
	/**
	*  Setter that allows private instance variable rank 
	*  to be manipulated.
	*  @param rank for CrewMember
	*/
	public void setRank(String rank) {
		this.rank = rank;
	}
		
	/**
	*  Getter that allows private instance variable rank 
	*  to be accessed
	*  @return String rank of CrewMember
	*/
	public String getRank() {
		return rank;
	}
	
	/**
	*  Setter that allows private instance variable registry 
	*  to be manipulated.
	*  @param registry for CrewMember
	*/
	public void setRegistry(String registry) {
		this.registry = registry;
	}
		
	/**
	*  Getter that allows private instance variable registry 
	*  to be accessed
	*  @return String registry of CrewMember
	*/
	public String getRegistry() {
		return registry;
	}
	
	/**
	*  Setter that allows private instance variable species 
	*  to be manipulated.
	*  @param species for CrewMember
	*/
	public void setSpecies(String species) {
		this.species = species;
	}
		
	/**
	*  Getter that allows private instance variable species 
	*  to be accessed
	*  @return String species of CrewMember
	*/
	public String getSpecies() {
		return species;
	}
	
	/**
	* Returns summary information of CrewMember
	* @return String representing the CrewMember summary
	*/
	public String toString() {
		return "- " + this.getRank() + " " + this.getCrewMemberName() + ", " + this.getPosition() + " (" + this.getSpecies() + ")" ;
	}
}