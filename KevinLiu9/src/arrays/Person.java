package arrays;

public class Person {
	
	public static final String[] FIRST_START = {"Chr", "Am", "L", "D", "Th", "Kev", "Br", "B"};
	public static final String[] FIRST_MIDDLE = {"ala", "ima", "e", "o", "anna", "ola", "a", "i"};
	public static final String[] FIRST_END = {"na", "ck", "n", "rian", "lius", "lion"};
	
	public static final String[] LAST_START = {"Bl", "Gr", "Ph", "M", "Thr", "Sh", "Br", "L"};
	public static final String[] LAST_MIDDLE = {"an", "in", "ast", "own", "il", "ola", "a"};
	public static final String[] LAST_END = {"strom", "son", "rack", "les", "vin", "ston"};
	
	private String firstName;
	private String lastName;
	private Borough home;
	
	public Person(String first, String last, Borough home) {
		this.firstName = first;
		this.lastName = last;
		this.home = home;
	}
	
	public String toString() {
		return "My name is " + firstName + " " + lastName + " and I am from " + home + ".";
	}
}
