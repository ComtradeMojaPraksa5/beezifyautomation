package ids;

/**
 * @author Tarik
 *	This enum class is used to store all the identifiers needed in 'Common' class
 *	NOTE: 
 *		All the variables containing "TIMEOUT" are presented in seconds
 */
public enum CommonIDs {
	
	// Represents 'wait time' to check element presence
	TIMEOUT_PRESENCE(10),
	// Represents 'wait time' to check whether element is visible
	TIMEOUT_VISIBLE(10);
	
	private final int intID;
	
	private CommonIDs(int id){
		intID = id;
	}
	
	public final int get(){
		return intID;
	}
}
