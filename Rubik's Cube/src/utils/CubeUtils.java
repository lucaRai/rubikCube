package utils;

import beans.Cube;
import beans.RubikMatrix;
import exceptions.DifferentSizeRowsException;
import exceptions.NonSquareMatrixException;
import exceptions.NotAllowedValueException;
import exceptions.WrongSizeMatrixException;

public class CubeUtils {
	public static void movementR(Cube cube) throws DifferentSizeRowsException, NotAllowedValueException, WrongSizeMatrixException, NonSquareMatrixException {
		RubikMatrix frontFace = cube.getFrontFace();
		RubikMatrix rightFace = cube.getRightFace();
		RubikMatrix upFace = cube.getUpFace();
		RubikMatrix backFace = cube.getBackFace();
		RubikMatrix downFace = cube.getDownFace();
		
		//Temporary matrices
		RubikMatrix tmpFrontFace = new RubikMatrix();
		tmpFrontFace.setMatrix(frontFace.getMatrix());
		RubikMatrix tmpUpFace = new RubikMatrix();
		tmpUpFace.setMatrix(upFace.getMatrix());
		RubikMatrix tmpBackFace = new RubikMatrix();
		tmpBackFace.setMatrix(backFace.getMatrix());
		RubikMatrix tmpDownFace = new RubikMatrix();
		tmpDownFace.setMatrix(downFace.getMatrix());
		
		//Column switch
		//Watch out that first column has index 0, the second 1 and the third 2
		columnSwitcher(frontFace, tmpUpFace, 2);
		columnSwitcher(upFace, tmpBackFace, 2);
		columnSwitcher(backFace, tmpDownFace, 2);
		columnSwitcher(downFace, tmpFrontFace, 2);
		
		//Copy temporary matrices back into original ones.
		frontFace.setMatrix(tmpFrontFace.getMatrix());
		upFace.setMatrix(tmpUpFace.getMatrix());
		backFace.setMatrix(tmpBackFace.getMatrix());
		downFace.setMatrix(tmpDownFace.getMatrix());
		
		turnFaceClockWise(rightFace);
	}
	public static void movementRi(Cube cube) throws DifferentSizeRowsException, NotAllowedValueException, WrongSizeMatrixException, NonSquareMatrixException {
		RubikMatrix frontFace = cube.getFrontFace();
		RubikMatrix rightFace = cube.getRightFace();
		RubikMatrix upFace = cube.getUpFace();
		RubikMatrix backFace = cube.getBackFace();
		RubikMatrix downFace = cube.getDownFace();
		
		//Temporary matrices
		RubikMatrix tmpFrontFace = new RubikMatrix();
		tmpFrontFace.setMatrix(frontFace.getMatrix());
		RubikMatrix tmpUpFace = new RubikMatrix();
		tmpUpFace.setMatrix(upFace.getMatrix());
		RubikMatrix tmpBackFace = new RubikMatrix();
		tmpBackFace.setMatrix(backFace.getMatrix());
		RubikMatrix tmpDownFace = new RubikMatrix();
		tmpDownFace.setMatrix(downFace.getMatrix());
		
		//Column switch
		//Watch out that first column has index 0, the second 1 and the third 2
		columnSwitcher(frontFace, tmpDownFace, 2);
		columnSwitcher(downFace, tmpBackFace, 2);
		columnSwitcher(backFace, tmpUpFace, 2);
		columnSwitcher(upFace, tmpFrontFace, 2);
		
		//Copy temporary matrices back into original ones.
		frontFace.setMatrix(tmpFrontFace.getMatrix());
		upFace.setMatrix(tmpUpFace.getMatrix());
		backFace.setMatrix(tmpBackFace.getMatrix());
		downFace.setMatrix(tmpDownFace.getMatrix());
		
		turnFaceAntiClockWise(rightFace);
	}
	public static void movementL(Cube cube) throws DifferentSizeRowsException, NotAllowedValueException, WrongSizeMatrixException, NonSquareMatrixException {
		RubikMatrix frontFace = cube.getFrontFace();
		RubikMatrix leftFace = cube.getLeftFace();
		RubikMatrix upFace = cube.getUpFace();
		RubikMatrix backFace = cube.getBackFace();
		RubikMatrix downFace = cube.getDownFace();
		
		//Temporary matrices
		RubikMatrix tmpFrontFace = new RubikMatrix();
		tmpFrontFace.setMatrix(frontFace.getMatrix());
		RubikMatrix tmpUpFace = new RubikMatrix();
		tmpUpFace.setMatrix(upFace.getMatrix());
		RubikMatrix tmpBackFace = new RubikMatrix();
		tmpBackFace.setMatrix(backFace.getMatrix());
		RubikMatrix tmpDownFace = new RubikMatrix();
		tmpDownFace.setMatrix(downFace.getMatrix());
		
		//Column switch
		//Watch out that first column has index 0, the second 1 and the third 2
		columnSwitcher(frontFace, tmpDownFace, 0);
		columnSwitcher(downFace, tmpBackFace, 0);
		columnSwitcher(backFace, tmpUpFace, 0);
		columnSwitcher(upFace, tmpFrontFace, 0);
		
		//Copy temporary matrices back into original ones.
		frontFace.setMatrix(tmpFrontFace.getMatrix());
		upFace.setMatrix(tmpUpFace.getMatrix());
		backFace.setMatrix(tmpBackFace.getMatrix());
		downFace.setMatrix(tmpDownFace.getMatrix());
		
		turnFaceClockWise(leftFace);
	}
	public static void movementLi(Cube cube) throws DifferentSizeRowsException, NotAllowedValueException, WrongSizeMatrixException, NonSquareMatrixException {
		RubikMatrix frontFace = cube.getFrontFace();
		RubikMatrix leftFace = cube.getLeftFace();
		RubikMatrix upFace = cube.getUpFace();
		RubikMatrix backFace = cube.getBackFace();
		RubikMatrix downFace = cube.getDownFace();
		
		//Temporary matrices
		RubikMatrix tmpFrontFace = new RubikMatrix();
		tmpFrontFace.setMatrix(frontFace.getMatrix());
		RubikMatrix tmpUpFace = new RubikMatrix();
		tmpUpFace.setMatrix(upFace.getMatrix());
		RubikMatrix tmpBackFace = new RubikMatrix();
		tmpBackFace.setMatrix(backFace.getMatrix());
		RubikMatrix tmpDownFace = new RubikMatrix();
		tmpDownFace.setMatrix(downFace.getMatrix());
		
		//Column switch
		//Watch out that first column has index 0, the second 1 and the third 2
		columnSwitcher(frontFace, tmpUpFace, 0);
		columnSwitcher(upFace, tmpBackFace, 0);
		columnSwitcher(backFace, tmpDownFace, 0);
		columnSwitcher(downFace, tmpFrontFace, 0);
		
		//Copy temporary matrices back into original ones.
		frontFace.setMatrix(tmpFrontFace.getMatrix());
		upFace.setMatrix(tmpUpFace.getMatrix());
		backFace.setMatrix(tmpBackFace.getMatrix());
		downFace.setMatrix(tmpDownFace.getMatrix());
		
		turnFaceAntiClockWise(leftFace);
	}
	public static void movementB(Cube cube) throws DifferentSizeRowsException, NotAllowedValueException, WrongSizeMatrixException, NonSquareMatrixException {
		RubikMatrix backFace = cube.getBackFace();
		RubikMatrix rightFace = cube.getRightFace();
		RubikMatrix upFace = cube.getUpFace();
		RubikMatrix leftFace = cube.getLeftFace();
		RubikMatrix downFace = cube.getDownFace();
		
		//Temporary matrices
		RubikMatrix tmpLeftFace = new RubikMatrix();
		tmpLeftFace.setMatrix(leftFace.getMatrix());
		RubikMatrix tmpUpFace = new RubikMatrix();
		tmpUpFace.setMatrix(upFace.getMatrix());
		RubikMatrix tmpRightFace = new RubikMatrix();
		tmpRightFace.setMatrix(rightFace.getMatrix());
		RubikMatrix tmpDownFace = new RubikMatrix();
		tmpDownFace.setMatrix(downFace.getMatrix());
		
		//Column switch
		//Watch out that first column has index 0, the second 1 and the third 2
		columnRowSwitcher(leftFace, tmpDownFace, 0, 2);
		rowColumnSwitcher(downFace, tmpRightFace, 2);
		columnRowSwitcher(rightFace, tmpUpFace, 2, 0);
		rowColumnSwitcher(upFace, tmpLeftFace, 0);
		
		//Copy temporary matrices back into original ones.
		leftFace.setMatrix(tmpLeftFace.getMatrix());
		upFace.setMatrix(tmpUpFace.getMatrix());
		rightFace.setMatrix(tmpRightFace.getMatrix());
		downFace.setMatrix(tmpDownFace.getMatrix());
		
		turnFaceClockWise(backFace);
	}
	public static void movementBi(Cube cube) throws DifferentSizeRowsException, NotAllowedValueException, WrongSizeMatrixException, NonSquareMatrixException {
		RubikMatrix backFace = cube.getBackFace();
		RubikMatrix rightFace = cube.getRightFace();
		RubikMatrix upFace = cube.getUpFace();
		RubikMatrix leftFace = cube.getLeftFace();
		RubikMatrix downFace = cube.getDownFace();
		
		//Temporary matrices
		RubikMatrix tmpLeftFace = new RubikMatrix();
		tmpLeftFace.setMatrix(leftFace.getMatrix());
		RubikMatrix tmpUpFace = new RubikMatrix();
		tmpUpFace.setMatrix(upFace.getMatrix());
		RubikMatrix tmpRightFace = new RubikMatrix();
		tmpRightFace.setMatrix(rightFace.getMatrix());
		RubikMatrix tmpDownFace = new RubikMatrix();
		tmpDownFace.setMatrix(downFace.getMatrix());
		
		//Column switch
		//Watch out that first column has index 0, the second 1 and the third 2
		columnRowSwitcher(leftFace, tmpUpFace, 0);
		rowColumnSwitcher(upFace, tmpRightFace, 0, 2);
		columnRowSwitcher(rightFace, tmpDownFace, 2);
		rowColumnSwitcher(downFace, tmpLeftFace, 2, 0);
		
		//Copy temporary matrices back into original ones.
		leftFace.setMatrix(tmpLeftFace.getMatrix());
		upFace.setMatrix(tmpUpFace.getMatrix());
		rightFace.setMatrix(tmpRightFace.getMatrix());
		downFace.setMatrix(tmpDownFace.getMatrix());
		
		turnFaceClockWise(backFace);
	}
	public static void movementD(Cube cube) throws DifferentSizeRowsException, NotAllowedValueException, WrongSizeMatrixException, NonSquareMatrixException {
		RubikMatrix frontFace = cube.getFrontFace();
		RubikMatrix rightFace = cube.getRightFace();
		RubikMatrix downFace = cube.getDownFace();
		RubikMatrix leftFace = cube.getLeftFace();
		RubikMatrix backFace = cube.getBackFace();
		
		//Temporary matrices
		RubikMatrix tmpFrontFace = new RubikMatrix();
		tmpFrontFace.setMatrix(frontFace.getMatrix());
		RubikMatrix tmpLeftFace = new RubikMatrix();
		tmpLeftFace.setMatrix(leftFace.getMatrix());
		RubikMatrix tmpRightFace = new RubikMatrix();
		tmpRightFace.setMatrix(rightFace.getMatrix());
		RubikMatrix tmpBackFace = new RubikMatrix();
		tmpBackFace.setMatrix(backFace.getMatrix());
		
		//Column switch
		//Watch out that first column has index 0, the second 1 and the third 2
		rowSwitcher(frontFace, tmpRightFace, 2);
		rowSwitcher(rightFace, tmpBackFace, 2);
		rowSwitcher(backFace, tmpLeftFace, 2);
		rowSwitcher(leftFace, tmpFrontFace, 2);
		
		//Copy temporary matrices back into original ones.
		leftFace.setMatrix(tmpLeftFace.getMatrix());
		frontFace.setMatrix(tmpFrontFace.getMatrix());
		rightFace.setMatrix(tmpRightFace.getMatrix());
		backFace.setMatrix(tmpBackFace.getMatrix());
		
		turnFaceAntiClockWise(downFace);
	}
	public static void movementDi(Cube cube) throws DifferentSizeRowsException, NotAllowedValueException, WrongSizeMatrixException, NonSquareMatrixException {
		RubikMatrix frontFace = cube.getFrontFace();
		RubikMatrix rightFace = cube.getRightFace();
		RubikMatrix downFace = cube.getDownFace();
		RubikMatrix leftFace = cube.getLeftFace();
		RubikMatrix backFace = cube.getBackFace();
		
		//Temporary matrices
		RubikMatrix tmpFrontFace = new RubikMatrix();
		tmpFrontFace.setMatrix(frontFace.getMatrix());
		RubikMatrix tmpLeftFace = new RubikMatrix();
		tmpLeftFace.setMatrix(leftFace.getMatrix());
		RubikMatrix tmpRightFace = new RubikMatrix();
		tmpRightFace.setMatrix(rightFace.getMatrix());
		RubikMatrix tmpBackFace = new RubikMatrix();
		tmpBackFace.setMatrix(backFace.getMatrix());
		
		//Column switch
		//Watch out that first column has index 0, the second 1 and the third 2
		rowSwitcher(frontFace, tmpLeftFace, 2);
		rowSwitcher(leftFace, tmpBackFace, 2);
		rowSwitcher(backFace, tmpRightFace, 2);
		rowSwitcher(rightFace, tmpFrontFace, 2);
		
		//Copy temporary matrices back into original ones.
		leftFace.setMatrix(tmpLeftFace.getMatrix());
		frontFace.setMatrix(tmpFrontFace.getMatrix());
		rightFace.setMatrix(tmpRightFace.getMatrix());
		backFace.setMatrix(tmpBackFace.getMatrix());
		
		turnFaceAntiClockWise(downFace);
	}
	public static void movementF(Cube cube) throws DifferentSizeRowsException, NotAllowedValueException, WrongSizeMatrixException, NonSquareMatrixException {
		RubikMatrix frontFace = cube.getFrontFace();
		RubikMatrix rightFace = cube.getRightFace();
		RubikMatrix upFace = cube.getUpFace();
		RubikMatrix leftFace = cube.getLeftFace();
		RubikMatrix downFace = cube.getDownFace();
		
		//Temporary matrices
		RubikMatrix tmpLeftFace = new RubikMatrix();
		tmpLeftFace.setMatrix(leftFace.getMatrix());
		RubikMatrix tmpUpFace = new RubikMatrix();
		tmpUpFace.setMatrix(upFace.getMatrix());
		RubikMatrix tmpRightFace = new RubikMatrix();
		tmpRightFace.setMatrix(rightFace.getMatrix());
		RubikMatrix tmpDownFace = new RubikMatrix();
		tmpDownFace.setMatrix(downFace.getMatrix());
		
		//Column switch
		//Watch out that first column has index 0, the second 1 and the third 2
		columnRowSwitcher(leftFace, tmpUpFace, 2);
		rowColumnSwitcher(upFace, tmpRightFace, 2, 0);
		columnRowSwitcher(rightFace, tmpDownFace, 0);
		rowColumnSwitcher(downFace, tmpLeftFace, 0, 2);
		
		//Copy temporary matrices back into original ones.
		leftFace.setMatrix(tmpLeftFace.getMatrix());
		upFace.setMatrix(tmpUpFace.getMatrix());
		rightFace.setMatrix(tmpRightFace.getMatrix());
		downFace.setMatrix(tmpDownFace.getMatrix());
		
		turnFaceClockWise(frontFace);
	}
	public static void movementFi(Cube cube) throws DifferentSizeRowsException, NotAllowedValueException, WrongSizeMatrixException, NonSquareMatrixException {
		RubikMatrix frontFace = cube.getFrontFace();
		RubikMatrix rightFace = cube.getRightFace();
		RubikMatrix upFace = cube.getUpFace();
		RubikMatrix leftFace = cube.getLeftFace();
		RubikMatrix downFace = cube.getDownFace();
		
		//Temporary matrices
		RubikMatrix tmpLeftFace = new RubikMatrix();
		tmpLeftFace.setMatrix(leftFace.getMatrix());
		RubikMatrix tmpUpFace = new RubikMatrix();
		tmpUpFace.setMatrix(upFace.getMatrix());
		RubikMatrix tmpRightFace = new RubikMatrix();
		tmpRightFace.setMatrix(rightFace.getMatrix());
		RubikMatrix tmpDownFace = new RubikMatrix();
		tmpDownFace.setMatrix(downFace.getMatrix());
		
		//Column switch
		//Watch out that first column has index 0, the second 1 and the third 2
		columnRowSwitcher(leftFace, tmpDownFace, 2, 0);
		rowColumnSwitcher(downFace, tmpRightFace, 0);
		columnRowSwitcher(rightFace, tmpUpFace, 0, 2);
		rowColumnSwitcher(upFace, tmpLeftFace, 2);
		
		//Copy temporary matrices back into original ones.
		leftFace.setMatrix(tmpLeftFace.getMatrix());
		upFace.setMatrix(tmpUpFace.getMatrix());
		rightFace.setMatrix(tmpRightFace.getMatrix());
		downFace.setMatrix(tmpDownFace.getMatrix());
		
		turnFaceClockWise(frontFace);
	}
	public static void movementU(Cube cube) throws DifferentSizeRowsException, NotAllowedValueException, WrongSizeMatrixException, NonSquareMatrixException {
		RubikMatrix frontFace = cube.getFrontFace();
		RubikMatrix rightFace = cube.getRightFace();
		RubikMatrix upFace = cube.getUpFace();
		RubikMatrix leftFace = cube.getLeftFace();
		RubikMatrix backFace = cube.getBackFace();
		
		//Temporary matrices
		RubikMatrix tmpFrontFace = new RubikMatrix();
		tmpFrontFace.setMatrix(frontFace.getMatrix());
		RubikMatrix tmpLeftFace = new RubikMatrix();
		tmpLeftFace.setMatrix(leftFace.getMatrix());
		RubikMatrix tmpRightFace = new RubikMatrix();
		tmpRightFace.setMatrix(rightFace.getMatrix());
		RubikMatrix tmpBackFace = new RubikMatrix();
		tmpBackFace.setMatrix(backFace.getMatrix());
		
		//Column switch
		//Watch out that first column has index 0, the second 1 and the third 2
		rowSwitcher(frontFace, tmpLeftFace, 0);
		rowSwitcher(leftFace, tmpBackFace, 0);
		rowSwitcher(backFace, tmpRightFace, 0);
		rowSwitcher(rightFace, tmpFrontFace, 0);
		
		//Copy temporary matrices back into original ones.
		leftFace.setMatrix(tmpLeftFace.getMatrix());
		frontFace.setMatrix(tmpFrontFace.getMatrix());
		rightFace.setMatrix(tmpRightFace.getMatrix());
		backFace.setMatrix(tmpBackFace.getMatrix());
		
		turnFaceClockWise(upFace);
	}
	public static void movementUi(Cube cube) throws DifferentSizeRowsException, NotAllowedValueException, WrongSizeMatrixException, NonSquareMatrixException {
		RubikMatrix frontFace = cube.getFrontFace();
		RubikMatrix rightFace = cube.getRightFace();
		RubikMatrix upFace = cube.getUpFace();
		RubikMatrix leftFace = cube.getLeftFace();
		RubikMatrix backFace = cube.getBackFace();
		
		//Temporary matrices
		RubikMatrix tmpFrontFace = new RubikMatrix();
		tmpFrontFace.setMatrix(frontFace.getMatrix());
		RubikMatrix tmpLeftFace = new RubikMatrix();
		tmpLeftFace.setMatrix(leftFace.getMatrix());
		RubikMatrix tmpRightFace = new RubikMatrix();
		tmpRightFace.setMatrix(rightFace.getMatrix());
		RubikMatrix tmpBackFace = new RubikMatrix();
		tmpBackFace.setMatrix(backFace.getMatrix());
		
		//Column switch
		//Watch out that first column has index 0, the second 1 and the third 2
		rowSwitcher(frontFace, tmpRightFace, 0);
		rowSwitcher(rightFace, tmpBackFace, 0);
		rowSwitcher(backFace, tmpLeftFace, 0);
		rowSwitcher(leftFace, tmpFrontFace, 0);
		
		//Copy temporary matrices back into original ones.
		leftFace.setMatrix(tmpLeftFace.getMatrix());
		frontFace.setMatrix(tmpFrontFace.getMatrix());
		rightFace.setMatrix(tmpRightFace.getMatrix());
		backFace.setMatrix(tmpBackFace.getMatrix());
		
		turnFaceAntiClockWise(upFace);
	}
	private static void turnFaceClockWise(RubikMatrix face) throws NonSquareMatrixException, DifferentSizeRowsException, NotAllowedValueException, WrongSizeMatrixException {
		char[] col1Inv = face.getColumnInverse(0);
		char[] col2Inv = face.getColumnInverse(1);
		char[] col3Inv = face.getColumnInverse(2);
		char[][] updatedFaceMatrix = {col1Inv, col2Inv, col3Inv};
		face.setMatrix(updatedFaceMatrix);
	}
	private static void turnFaceAntiClockWise(RubikMatrix face) throws NonSquareMatrixException, DifferentSizeRowsException, NotAllowedValueException, WrongSizeMatrixException {
		char[] col1 = face.getColumn(0);
		char[] col2 = face.getColumn(1);
		char[] col3 = face.getColumn(2);
		//The first column is the last row, the second column is the second row
		//+and the last column is the first row
		char[][] updatedFaceMatrix = {col3, col2, col1};
		face.setMatrix(updatedFaceMatrix);
	}
	private static void columnSwitcher(RubikMatrix faceFrom, RubikMatrix faceTo, int columnNum) throws DifferentSizeRowsException, NotAllowedValueException, WrongSizeMatrixException {
		char[][] faceFromMatrix = faceFrom.getMatrix();
		char[][] faceToMatrix = faceTo.getMatrix();
		//Replace in the faceToMatrix the desired column with the one from faceFromMatrix.
		for (int i=0; i<3; i++) {
			faceToMatrix[i][columnNum] = faceFromMatrix[i][columnNum];
		}
		//Set the correct char[][] in faceTo.
		faceTo.setMatrix(faceToMatrix);
	}
	private static void rowSwitcher(RubikMatrix faceFrom, RubikMatrix faceTo, int rowColumn) throws DifferentSizeRowsException, NotAllowedValueException, WrongSizeMatrixException {
		char[][] faceToMatrix = {faceFrom.getMatrix()[0], faceTo.getMatrix()[1], faceTo.getMatrix()[2]};
		faceTo.setMatrix(faceToMatrix);
	}
	//Method to switch the nth column from "faceFrom" with the nth row from "faceTo".
	private static void columnRowSwitcher(RubikMatrix faceFrom, RubikMatrix faceTo, int columnRowNum) throws DifferentSizeRowsException, NotAllowedValueException, WrongSizeMatrixException {
		char[][] faceFromMatrix = faceFrom.getMatrix();
		char[][] faceToMatrix = faceTo.getMatrix();
		//Replace in the faceToMatrix the desired column with the one from faceFromMatrix.
		for (int i=0; i<3; i++) {
			faceToMatrix[columnRowNum][i] = faceFromMatrix[i][columnRowNum];
		}
		//Set the correct char[][] in faceTo.
		faceTo.setMatrix(faceToMatrix);
	}
	//Method to switch the "columnNum"-nth column from "faceFrom" with the "rowNum"-nth row from "faceTo".
	private static void columnRowSwitcher(RubikMatrix faceFrom, RubikMatrix faceTo, int columnNum, int rowNum) throws DifferentSizeRowsException, NotAllowedValueException, WrongSizeMatrixException {
		char[][] faceFromMatrix = faceFrom.getMatrix();
		char[][] faceToMatrix = faceTo.getMatrix();
		//Replace in the faceToMatrix the desired column with the one from faceFromMatrix.
		for (int i=0; i<3; i++) {
			faceToMatrix[rowNum][i] = faceFromMatrix[i][columnNum];
		}
		//Set the correct char[][] in faceTo.
		faceTo.setMatrix(faceToMatrix);
	}
	//Method to switch the nth row from "faceFrom" with the nth column from "faceTo".
	private static void rowColumnSwitcher(RubikMatrix faceFrom, RubikMatrix faceTo, int rowColumnNum) throws DifferentSizeRowsException, NotAllowedValueException, WrongSizeMatrixException {
		char[][] faceFromMatrix = faceFrom.getMatrix();
		char[][] faceToMatrix = faceTo.getMatrix();
		//Replace in the faceToMatrix the desired column with the one from faceFromMatrix.
		for (int i=0; i<3; i++) {
			faceToMatrix[i][rowColumnNum] = faceFromMatrix[rowColumnNum][i];
		}
		//Set the correct char[][] in faceTo.
		faceTo.setMatrix(faceToMatrix);
	}
	//Method to switch the nth row from "faceFrom" with the nth column from "faceTo".
	private static void rowColumnSwitcher(RubikMatrix faceFrom, RubikMatrix faceTo, int rowNum, int columnNum) throws DifferentSizeRowsException, NotAllowedValueException, WrongSizeMatrixException {
		char[][] faceFromMatrix = faceFrom.getMatrix();
		char[][] faceToMatrix = faceTo.getMatrix();
		//Replace in the faceToMatrix the desired column with the one from faceFromMatrix.
		for (int i=0; i<3; i++) {
			faceToMatrix[i][columnNum] = faceFromMatrix[rowNum][i];
		}
		//Set the correct char[][] in faceTo.
		faceTo.setMatrix(faceToMatrix);
	}
}
