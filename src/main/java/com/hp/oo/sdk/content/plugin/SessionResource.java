package com.hp.oo.sdk.content.plugin;

/**
 * Date: 7/28/11
 *
 * @author Dima Rassin
 */
public abstract class SessionResource<T> {
    public abstract T get();

    public abstract void release();

    @Override
    protected void finalize() throws Throwable {
        release();
        super.finalize();
    }


}
