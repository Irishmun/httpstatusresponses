package org.steef.httpstatus.official;

/**
 * This class of status codes indicates the action requested by the client was received, understood, and accepted.
 */
//Description of each status is retrieved form https://developer.mozilla.org/en-US/docs/Web/HTTP/Status
public class successful
{
    /**
     * The request has succeeded.
     * The meaning of the success depends on the HTTP method:
     * <dl>
     * <dt>GET: The resource has been fetched and is transmitted in the message body.</dt>
     * <dt>HEAD: The entity headers are in the message body.</dt>
     * <dt>PUT or POST: The resource describing the result of the action is transmitted in the message body.</dt>
     * <dt>TRACE: The message body contains the request message as received by the server.</dt>
     * </dl>
     */
    public static final int OK = 200;
    /**
     * The request has succeeded and a new resource has been created as a result.
     * This is typically the response sent after POST requests, or some PUT requests.
     */
    public static final int CREATED = 201;
    /**
     * The request has been received but not yet acted upon.
     * It is noncommittal, since there is no way in HTTP to later send an asynchronous response indicating the outcome of the request.
     * It is intended for cases where another process or server handles the request, or for batch processing.
     */
    public static final int ACCEPTED = 202;
    /**
     * This response code means the returned meta-information is not exactly the same as is available from the origin server, but is collected from a local or a third-party copy.
     * This is mostly used for mirrors or backups of another resource.
     * Except for that specific case, the "200 OK" response is preferred to this status.
     */
    public static final int NON_AUTHORITATIVE_INFORMATION = 203;
    /**
     * There is no content to send for this request, but the headers may be useful.
     * The user-agent may update its cached headers for this resource with the new ones.
     */
    public static final int NO_CONTENT = 204;
    /**
     * Tells the user-agent to reset the document which sent this request.
     */
    public static final int RESET_CONTENT = 205;
    /**
     * This response code is used when the Range header is sent from the client to request only part of a resource.
     */
    public static final int PARTIAL_CONTENT = 206;
    /**
     * Conveys information about multiple resources, for situations where multiple status codes might be appropriate.
     * (WebDAV)
     */
    public static final int MULTI_STATUS = 207;
    /**
     * Used inside a dav:propstat response element to avoid repeatedly enumerating the internal members
     * Used inside a dav:propstat response element to avoid repeatedly enumerating the internal members
     * of multiple bindings to the same collection.
     */
    public static final int ALREADY_REPORTED = 208;
    /**
     * The server has fulfilled a GET request for the resource,
     * and the response is a representation of the result of one or more instance-manipulations applied to the current instance.
     * (HTTP Delta encoding)
     */
    public static final int IM_USED = 226;

}
