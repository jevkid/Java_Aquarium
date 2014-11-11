/*
 * A class to represent a number of specimens of aquarium fish species.
 */
public class Fish {

	private String species;
	private String name;
	private int totalNumSpecimens;
	private int numAvailableSpecimens;

	/*
	 * Constructor method for creating a fish with a given species,
	 * name, and number of specimens.
	 * This constructor checks that the total number of specimens argument is 
	 * valid; i.e., the number of specimens should be 1 or more. 
	 * If not valid, the constructor will throw an IllegalArgumentException with
	 * an appropriate error message.
	 */
	public Fish( String inSpecies, String inName, int inTotalNumSpecimens ) {
		species = inSpecies;
		name = inName;

		if( inTotalNumSpecimens < 1 ) 
			throw new IllegalArgumentException( "Number of specimens must be >= 1" );
		
		totalNumSpecimens = inTotalNumSpecimens;
		numAvailableSpecimens = inTotalNumSpecimens;
	}

	/*
	 * An accessor method that returns the fish's species.
	 */
	public String getSpecies() {
		return species;
	}

	/*
	 * An accessor method that returns the fish's name.
	 */
	public String getName() {
		return name;
	}

	/*
	 * An accessor method that returns total number of specimens of this fish.
	 */ 
	public int getTotalSpecimens() {
		return totalNumSpecimens;
	}

	/*
	 * Returns the number of specimens of this fish that are available
	 * (i.e., not been reserved).
	 */
	public int getAvailableSpecimens() {
		return numAvailableSpecimens;
	}

	/*
	 * Mark one of the specimens of this fish as reserved.
	 * If there are no available specimens to reserve then this method should 
	 * throw an IllegalStateException with an appropriate error message.
	 */
	public void reserveFish() {
		if( numAvailableSpecimens == 0)
			throw new IllegalStateException("Cannot reserve; no specimens of this species are available.");
		numAvailableSpecimens--;
	}

	/*
	 * Mark one of the reserved specimens of this fish as available again.
	 * If none of the specimens of this fish have been reserved, this method
	 * should throw an IllegalStateException with an appropriate error message.
	 */
	public void cancelReservation() {
		if( numAvailableSpecimens == totalNumSpecimens)
			throw new IllegalStateException("Cannot unreserve; no specimens are marked as reserved.");
		numAvailableSpecimens++;
	}
}

