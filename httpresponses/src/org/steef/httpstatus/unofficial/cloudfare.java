package org.steef.httpstatus.unofficial;

/**
 * Cloudflare's reverse proxy service.
 */
public class cloudfare
{
    /**
     * "Web Server Returned an Unknown Error"
     * The origin server returned an empty, unknown, or unexplained response to Cloudflare.
     */
    public static final int RETURNED_UNKNOWN = 520;
    /**
     * The origin server has refused the connection from Cloudflare.
     */
    public static final int WEB_SERVER_DOWN = 521;
    /**
     * Cloudflare could not negotiate a
     * <a href="https://en.wikipedia.org/wiki/Transmission_Control_Protocol#Connection_establishment">
     * TCP handshake</a>
     * with the origin server.
     */
    public static final int CONNECTION_TIMED_OUT = 522;
    /**
     * Cloudflare could not reach the origin server;
     * for example, if the DNS records for the origin server are incorrect.
     */
    public static final int ORIGIN_UNREACHABLE = 523;
    /**
     * Cloudflare was able to complete a TCP connection to the origin server,
     * but did not receive a timely HTTP response.
     */
    public static final int TIMEOUT_OCCURRED = 524;
    /**
     * Cloudflare could not negotiate a
     * <a href="https://en.wikipedia.org/wiki/Transport_Layer_Security#TLS_handshake">
     * SSL/TLS handshake</a>
     * with the origin server.
     */
    public static final int SSL_HANDSHAKE_FAILED = 525;
    /**
     * Cloudflare could not validate the SSL certificate on the origin web server.
     */
    public static final int INVALID_SSL_CERTIFICATE = 526;
    /**
     * Error 527 indicates an interrupted connection between Cloudflare and the origin server's Railgun server.
     */
    public static final int RAILGUN_ERROR = 527;
    /**
     * HTTP error 530 is returned with an accompanying 1XXX error displayed.
     */
    public static final int ERROR_1000_ACCOMPANY = 530;
}
