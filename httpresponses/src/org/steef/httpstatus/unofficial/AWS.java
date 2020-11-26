package org.steef.httpstatus.unofficial;

/**
 * Amazon Web Service (AWS) Elastic Load Balancing
 */
public class AWS
{
    /**
     * Client closed the connection with the load balancer before the idle timeout period elapsed.
     * Typically when client timeout is sooner than the Elastic Load Balancer's timeout.
     */
    public static final int CLIENT_CLOSED_CONNECTION = 460;
    /**
     * The load balancer received an X-Forwarded-For request header with more than 30 IP addresses.
     */
    public static final int RECEIVED_X_FORWARDED_REQUEST = 463;
}
