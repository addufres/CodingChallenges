package codingchallenges;
/*
Imagine a white rectangular grid of n rows and m columns divided into two parts by a diagonal line running from the upper left to the lower right corner. Now let's paint the grid in two colors according to the following rules:
A cell is painted black if it has at least one point in common with the diagonal;
Otherwise, a cell is painted white.
Count the number of cells painted black.
 */
public class CountBlackCells {
	private int rows;
	private int cols;
	
	public CountBlackCells() {}
	public CountBlackCells(int rows, int cols) {
		super();
		this.rows = rows;
		this.cols = cols;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getCols() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}

	public void countCells(int rows, int cols) {
	    System.out.println(rows + cols + GCD(rows, cols) - 2);
	}

	public int GCD(int a, int b) { return b == 0 ? a : GCD(b, a % b); }
}
