package codingchallenges;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {
	private String s;

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public IsUnique(String s) {
		super();
		this.s = s;
	}
	
	public IsUnique() {}
	
	public void getUnique(String s) {
		// will need decider boolean set default to true just personal preference
		boolean isUnique = true;
		// create an empty hashSet of characters
		Set<Character> letters = new HashSet<>();
		// run for loop for length of string
		for (int i = 0; i < s.length(); i++) {
			// get the character at the index in the for loop
			char c = s.charAt(i);
			// if you cannot add it to the set i.e. its already in the string then set the bool to false and break the loop
			if(!letters.add(c)) {
				isUnique = false;
				break;
			}
		}
		System.out.println(isUnique);
	}
}
