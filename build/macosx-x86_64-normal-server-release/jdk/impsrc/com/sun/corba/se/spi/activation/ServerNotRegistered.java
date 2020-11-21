package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/ServerNotRegistered.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Volumes/Mac/OpenJdk/openjdk8/myOpenJDK/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* 2020?11?21? ??? ??04?43?30? CST
*/

public final class ServerNotRegistered extends org.omg.CORBA.UserException
{
  public int serverId = (int)0;

  public ServerNotRegistered ()
  {
    super(ServerNotRegisteredHelper.id());
  } // ctor

  public ServerNotRegistered (int _serverId)
  {
    super(ServerNotRegisteredHelper.id());
    serverId = _serverId;
  } // ctor


  public ServerNotRegistered (String $reason, int _serverId)
  {
    super(ServerNotRegisteredHelper.id() + "  " + $reason);
    serverId = _serverId;
  } // ctor

} // class ServerNotRegistered
