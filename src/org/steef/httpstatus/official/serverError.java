package org.steef.httpstatus.official;

/**
 * The server failed to fulfill a request.
 * <br>
 * Response status codes beginning with the digit "5" indicate cases in which
 * the server is aware that it has encountered an error or is otherwise incapable of performing the request.
 * Except when responding to a HEAD request, the server should include an entity
 * containing an explanation of the error situation, and indicate whether it is a temporary or permanent condition.
 * Likewise, user agents should display any included entity to the user.
 * These response codes are applicable to any request method.
 */
//Description of each status is retrieved form https://developer.mozilla.org/en-US/docs/Web/HTTP/Status
public class serverError
{
    /**
     * The server has encountered a situation it doesn't know how to handle.
     */
    public static final int INTERNAL_SERVER_ERROR = 500;
    /**
     * The request method is not supported by the server and cannot be handled.
     * The only methods that servers are required to support
     * (and therefore that must not return this code) are GET and HEAD.
     */
    public static final int NOT_IMPLEMENTED = 501;
    /**
     * This error response means that the server,
     * while working as a gateway to get a response needed to handle the request,
     * got an invalid response.
     */
    public static final int BAD_GATEWAY = 502;
    /**
     * The server is not ready to handle the request. Common causes are a server that is down for maintenance or that is overloaded.
     * Note that together with this response, a user-friendly page explaining the problem should be sent.
     * This responses should be used for temporary conditions and the Retry-After: HTTP header should, if possible,
     * contain the estimated time before the recovery of the service.
     * The webmaster must also take care about the caching-related headers that are sent along with this response,
     * as these temporary condition responses should usually not be cached.
     */
    public static final int SERVICE_UNAVAILABLE = 503;
    /**
     * This error response is given when the server is acting as a gateway and cannot get a response in time.
     */
    public static final int GATEWAY_TIMEOUT = 504;
    /**
     * The HTTP version used in the request is not supported by the server.
     */
    public static final int HTTP_VERSION_NOT_SUPPORTED = 505;
    /**
     * The server has an internal configuration error:
     * the chosen variant resource is configured to engage in transparent content negotiation itself,
     * and is therefore not a proper end point in the negotiation process.
     */
    public static final int VARIANT_ALSO_NEGOTIATES = 506;
    /**
     * The method could not be performed on the resource because
     * the server is unable to store the representation needed
     * to successfully complete the request.
     * (WebDAV)
     */
    public static final int INSUFFICIENT_STORAGE = 507;
    /**
     * The server detected an infinite loop while processing the request.
     * (WebDAV)
     */
    public static final int LOOP_DETECTED = 508;
    /**
     * Further extensions to the request are required for the server to fulfil it.
     */
    public static final int NOT_EXTENDED = 510;
    /**
     * The 511 status code indicates that the client needs to authenticate to gain network access.
     */
    public static final int NETWORK_AUTHENTICATION_REQUIRED = 511;
}
