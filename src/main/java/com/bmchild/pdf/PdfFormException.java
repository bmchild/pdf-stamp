package com.bmchild.pdf;

/**
 * @author bchild
 *
 */
@SuppressWarnings("serial")
public class PdfFormException extends Exception {

	/**
	 * 
	 */
	public PdfFormException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public PdfFormException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public PdfFormException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public PdfFormException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public PdfFormException(Throwable cause) {
		super(cause);
	}

}
