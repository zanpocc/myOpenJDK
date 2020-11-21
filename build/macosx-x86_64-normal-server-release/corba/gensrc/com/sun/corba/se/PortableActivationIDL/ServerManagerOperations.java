package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ServerManagerOperations.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Volumes/Mac/OpenJdk/openjdk8/myOpenJDK/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* 2020?11?21? ??? ??04?43?30? CST
*/


/** Interface used to combine the Activator and Locator when both are
    * implemented together in the same process, as is currently the case
    * for our implementation.
    */
public interface ServerManagerOperations  extends com.sun.corba.se.PortableActivationIDL.ActivatorOperations, com.sun.corba.se.PortableActivationIDL.LocatorOperations
{
} // interface ServerManagerOperations
