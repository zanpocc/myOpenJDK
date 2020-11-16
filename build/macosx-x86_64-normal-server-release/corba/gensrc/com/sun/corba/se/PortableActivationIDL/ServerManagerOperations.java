package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ServerManagerOperations.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/cg/jdk8u/openjdk/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* 2020?2?2? ??? ??02?27?28? CST
*/


/** Interface used to combine the Activator and Locator when both are
    * implemented together in the same process, as is currently the case
    * for our implementation.
    */
public interface ServerManagerOperations  extends com.sun.corba.se.PortableActivationIDL.ActivatorOperations, com.sun.corba.se.PortableActivationIDL.LocatorOperations
{
} // interface ServerManagerOperations
