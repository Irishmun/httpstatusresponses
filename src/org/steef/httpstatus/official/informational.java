package org.steef.httpstatus.official;

/**
 * An informational response indicates that the request was received and understood.
 * <br>
 * It is issued on a provisional basis while request processing continues.
 * It alerts the client to wait for a final response.
 * The message consists only of the status line and optional header fields, and is terminated by an empty line.
 * As the HTTP/1.0 standard did not define any 1xx status codes,
 * servers must not send a 1xx response to an HTTP/1.0 compliant client except under experimental conditions.
 */
//Description of each status is retrieved form https://developer.mozilla.org/en-US/docs/Web/HTTP/Status
public class informational
{
    /**
     * This interim response indicates that everything so far is OK and that the client should continue the request,
     * or ignore the response if the request is already finished.
     */
    public static final int CONTINUE = 100;
    /**
     * This code is sent in response to an <Code>UPGRADE</Code> request header from the client,
     * and indicates the protocol the server is switching to.
     */
    public static final int SWITCHING_PROTOCOLS = 101;
    /**
     * This code indicates that the server has received and is processing the request, but no response is available yet.
     * (WebDAV)
     */
    public static final int PROCESSING = 102;
    /**
     * This status code is primarily intended to be used with the Link header,
     * letting the user agent start preloading resources while the server prepares a response.
     */
    public static final int EARLY_HINTS = 103;
}
