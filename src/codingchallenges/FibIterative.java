package codingchallenges;

public class FibIterative {
//	Fibonacci(iterative)
//	Print the first 20 numbers of the fibonacci sequence.
	private int dblPrev = 0;
	private int prev = 1;
	private int current = 0;
	public int getDblPrev() {
		return dblPrev;
	}
	public void setDblPrev(int dblPrev) {
		this.dblPrev = dblPrev;
	}
	public int getPrev() {
		return prev;
	}
	public void setPrev(int prev) {
		this.prev = prev;
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public FibIterative(int dblPrev, int prev, int current) {
		super();
		this.dblPrev = dblPrev;
		this.prev = prev;
		this.current = current;
	}
	public FibIterative() {}
	public void fibIt() {
		for (int i = 2; i <= 21; i++)
	    {
	        current = prev + dblPrev;
	        dblPrev = prev;
	        prev = current;
	        System.out.println(current);
	    }
	}
}
