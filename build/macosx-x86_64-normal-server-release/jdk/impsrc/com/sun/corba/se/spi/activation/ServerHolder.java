package com.sun.corba.se.spi.activation;

/**
* com/sun/corba/se/spi/activation/ServerHolder.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Volumes/Mac/OpenJdk/openjdk8/myOpenJDK/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* 2020?11?21? ??? ??04?43?30? CST
*/


/** Server callback API, passed to Activator in active method.
    */
public final class ServerHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.spi.activation.Server value = null;

  public ServerHolder ()
  {
  }

  public ServerHolder (com.sun.corba.se.spi.activation.Server initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.ServerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.ServerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.ServerHelper.type ();
  }

}
