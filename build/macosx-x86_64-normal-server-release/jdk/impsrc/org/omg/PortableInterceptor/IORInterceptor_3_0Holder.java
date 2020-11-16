package org.omg.PortableInterceptor;

/**
* org/omg/PortableInterceptor/IORInterceptor_3_0Holder.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/cg/jdk8u/openjdk/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* 2020?2?2? ??? ??02?27?29? CST
*/

public final class IORInterceptor_3_0Holder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.PortableInterceptor.IORInterceptor_3_0 value = null;

  public IORInterceptor_3_0Holder ()
  {
  }

  public IORInterceptor_3_0Holder (org.omg.PortableInterceptor.IORInterceptor_3_0 initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.PortableInterceptor.IORInterceptor_3_0Helper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.PortableInterceptor.IORInterceptor_3_0Helper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.PortableInterceptor.IORInterceptor_3_0Helper.type ();
  }

}
