package com.hp.oo.sdk.content.plugin;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: maromben
 * Date: 3/25/12
 * Time: 12:44 PM
 */
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
