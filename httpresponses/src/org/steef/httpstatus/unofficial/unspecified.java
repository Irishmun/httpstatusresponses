package org.steef.httpstatus.unofficial;

/**
 * The following codes are not specified by any standard.
 */
public class unspecified
{
    /**
     * Used in the resumable requests proposal to resume aborted PUT or POST requests.
     */
    public static final int CHECKPOINT = 103;
    /**
     * Used as a catch-all error condition for allowing response bodies to flow through Apache when ProxyErrorOverride is enabled.
     * When ProxyErrorOverride is enabled in Apache, response bodies that contain
     * a status code of 4xx or 5xx are automatically discarded by Apache in favor of
     * a generic response or a custom response specified by the ErrorDocument directive.
     */
    public static final int THIS_IS_FINE = 218;
    /**
     * Used by the Laravel Framework when a CSRF Token is missing or expired
     */
    public static final int PAGE_EXPIRED = 419;
    /**
     * A deprecated response used by the Spring Framework when a method has failed.
     */
    public static final int METHOD_FAILURE = 420;
    /**
     * Returned by version 1 of the Twitter Search and Trends API when the client is being rate limited.<br>
     * (NOTE: versions 1.1 and later use the 429 Too Many Requests response code instead.)
     */
    public static final int ENHANCE_YOUR_CALM = 420;
    /**
     *Used by Shopify, instead of the 429 Too Many Requests response code,
     * when too many URLs are requested within a certain time frame.
     */
    public static final int REQUEST_HEADER_FIELDS_TOO_LARGE = 430;
    /**
     *The Microsoft extension code indicated when Windows Parental Controls
     * are turned on and are blocking access to the requested webpage.
     */
    public static final int BLOCKED_BY_PARENTAL_CONTROLS = 450;
    /**
     *Indicates an expired or otherwise invalid token.<br>
     *Returned by ArcGIS for Server.
     */
    public static final int INVALID_TOKEN = 498;
    /**
     *Indicates that a token is required but was not submitted.<br>
     *Returned by ArcGIS for Server.
     */
    public static final int TOKEN_REQUIRED = 499;
    /**
     *The server has exceeded the bandwidth specified by the server administrator;
     * this is often used by shared hosting providers to limit the bandwidth of customers.
     */
    public static final int BANDWIDTH_LIMIT_EXCEEDED = 509;
    /**
     *Used by Qualys in the SSLLabs server testing API to signal that the site can't process the request.
     */
    public static final int SITE_IS_OVERLOADED = 529;
    /**
     *Used by the Pantheon web platform to indicate a site that has been frozen due to inactivity.
     */
    public static final int SITE_IS_FROZEN = 530;
    /**
     *Used by some HTTP proxies to signal a network read timeout behind the proxy to a client in front of the proxy.
     */
    public static final int NETWORK_READ_TIMEOUT_ERROR_INFORMAL = 598;
}
