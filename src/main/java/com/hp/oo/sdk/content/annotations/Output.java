package com.hp.oo.sdk.content.annotations;

/**
 * Created by IntelliJ IDEA.
 * User: butensky
 * Date: 28/03/12
 * Time: 09:56
 * The annotation to define the metadata of the @Action output.
 */
public @interface Output {
    String value();
    String description() default "";
}
