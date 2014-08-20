package com.hp.oo.sdk.content.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Date: 6/20/11
 *
 * @author Dima Rassin
 */
@Target(METHOD) @Retention(RUNTIME)
public @interface Action {
    String value() default "";
    String name() default "";
    String description() default "";
    Output[] outputs() default {};
    Response[] responses() default {};
}
