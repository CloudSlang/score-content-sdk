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
 * Date: 3/25/12
 * Time: 12:44 PM
 */
//TODO: Add Javadoc
public abstract class SessionParam  implements Serializable {
    private static final long serialVersionUID = 2998161362775739998L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (this.name != null){
            throw new UnsupportedOperationException("Name can't be changed more than once!");
        }
        this.name = name;
    }
}
