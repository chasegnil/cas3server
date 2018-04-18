package com.github.chasegnil.cas3.exception;

import org.jasig.cas.ticket.TicketException;

public class NullImgVerifyCodeAuthenticationException extends TicketException {

    /** UID for serializable objects. */
    private static final long serialVersionUID = 3256719585087797044L;

    /**
     * Static instance of class to prevent cost incurred by creating new
     * instance.
     */
    public static final NullImgVerifyCodeAuthenticationException ERROR = new NullImgVerifyCodeAuthenticationException();

    /**
     * Default constructor that does not allow the chaining of exceptions and
     * uses the default code as the error code for this exception.
     */
    private static final String CODE = "required.imgverifycode";

    /**
     * Default constructor that does not allow the chaining of exceptions and
     * uses the default code as the error code for this exception.
     */
    public NullImgVerifyCodeAuthenticationException() {
        super(CODE);
    }

    /**
     * Constructor to allow for the chaining of exceptions. Constructor defaults
     * to default code.
     *
     * @param throwable the chainable exception.
     */
    public NullImgVerifyCodeAuthenticationException(final Throwable throwable) {
        super(CODE, throwable);
    }

    /**
     * Constructor method to allow for providing a custom code to associate with
     * this exception.
     *
     * @param code the code to use.
     */
    public NullImgVerifyCodeAuthenticationException(final String code) {
        super(code);
    }

    /**
     * Constructor to allow for the chaining of exceptions and use of a
     * non-default code.
     *
     * @param code the user-specified code.
     * @param throwable the chainable exception.
     */
    public NullImgVerifyCodeAuthenticationException(final String code, final Throwable throwable) {
        super(code, throwable);
    }

}
