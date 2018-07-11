package codingchallenges;

public class MixStrings {
	String a;
	String b;
//	Given two strings, a and b, create a bigger string made of the first char of a, 
//	the first char of b, the second char of a, the second char of b, and so on. 
//	Any leftover chars go at the end of the result.
//
//
//	mixString("abc", "xyz") → "axbycz"
//	mixString("Hi", "There") → "HTihere"
//	mixString("xxxx", "There") → "xTxhxexre"
	public String mixString(String a, String b) {
		String newStr = "";
		for (int i = 0; i < Math.max(a.length(), b.length()); i++) {
		  if(i <= a.length()-1) {
			  newStr += a.substring(i,i+1);
		  }
		  if(i <= b.length()-1) {
			  newStr += b.substring(i,i+1);
		  }
		}
		return newStr;
	}

	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public MixStrings(String a, String b) {
		super();
		this.a = a;
		this.b = b;
	}
	public MixStrings() {}
	
}
