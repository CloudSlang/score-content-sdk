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

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: maromben
 * Date: 3/19/12
 * Time: 8:14 PM
 */
//TODO: Add Javadoc
public class SerializableSessionObject extends SessionParam{
    private static final long serialVersionUID = -8017906075213304430L;

    private Serializable value;

    public Serializable getValue() {
        return value;
    }

    public void setValue(Serializable value) {
        this.value = value;
    }
}
