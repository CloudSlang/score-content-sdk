package com.hp.oo.sdk.content.plugin;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: maromben
 * Date: 3/19/12
 * Time: 8:14 PM
 */
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
