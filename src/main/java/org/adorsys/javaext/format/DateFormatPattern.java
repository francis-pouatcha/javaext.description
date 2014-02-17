package org.adorsys.javaext.format;

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
public @interface DateFormatPattern {

	public String pattern();
	
	public String locale() default "";
	
	public String suffix() default "";
	
	public String prefix() default "";
}