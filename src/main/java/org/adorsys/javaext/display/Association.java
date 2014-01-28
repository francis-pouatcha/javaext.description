package org.adorsys.javaext.display;

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
public @interface Association {
	
	/**
	 * Returns fields of the referenced entity to be displayed 
	 * by the referencing entity.
	 * @return
	 */
	public String[] fields() default {};
	
	public SelectionMode selectionMode() default SelectionMode.FORWARD;
	
	public AssociationType associationType() default AssociationType.AGGREGATION;
	
	public Class<?> targetEntity();
}
