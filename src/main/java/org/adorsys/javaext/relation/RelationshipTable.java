package org.adorsys.javaext.relation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE})
@Retention(RUNTIME)
@Documented
public @interface RelationshipTable {
}
