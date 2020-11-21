package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/ServerOperations.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Volumes/Mac/OpenJdk/openjdk8/myOpenJDK/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* 2020?11?21? ??? ??04?43?30? CST
*/


/** Server callback API, passed to Activator in active method.
    */
public interface ServerOperations 
{

  /** Shutdown this server.  Returns after orb.shutdown() completes.
  	*/
  void shutdown ();

  /** Install the server.  Returns after the install hook completes
  	* execution in the server.
  	*/
  void install ();

  /** Uninstall the server.  Returns after the uninstall hook
  	* completes execution.
  	*/
  void uninstall ();
} // interface ServerOperations
