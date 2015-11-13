package exceptions;

public class NonSquareMatrixException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6910534794676270934L;
	public NonSquareMatrixException() {
	}
	public NonSquareMatrixException(String message) {
		super(message);
	}
	public NonSquareMatrixException(Throwable cause) {
		super(cause);
	}
	public NonSquareMatrixException(String message, Throwable cause) {
		super(message, cause);
	}
}
