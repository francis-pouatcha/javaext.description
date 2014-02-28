package org.adorsys.javaext.admin;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Marks a role as a login role. This role will
 * be used in the web xml to cover all protected link.
 * 
 * For a user to be able to login, he must be assigned a login role.
 * 
 * @author francis pouatcha
 *
 */
@Target({ ElementType.FIELD})
@Retention(RUNTIME)
@Documented
public @interface LoginRole {
}
