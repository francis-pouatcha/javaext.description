package org.adorsys.javaext.admin;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Marks the role component.
 * 
 * @author francis pouatcha
 *
 */
@Target({ ElementType.TYPE})
@Retention(RUNTIME)
@Documented
public @interface RoleTable {
	
	/**
	 * Name of the field carrying the role name.
	 * @return
	 */
	String roleNameField();
	
	/**
	 * Name of the field referencing sub roles. In case the use case foresees
	 * grouping of roles.
	 * 
	 * @return
	 */
	String subRolesField();
}
