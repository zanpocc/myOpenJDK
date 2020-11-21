package org.omg.DynamicAny.DynAnyFactoryPackage;


/**
* org/omg/DynamicAny/DynAnyFactoryPackage/InconsistentTypeCode.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Volumes/Mac/OpenJdk/openjdk8/myOpenJDK/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* 2020?11?21? ??? ??04?43?30? CST
*/

public final class InconsistentTypeCode extends org.omg.CORBA.UserException
{

  public InconsistentTypeCode ()
  {
    super(InconsistentTypeCodeHelper.id());
  } // ctor


  public InconsistentTypeCode (String $reason)
  {
    super(InconsistentTypeCodeHelper.id() + "  " + $reason);
  } // ctor

} // class InconsistentTypeCode
