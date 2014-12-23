/*******************************************************************************
* (c) Copyright 2014 Hewlett-Packard Development Company, L.P.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Apache License v2.0 which accompany this distribution.
*
* The Apache License is available at
* http://www.apache.org/licenses/LICENSE-2.0
*
*******************************************************************************/

package com.hp.oo.sdk.content.annotations;

/**
 * Created by IntelliJ IDEA.
 * User: butensky
 * Date: 28/03/12
 * Time: 09:56
 * The annotation to define the metadata of the @Action output.
 */
//TODO: Add Javadoc
public @interface Output {
    String value();
    String description() default "";
}
