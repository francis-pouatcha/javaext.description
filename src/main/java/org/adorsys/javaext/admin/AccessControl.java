package org.adorsys.javaext.admin;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.interceptor.InterceptorBinding;

/**
 * This annotation is used to mark access control interceptors.
 * 
 * @author francis pouatcha
 *
 */
@Retention(RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD})
@InterceptorBinding
public @interface AccessControl {
}
