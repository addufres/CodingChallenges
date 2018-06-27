package codingchallenges;

import java.util.Arrays;
import java.util.Collections;

public class StringReverse {
	private String s;

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public StringReverse(String s) {
		super();
		this.s = s;
	}
	
	public StringReverse() {}
	
	public void reverse(String s) {
		String[] strArr = s.split("");
		String output = "";
		Collections.reverse(Arrays.asList(strArr));
		for(String str : strArr) {
			output += str;
		}
		System.out.println(output);
	}
}
