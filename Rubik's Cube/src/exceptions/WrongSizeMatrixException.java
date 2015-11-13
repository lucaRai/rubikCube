package exceptions;

public class WrongSizeMatrixException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1174682531440710465L;
	public WrongSizeMatrixException() {
	}
	public WrongSizeMatrixException(String message) {
		super(message);
	}
	public WrongSizeMatrixException(Throwable cause) {
		super(cause);
	}
	public WrongSizeMatrixException(String message, Throwable cause) {
		super(message, cause);
	}
}
