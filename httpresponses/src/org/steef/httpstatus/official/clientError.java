package org.steef.httpstatus.official;

/**
 * This class of status code is intended for situations in which the error seems to have been caused by the client.
 * <br>
 * Except when responding to a HEAD request, the server should include an entity
 * containing an explanation of the error situation, and whether it is a temporary or permanent condition.
 * These status codes are applicable to any request method.
 * User agents should display any included entity to the user.
 */
//Description of each status is retrieved form https://developer.mozilla.org/en-US/docs/Web/HTTP/Status
public class clientError
{
    /**
     * The server could not understand the request due to invalid syntax.
     */
    public static final int BAD_REQUEST = 400;
    /**
     * Although the HTTP standard specifies "unauthorized", semantically this response means "unauthenticated".
     * That is, the client must authenticate itself to get the requested response.
     */
    public static final int UNAUTHORIZED = 401;
    /**
     * This response code is reserved for future use.
     * The initial aim for creating this code was using it for digital payment systems,
     * however this status code is used very rarely and no standard convention exists.
     *<br>
     * [EXPERIMENTAL] This is an experimental status that should not be used in production code
     */
    public static final int PAYMENT_REQUIRED = 402;
    /**
     * The client does not have access rights to the content; that is, it is unauthorized,
     * so the server is refusing to give the requested resource.
     * Unlike 401, the client's identity is known to the server.
     */
    public static final int FORBIDDEN = 403;
    /**
     * The server can not find the requested resource. In the browser, this means the URL is not recognized.
     * In an API, this can also mean that the endpoint is valid but the resource itself does not exist.
     * Servers may also send this response instead of 403 to hide the existence of a resource from an unauthorized client.
     */
    public static final int NOT_FOUND = 404;
    /**
     * The request method is known by the server but has been disabled and cannot be used.
     * The two mandatory methods, GET and HEAD, must never be disabled and should not return this error code.
     */
    public static final int METHOD_NOT_ALLOWED = 405;
    /**
     * This response is sent when the web server, after performing server-driven content negotiation,
     * doesn't find any content that conforms to the criteria given by the user agent.
     */
    public static final int NOT_ACCEPTABLE = 406;
    /**
     * This is similar to 401 but authentication is needed to be done by a proxy.
     */
    public static final int PROXY_AUTHENTICATION_REQUIRED = 407;
    /**
     * This response is sent on an idle connection by some servers,
     * even without any previous request by the client.
     * It means that the server would like to shut down this unused connection.
     * (Note: some servers merely shut down the connection without sending this message.)
     */
    public static final int REQUEST_TIMEOUT = 408;
    /**
     * This response is sent when a request conflicts with the current state of the server.
     */
    public static final int CONFLICT = 409;
    /**
     * This response is sent when the requested content has been permanently deleted from server, with no forwarding address.
     * Clients are expected to remove their caches and links to the resource.
     * The HTTP specification intends this status code to be used for "limited-time, promotional services".
     * APIs should not feel compelled to indicate resources that have been deleted with this status code.
     */
    public static final int GONE = 410;
    /**
     * Server rejected the request because the Content-Length header field is not defined and the server requires it.
     */
    public static final int LENGTH_REQUIRED = 411;
    /**
     * The client has indicated preconditions in its headers which the server does not meet.
     */
    public static final int PRECONDITION_FAILED = 412;
    /**
     * Request entity is larger than limits defined by server; the server might close the connection or return an Retry-After header field.
     */
    public static final int PAYLOAD_TOO_LARGE = 413;
    /**
     * The URI requested by the client is longer than the server is willing to interpret.
     */
    public static final int URI_TOO_LONG = 414;
    /**
     * The media format of the requested data is not supported by the server, so the server is rejecting the request.
     */
    public static final int UNSUPPORTED_MEDIA_TYPE = 415;
    /**
     * The range specified by the Range header field in the request can't be fulfilled;
     * it's possible that the range is outside the size of the target URI's data.
     */
    public static final int RANGE_NOT_SATISFIABLE = 416;
    /**
     * This response code means the expectation indicated by the Expect request header field can't be met by the server.
     */
    public static final int EXPECTATION_FAILED = 417;
    /**
     * The server refuses the attempt to brew coffee with a teapot.
     * (<a href="https://en.wikipedia.org/wiki/Hyper_Text_Coffee_Pot_Control_Protocol">HTCPCP</a>)
     */
    public static final int IM_A_TEAPOT = 418;
    /**
     * The request was directed at a server that is not able to produce a response.
     * This can be sent by a server that is not configured to produce responses for
     * the combination of scheme and authority that are included in the request URI.
     */
    public static final int MISDIRECTED_REQUEST = 421;
    /**
     * The request was well-formed but was unable to be followed due to semantic errors.
     * (WebDAV)
     */
    public static final int UNPROCESSABLE_ENTITY = 422;
    /**
     * The resource that is being accessed is locked.
     * (WebDAV)
     */
    public static final int LOCKED = 423;
    /**
     * The request failed due to failure of a previous request.
     * (WebDAV)
     */
    public static final int FAILED_DEPENDENCY = 424;
    /**
     * Indicates that the server is unwilling to risk processing a request that might be replayed.
     *<br>
     * [EXPERIMENTAL] This is an experimental status that should not be used in production code
     */
    public static final int TOO_EARLY = 425;
    /**
     * The server refuses to perform the request using the current protocol but
     * might be willing to do so after the client upgrades to a different protocol.
     * The server sends an Upgrade header in a 426 response to indicate the required protocol(s).
     */
    public static final int UPGRADE_REQUIRED = 426;
    /**
     * The origin server requires the request to be conditional. This response is intended to prevent the 'lost update' problem,
     * where a client GETs a resource's state, modifies it, and PUTs it back to the server,
     * when meanwhile a third party has modified the state on the server, leading to a conflict.
     */
    public static final int PRECONDITION_REQUIRED = 428;
    /**
     * The user has sent too many requests in a given amount of time ("rate limiting").
     */
    public static final int TOO_MANY_REQUESTS = 429;
    /**
     * The server is unwilling to process the request because its header fields are too large.
     * The request may be resubmitted after reducing the size of the request header fields.
     */
    public static final int REQUEST_HEADER_FIELDS_TOO_LARGE = 431;
    /**
     * The user-agent requested a resource that cannot legally be provided, such as a web page censored by a government.
     */
    public static final int UNAVAILABLE_FOR_LEGAL_REASONS = 451;
}
