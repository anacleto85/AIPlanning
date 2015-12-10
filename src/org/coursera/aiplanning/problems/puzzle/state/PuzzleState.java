package org.coursera.aiplanning.problems.puzzle.state;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class PuzzleState 
{
	private int matrix_size;
	private int[][] matrix;
	private int emptyCellRow;
	private int emptyCellColumn;
	
	/**
	 * 
	 * @param matrix
	 * @param msize
	 * @param row
	 * @param column
	 */
	public PuzzleState(int[][] matrix, int msize, int row, int column) {
		this.matrix = matrix;
		this.matrix_size = msize;
		this.emptyCellRow = row;
		this.emptyCellColumn = column;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getMatrixSize() {
		return this.matrix_size;
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public int getElementAt(int row, int column) {
		return this.matrix[row][column];
	}
	
	/**
	 * 
	 * @return
	 */
	public int getEmptyCellRow() {
		return this.emptyCellRow;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getEmptyCellColumn() {
		return this.emptyCellColumn;
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		String str = "---------------------------------------------\n";
		for (int i = 0; i < this.matrix_size; i++) {
			for (int j = 0; j < this.matrix_size; j++) {
				str += "\t"+this.matrix[i][j];
			}
			str += "\n";
		}
		str += "---------------------------------------------\n";
		return str;
	}
}
