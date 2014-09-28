package com.hp.oo.sdk.content.annotations;

import com.hp.oo.sdk.content.plugin.ActionMetadata.MatchType;
import com.hp.oo.sdk.content.plugin.ActionMetadata.ResponseType;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by IntelliJ IDEA.
 * User: butensky
 * Date: 3/11/12
 * Time: 10:44 AM
 * This annotation represents a Response of an @Action.
 * The Action will define an initial OO Responses. In each Response:
 * - text: the text that each response transition will show.
 * - field + value: will be used for the response's rule. The created rule will be in the format of 'field Matches value'.
 */
//TODO: Add more Javadoc
@Target({}) @Retention(RUNTIME)
public @interface Response {
    String text();
    String field();
    String value();
    boolean  ruleDefined() default true;
    boolean  isDefault() default false;
    MatchType matchType() default MatchType.EXACT ;
    ResponseType responseType() default ResponseType.RESOLVE_BY_NAME;
    boolean  isOnFail() default false;
    String description() default "";
}
