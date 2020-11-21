package org.omg.CosNaming.NamingContextExtPackage;


/**
* org/omg/CosNaming/NamingContextExtPackage/InvalidAddress.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Volumes/Mac/OpenJdk/openjdk8/myOpenJDK/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* 2020?11?21? ??? ??04?43?30? CST
*/

public final class InvalidAddress extends org.omg.CORBA.UserException
{

  public InvalidAddress ()
  {
    super(InvalidAddressHelper.id());
  } // ctor


  public InvalidAddress (String $reason)
  {
    super(InvalidAddressHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidAddress
