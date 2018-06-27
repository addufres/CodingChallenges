package codingchallenges;

public class SwapValues {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public SwapValues(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public SwapValues() {}

	public void swapValues(int x, int y) {
		System.out.println("The value of X before swap is: " + x);
		System.out.println("The value of Y before swap is: " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("The value of X after swap is: " + x);
		System.out.println("The value of Y after swap is: " + y);
	}

}
