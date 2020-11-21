package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/WrongPolicy.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Volumes/Mac/OpenJdk/openjdk8/myOpenJDK/corba/src/share/classes/org/omg/PortableServer/poa.idl
* 2020?11?21? ??? ??04?43?32? CST
*/

public final class WrongPolicy extends org.omg.CORBA.UserException
{

  public WrongPolicy ()
  {
    super(WrongPolicyHelper.id());
  } // ctor


  public WrongPolicy (String $reason)
  {
    super(WrongPolicyHelper.id() + "  " + $reason);
  } // ctor

} // class WrongPolicy
