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

public class ObjectSessionResource extends SessionResource<Object> implements Serializable {

    private static final long serialVersionUID = -1056068984564693902L;

    private Object object;

    public ObjectSessionResource(final Object object) {
        this.object = object;
    }

    @Override
    public Object get() {
        return object;
    }

    @Override
    public void release() {
        object = null;
    }
}
