package org.adorsys.javaext.admin;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Defines the list of roles which can list the annotated component.
 * 
 * @author francis pouatcha
 *
 */
@Target({ ElementType.TYPE, METHOD, FIELD  })
@Retention(RUNTIME)
@Documented
public @interface ListRoles {
	public String[] value();
}
