package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/NameValuePair.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Volumes/Mac/OpenJdk/openjdk8/myOpenJDK/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* 2020?11?21? ??? ??04?43?30? CST
*/

public final class NameValuePair implements org.omg.CORBA.portable.IDLEntity
{

  /**
          * The name associated with the Any.
          */
  public String id = null;

  /**
          * The Any value associated with the name.
          */
  public org.omg.CORBA.Any value = null;

  public NameValuePair ()
  {
  } // ctor

  public NameValuePair (String _id, org.omg.CORBA.Any _value)
  {
    id = _id;
    value = _value;
  } // ctor

} // class NameValuePair
