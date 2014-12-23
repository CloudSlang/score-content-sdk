/*******************************************************************************
* (c) Copyright 2014 Hewlett-Packard Development Company, L.P.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Apache License v2.0 which accompany this distribution.
*
* The Apache License is available at
* http://www.apache.org/licenses/LICENSE-2.0
*
*******************************************************************************/

package com.hp.oo.sdk.content.plugin;

/**
 * Date: 7/28/11
 *
 * @author Dima Rassin
 */
//TODO: Add Javadoc
public abstract class SessionResource<T> {
    public abstract T get();

    public abstract void release();

    @Override
    protected void finalize() throws Throwable {
        release();
        super.finalize();
    }


}
