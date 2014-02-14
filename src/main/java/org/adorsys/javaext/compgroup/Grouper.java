package org.adorsys.javaext.compgroup;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Mark the enumeration that list existing component groups.
 * 
 * @author francis pouatcha
 *
 */
@Target({ ElementType.TYPE})
@Retention(RUNTIME)
@Documented
public @interface Grouper {
}
