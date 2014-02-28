package org.adorsys.javaext.admin;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Marks the role enum class.
 * 
 * @author francis pouatcha
 *
 */
@Target({ ElementType.TYPE})
@Retention(RUNTIME)
@Documented
public @interface RoleEnum {
	
}
