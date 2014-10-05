/*
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */
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
