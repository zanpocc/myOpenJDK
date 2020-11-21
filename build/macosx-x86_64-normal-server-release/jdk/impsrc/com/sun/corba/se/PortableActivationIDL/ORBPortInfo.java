package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ORBPortInfo.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Volumes/Mac/OpenJdk/openjdk8/myOpenJDK/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* 2020?11?21? ??? ??04?43?30? CST
*/

public final class ORBPortInfo implements org.omg.CORBA.portable.IDLEntity
{
  public String orbId = null;
  public int port = (int)0;

  public ORBPortInfo ()
  {
  } // ctor

  public ORBPortInfo (String _orbId, int _port)
  {
    orbId = _orbId;
    port = _port;
  } // ctor

} // class ORBPortInfo
