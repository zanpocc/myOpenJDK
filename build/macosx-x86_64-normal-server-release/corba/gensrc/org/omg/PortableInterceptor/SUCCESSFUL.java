package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/SUCCESSFUL.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/cg/jdk8u/openjdk/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* 2020?2?2? ??? ??02?27?29? CST
*/

public interface SUCCESSFUL
{

  /**
     * Indicates a successful Reply Status. One possible value for 
     * <code>RequestInfo.reply_status</code>.
     * @see RequestInfo#reply_status
     * @see SYSTEM_EXCEPTION
     * @see USER_EXCEPTION
     * @see LOCATION_FORWARD
     * @see TRANSPORT_RETRY
     */
  public static final short value = (short)(0);
}
