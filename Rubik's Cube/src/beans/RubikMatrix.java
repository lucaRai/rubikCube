package beans;

import exceptions.*;

public class RubikMatrix extends Matrix {
	
	private final char[] allowedChar = {'W', 'B', 'R', 'G', 'Y', 'O'};
	
	@Override
	protected void matrixChecks(char[][] matrixToCheck) throws NotAllowedValueException, WrongSizeMatrixException {
		if (matrixToCheck.length != 3) {
			throw new WrongSizeMatrixException("Each face should have size 3x3.");
		}
		for (char[] a : matrixToCheck) {
			//Check that all the raws have three elements
			if (a.length != 3) {
				throw new WrongSizeMatrixException("Each face should have size 3x3.");
			}
			//Check that the matrix contains only allowed characters.
			for (char c : a) {
				//The following case should never be verified due to the method
				//+Matrix.toUpperCase called in setMatrix
				assert c == Character.toUpperCase(c): "Method: Matrix.toUpperCase seems NOT to work.";
				if (new String(allowedChar).indexOf(c) == -1) {
					throw new NotAllowedValueException("Not allowed character: " + c);
				}
			}
		}
	}
	private void toUpperCase(char[][] matrixToEdit) {
		for (int i=0; i<matrixToEdit.length; i++) {
			for (int j=0; j<matrixToEdit[i].length; j++) {
				matrixToEdit[i][j] = Character.toUpperCase(matrixToEdit[i][j]);
			}
		}
	}
	@Override
	public void setMatrix(char[][] matrix) throws DifferentSizeRowsException, NotAllowedValueException, WrongSizeMatrixException {
		//Change to upper case every input character.
		toUpperCase(matrix);
		//Check input values for errors.
		matrixChecks(matrix);
		this.matrix = matrix;
	}
}
