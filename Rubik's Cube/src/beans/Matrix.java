package beans;

import exceptions.*;

public class Matrix {
	protected char[][] matrix;

	protected void matrixChecks(char[][] matrixToCheck) throws DifferentSizeRowsException, NotAllowedValueException, WrongSizeMatrixException {
		for (char[] a : matrixToCheck) {
			//Check that all the raws have the same length.
			//+All the rows are tested against the first one
			//+(since all should have the same length).
			if (a.length != matrixToCheck[0].length) {
				throw new DifferentSizeRowsException("All rows should have the same length.");
			}
		}
	}
	public char[][] getMatrix() {
		//unrelatedMatrix is used in order not to return the reference.
		char[][] unrelatedMatrix = {{matrix[0][0], matrix[0][1], matrix[0][2]},
				{matrix[1][0], matrix[1][1], matrix[1][2]}, {matrix[2][0], matrix[2][1], matrix[2][2]}};
		return unrelatedMatrix;
	}
	public void setMatrix(char[][] matrix) throws DifferentSizeRowsException, NotAllowedValueException, WrongSizeMatrixException {
		//Check input values for errors.
		matrixChecks(matrix);
		this.matrix = matrix;
	}
	
	public char[] getColumn(int colNum) {
		char[] column;
		//Columns size is the number of arrays inside matrix
		column = new char[matrix.length];
		for(int j=0;j<matrix.length;j++) {
			column[j] = matrix[j][colNum];
		}
		return column;
	}
	//Method that return the inverse of a column. 
	public char[] getColumnInverse(int colNum) {
		char[] columnToInvert = getColumn(colNum);
		char tmp;
		for (int i=0; i<columnToInvert.length * 0.5; i++) {
			tmp = columnToInvert[columnToInvert.length - i -1];
			columnToInvert[columnToInvert.length - i - 1] = columnToInvert[i];
			columnToInvert[i] = tmp;
		}
		return columnToInvert;
	}
	public char[] getRow(int rowNum) {
		//row is created in a way that does NOT return a reference with "matrix".
		char[] row = {matrix[rowNum][0], matrix[rowNum][1], matrix[rowNum][2]};
		return row;
	}
	public char[][] getColumns() {
		char[][] columns;
		columns = new char[matrix[0].length][matrix.length];
		for (int i=0; i<matrix[0].length; i++) {
			columns[i] = getColumn(i);
		}
		return columns;
	}
	/*
	public void switchRowsAndColumns() throws NonSquareMatrixException {
		if (matrix.length != matrix[0].length) {
			throw new NonSquareMatrixException("The matrix is not square: " +
		matrix.length + "x" + matrix[0].length);
		}
		//Running getColumns() the class variable is initialized.
		getColumns();
		matrix = this.columns;
	}
	*/
	
}
