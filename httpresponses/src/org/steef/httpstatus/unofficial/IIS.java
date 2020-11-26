package org.steef.httpstatus.unofficial;

/**
 * Microsoft's Internet Information Services (IIS).
 * <br>
 * IIS sometimes uses additional decimal sub-codes for more specific information,
 * however these sub-codes only appear in the response payload and in documentation,
 * not in the place of an actual HTTP status code.
 */
public class IIS
{
    /**
     *The client's session has expired and must log in again.
     */
    public static final int LOGIN_TIMEOUT= 440;
    /**
     *The server cannot honour the request because the user has not provided the required information.
     */
    public static final int RETRY_WITH= 449;
    /**
     *Used in
     * <a href="https://en.wikipedia.org/wiki/Exchange_ActiveSync">Exchange ActiveSync</a>
     * when either a more efficient server is available or the server cannot access the users' mailbox.
     * The client is expected to re-run the HTTP AutoDiscover operation to find a more appropriate server.
     */
    public static final int REDIRECT= 451;
}
