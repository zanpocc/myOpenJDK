package org.omg.PortableServer;


/**
* org/omg/PortableServer/ServantActivator.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Volumes/Mac/OpenJdk/openjdk8/myOpenJDK/corba/src/share/classes/org/omg/PortableServer/poa.idl
* 2020?11?21? ??? ??04?43?32? CST
*/


/**
	 * When the POA has the RETAIN policy it uses servant 
	 * managers that are ServantActivators. 
	 */
public interface ServantActivator extends ServantActivatorOperations, org.omg.PortableServer.ServantManager, org.omg.CORBA.portable.IDLEntity 
{
} // interface ServantActivator
