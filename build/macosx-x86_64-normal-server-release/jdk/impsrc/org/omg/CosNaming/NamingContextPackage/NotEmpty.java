package org.omg.CosNaming.NamingContextPackage;


/**
* org/omg/CosNaming/NamingContextPackage/NotEmpty.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/cg/jdk8u/openjdk/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* 2020?2?2? ??? ??02?27?27? CST
*/

public final class NotEmpty extends org.omg.CORBA.UserException
{

  public NotEmpty ()
  {
    super(NotEmptyHelper.id());
  } // ctor


  public NotEmpty (String $reason)
  {
    super(NotEmptyHelper.id() + "  " + $reason);
  } // ctor

} // class NotEmpty
