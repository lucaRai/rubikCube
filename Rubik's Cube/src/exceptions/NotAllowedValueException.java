package exceptions;

public class NotAllowedValueException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2300285965538181450L;

	public NotAllowedValueException() {
	}
	public NotAllowedValueException(String message) {
		super(message);
	}
	public NotAllowedValueException(Throwable cause) {
		super(cause);
	}
	public NotAllowedValueException(String message, Throwable cause) {
		super(message, cause);
	}
}
