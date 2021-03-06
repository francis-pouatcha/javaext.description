package org.adorsys.javaext.admin;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Marks the role component as the role table.
 * 
 * @author francis pouatcha
 *
 */
@Target({ ElementType.TYPE})
@Retention(RUNTIME)
@Documented
public @interface RoleTable {
	
	/**
	 * The enum class
	 * 
	 * @return
	 */
	public String enumClass();
	
	public String roleNameField(); 

}
