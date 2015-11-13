package exceptions;

public class DifferentSizeRowsException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4756874394977966072L;
	public DifferentSizeRowsException() {
	}
	public DifferentSizeRowsException(String message) {
		super(message);
	}
	public DifferentSizeRowsException(Throwable cause) {
		super(cause);
	}
	public DifferentSizeRowsException(String message, Throwable cause) {
		super(message, cause);
	}
}
