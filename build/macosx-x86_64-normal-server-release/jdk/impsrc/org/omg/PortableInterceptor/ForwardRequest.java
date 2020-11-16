package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/ForwardRequest.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/cg/jdk8u/openjdk/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* 2020?2?2? ??? ??02?27?29? CST
*/

public final class ForwardRequest extends org.omg.CORBA.UserException
{

  /** 
       * The new object to forward the request to.
       */
  public org.omg.CORBA.Object forward = null;

  public ForwardRequest ()
  {
    super(ForwardRequestHelper.id());
  } // ctor

  public ForwardRequest (org.omg.CORBA.Object _forward)
  {
    super(ForwardRequestHelper.id());
    forward = _forward;
  } // ctor


  public ForwardRequest (String $reason, org.omg.CORBA.Object _forward)
  {
    super(ForwardRequestHelper.id() + "  " + $reason);
    forward = _forward;
  } // ctor

} // class ForwardRequest
