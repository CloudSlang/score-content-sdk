package com.hp.oo.sdk.content.plugin;

/**
 * Date: 2/20/14
 *
 * @author Meir Wahnon
 */
//TODO: Add Javadoc
public class GlobalSessionObject<T> extends SessionParam {
    private static final long serialVersionUID = 3164809302900911841L;

    private SessionResource<T> resource;

    public void setResource(SessionResource<T> resource) {
        this.resource = resource;
    }

    public SessionResource<T> getResource() {
        return resource;
    }

    public T get() {
        return resource == null ? null : resource.get();
    }
}
