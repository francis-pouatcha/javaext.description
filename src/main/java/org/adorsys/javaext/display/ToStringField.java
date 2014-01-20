package org.adorsys.javaext.display;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Added to a field that will be displayed in the string representation of this entity.
 * 
 * @author francis pouatcha
 *
 */
@Target({ ElementType.TYPE, METHOD, FIELD  })
@Retention(RUNTIME)
@Documented
public @interface ToStringField {
	public String[] value();
}
