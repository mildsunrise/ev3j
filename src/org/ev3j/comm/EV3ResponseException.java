package org.ev3j.comm;

/**
 * This exception is thrown when an error response is received
 * over a socket. Error responses can be caused by a variety of
 * reasons: malformed syntax, illegal operations or other abnormal
 * conditions when executing the command.
 * 
 * <p> Exceptions carry the decoded error payload that originated them.
 * It's safe to assume that, for all exceptions of this type thrown
 * by the library, {@code exception.getResponse().isErrorResponse() == true}.
 * 
 * @see EV3Socket
 * @see Payload#isErrorResponse()
 */
public class EV3ResponseException extends Exception {
  private final Payload response;

  /**
   * Construct a new exception.
   * 
   * @param response The causing error response
   */
  public EV3ResponseException(Payload response) {
    super("Received an error response.");
    this.response = response;
  }
  
  /**
   * Get the error response that caused this exception to be thrown.
   * 
   * @return The causing error response
   */
  public Payload getResponse() {
    return response;
  }
}
