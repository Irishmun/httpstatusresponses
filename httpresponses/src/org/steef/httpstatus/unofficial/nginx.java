package org.steef.httpstatus.unofficial;

/**
 * The nginx web server software.
 */
public class nginx
{
    /**
     * Used internally to instruct the server to return no information to the client
     * and close the connection immediately.
     */
    public static final int NO_RESPONSE = 444;
    /**
     * Client sent too large request or too long header line.
     */
    public static final int REQUESTED_HEADER_TOO_LARGE = 494;
    /**
     * An expansion of the 400 Bad Request response code,
     * used when the client has provided an invalid client certificate.
     */
    public static final int SSL_CERTIFICATE_ERROR = 495;
    /**
     * An expansion of the 400 Bad Request response code,
     * used when a client certificate is required but not provided.
     */
    public static final int SSL_CERTIFICATE_REQUIRED = 496;
    /**
     * An expansion of the 400 Bad Request response code,
     * used when the client has made a HTTP request to a port listening for HTTPS requests.
     */
    public static final int HTTP_REQUEST_SENT_TO_HTTPS_PORT = 497;
    /**
     * Used when the client has closed the request before the server could send a response.
     */
    public static final int CLIENT_CLOSED_REQUEST = 499;
}
