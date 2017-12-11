package com.hp.oo.sdk.content.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Date: 6/20/11
 *
 * @author Dima Rassin
 */
//TODO: Add Javadoc
@Target(PARAMETER) @Retention(RUNTIME)
public @interface Param {
    String value(); // the param name
    boolean required() default false;
    boolean encrypted() default false;
    String description() default "";
}
