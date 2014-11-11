import java.util.ArrayList;

/*
 * Name: Megan Jevin
 * Student number: C1338318
 */
	
/*
 * A class to represent an Aquarium.
 * An aquarium can either have unlimited fish specimens or limited fish specimens.
 * For limited capacity aquariums, reserved fish still count towards the 
 * capacity.
 */
public class Aquarium {
	    private String species;
		private String name;
		private int totalNumSpecimens;
		private int numAvailableSpecimens;
		ArrayList<Fish> stringList = new ArrayList<Fish>();
		// Define fields here
		// to be completed
    
    /*
     * Construct an Aquarium with unlimited capacity.
     */ 
    public Aquarium() {
		// to be completed	
    	stringList = null;
    }

    /*
     * Construct an Aquarium with limited capacity.
     */ 
    public Aquarium( int inCapacity ) {
        // to be completed
    	int capacity = inCapacity;
    	inCapacity = 100;
    	int tankCapacity = totalNumSpecimens - numAvailableSpecimens;
    	ArrayList<Fish> stringList = new ArrayList<Fish>();
    	
    }
    
    public String addFish(String species, String name, int totalNumSpecimens) {
    	stringList.add(species, name, totalNumSpecimens);
    	int tankCapacity = totalNumSpecimens - numAvailableSpecimens;
    	if (tankCapacity >= 100)
    	{
    		stringList.add();
    	}
    	else
    	{
    		!stringList.add();
    	}
    }

	public int numberAvailableFishes() {
		int totalNumSpecimens = stringList.size();
		if (totalNumSpecimens <= 0) 
		{
			throw new IllegalArgumentException( "Number of specimens must be >= 1" );
		}
		else
		{
			return totalNumSpecimens;
		}

	}

	public String getFishWithName(String string) {
		return name;

	}

	public char[] hasFishWithName(String string) {

	}

	public void sellFish( String species, int totalNumSpecimens) {
		
	}
	
	public void reserveFish() {
		
	}
	
	public void cancelReservation() {
		
	}
    // Add methods here
    // to be completed
}

