package org.steef.httpstatus.official;

/**
 *This class of status code indicates the client must take additional action to complete the request.
 * <br>
 * Many of these status codes are used in URL redirection.
 *<br>
 * A user agent may carry out the additional action with no user interaction only
 * if the method used in the second request is GET or HEAD. A user agent may automatically redirect a request.
 * A user agent should detect and intervene to prevent cyclical redirects.
 */
//Description of each status is retrieved form https://developer.mozilla.org/en-US/docs/Web/HTTP/Status
public class redirection
{
    /**
     * The request has more than one possible response. The user-agent or user should choose one of them.
     * (There is no standardized way of choosing one of the responses, but HTML links to the possibilities are recommended so the user can pick.)
     */
    public static int MULTIPLE_CHOICES= 300;
    /**
     * The URL of the requested resource has been changed permanently.
     * The new URL should given in the response.
     */
    public static final int MOVED_PERMANENTLY = 301;
    /**
     * This response code means that the URI of requested resource has been changed temporarily.
     * Further changes in the URI might be made in the future.
     * Therefore, this same URI should be used by the client in future requests.
     */
    public static final int FOUND = 302;
    /**
     * The server sent this response to direct the client to get the requested resource at another URI with a GET request.
     */
    public static final int SEE_OTHER = 303;
    /**
     * This is used for caching purposes.
     * It tells the client that the response has not been modified,
     * so the client can continue to use the same cached version of the response.
     */
    public static final int NOT_MODIFIED = 304;
    /**
     * The requested resource is available only through a proxy, the address for which is provided in the response.
     *
     * @deprecated It has been deprecated due to security concerns regarding in-band configuration of a proxy.
     */
    @Deprecated
    public static final int USE_PROXY = 305;
    /**
     * Subsequent requests should use the specified proxy.
     *
     * @deprecated This response code is no longer used; it is just reserved.
     * It was used in a previous version of the HTTP/1.1 specification.
     */
    @Deprecated
    public static final int SWITCH_PROXY = 306;
    /**
     * The server sends this response to direct the client to get the requested resource at
     * another URI with same method that was used in the prior request.
     * This has the same semantics as the 302 Found HTTP response code,
     * with the exception that the user agent must not change the HTTP method used:
     * If a POST was used in the first request, a POST must be used in the second request.
     */
    public static final int TEMPORARY_REDIRECT = 307;
    /**
     * This means that the resource is now permanently located at another URI, specified by the Location HTTP Response header.
     * This has the same semantics as the 301 Moved Permanently HTTP response code,
     * with the exception that the user agent must not change the HTTP method used:
     * If a POST was used in the first request,
     * a POST must be used in the second request.
     */
    public static final int PERMANENT_REDIRECT = 308;
}
