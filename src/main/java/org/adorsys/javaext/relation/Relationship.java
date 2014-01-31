package org.adorsys.javaext.relation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE, METHOD, FIELD  })
@Retention(RUNTIME)
@Documented
public @interface Relationship {
	public Class<?> targetEntity();
	public Class<?> sourceEntity();
	public String sourceQualifier();
	public String targetQualifier() default "";
	public RelationshipEnd end();
}
