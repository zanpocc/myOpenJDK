package org.omg.PortableServer;


/**
* org/omg/PortableServer/POA.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Volumes/Mac/OpenJdk/openjdk8/myOpenJDK/corba/src/share/classes/org/omg/PortableServer/poa.idl
* 2020?11?21? ??? ??04?43?32? CST
*/


/**
	 * A POA object manages the implementation of a 
	 * collection of objects. The POA supports a name space 
	 * for the objects, which are identified by Object Ids. 
	 * A POA also provides a name space for POAs. A POA is 
	 * created as a child of an existing POA, which forms a 
	 * hierarchy starting with the root POA. A POA object 
	 * must not be exported to other processes, or 
	 * externalized with ORB::object_to_string.
	 */
public interface POA extends POAOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
} // interface POA
