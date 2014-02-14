package org.adorsys.javaext.admin;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Mark the login table. This is the table that contains the login name and 
 * the password of the user.
 * 
 * The marked component must also have a may relationship to the role table.
 * 
 * @author francis pouatcha
 *
 */
@Target({ ElementType.TYPE})
@Retention(RUNTIME)
@Documented
public @interface LoginTable {
	
	/**
	 * Name of the field carrying the login name.
	 * @return
	 */
	String loginNameField();
	
	/**
	 * Name of the field carryng the password.
	 * @return
	 */
	String passwordField();
	
	/**
	 * Name of the field referencing the collection of role Names.
	 * @return
	 */
	String roleNameField();
	
	/**
	 * Name of the field referencing the user holding this login name.
	 * @return
	 */
	String userField();
}
