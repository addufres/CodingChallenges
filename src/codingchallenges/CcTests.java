package codingchallenges;


public class CcTests {
	// FIELDS
	private static SwapValues sv = new SwapValues();
	private static FizzBuzz fb = new FizzBuzz();
	private static StringReverse sr = new StringReverse();
	private static IsUnique iu = new IsUnique();
	public static void main(String[] args) {
		sv.swapValues(3,5);
		fb.fizzBuzz();
     	iu.getUnique("23456378"); // false
  		iu.getUnique("abcdefghij2345"); // true
		sr.reverse("hello");
		
	}
	
}
