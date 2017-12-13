/*
 * Copyright © 2014-2017 EntIT Software LLC, a Micro Focus company (L.P.)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
