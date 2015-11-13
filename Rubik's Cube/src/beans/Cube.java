package beans;

import exceptions.*;

public class Cube {
	
	RubikMatrix frontFace = new RubikMatrix();
	RubikMatrix rightFace = new RubikMatrix();
	RubikMatrix leftFace = new RubikMatrix();
	RubikMatrix upFace = new RubikMatrix();
	RubikMatrix downFace = new RubikMatrix();
	RubikMatrix backFace = new RubikMatrix();
	
	
	public RubikMatrix getFrontFace() {
		return frontFace;
	}
	public void setFrontFace(char[][] frontFace) {
		try {
			this.frontFace.setMatrix(frontFace);
		} catch (DifferentSizeRowsException | NotAllowedValueException | WrongSizeMatrixException e) {
			e.printStackTrace();
		}
	}
	public RubikMatrix getRightFace() {
		return rightFace;
	}
	public void setRightFace(char[][] rightFace) {
		try {
			this.rightFace.setMatrix(rightFace);
		} catch (DifferentSizeRowsException | NotAllowedValueException | WrongSizeMatrixException e) {
			e.printStackTrace();
		}
	}
	public RubikMatrix getLeftFace() {
		return leftFace;
	}
	public void setLeftFace(char[][] leftFace) {
		try {
			this.leftFace.setMatrix(leftFace);
		} catch (DifferentSizeRowsException | NotAllowedValueException | WrongSizeMatrixException e) {
			e.printStackTrace();
		}
	}
	public RubikMatrix getUpFace() {
		return upFace;
	}
	public void setUpFace(char[][] upFace) {
		try {
			this.upFace.setMatrix(upFace);
		} catch (DifferentSizeRowsException | NotAllowedValueException | WrongSizeMatrixException e) {
			e.printStackTrace();
		}
	}
	public RubikMatrix getDownFace() {
		return downFace;
	}
	public void setDownFace(char[][] downFace) {
		try {
			this.downFace.setMatrix(downFace);
		} catch (DifferentSizeRowsException | NotAllowedValueException | WrongSizeMatrixException e) {
			e.printStackTrace();
		}
	}
	public RubikMatrix getBackFace() {
		return backFace;
	}
	public void setBackFace(char[][] backFace) {
		try {
			this.backFace.setMatrix(backFace);
		} catch (DifferentSizeRowsException | NotAllowedValueException | WrongSizeMatrixException e) {
			e.printStackTrace();
		}
	}
}
