package codingchallenges;

public class FizzBuzz {
	
	public FizzBuzz() {}
	
	public void fizzBuzz() {
		for(int i = 1; i <= 100; i++) {
			if(i % 5 != 0 && i % 3 != 0) {
				System.out.println(i);
			}
			if(i % 3 == 0 && i % 5 != 0) {
				System.out.println("fizz");
			}
			if(i % 5 == 0 && i % 3 != 0) {
				System.out.println("buzz");
			}
			if(i % 5 == 0 && i % 3 == 0) {
				System.out.println("fizzBuzz");
			}
		}
	}
}
