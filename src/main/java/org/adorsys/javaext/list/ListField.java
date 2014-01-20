package org.adorsys.javaext.list;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Added to a field that will be displayed in the list view of the entity.
 * 
 * @author francis
 *
 */
@Target({ ElementType.TYPE, METHOD, FIELD  })
@Retention(RUNTIME)
@Documented
public @interface ListField {
	public String[] value();
}
