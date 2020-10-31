package io.github.samophis.sakura;

import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Context class backed by a map, allowing for a flexible amount of values inside a context.
 * Only one instance of a given type can be inside a default context. This class is extensible so one that avoids
 * this limitation can be made.
 *
 * @author Sam Pritchard
 * @since 2020-10-31; 0.1
 */
public interface SakuraContext {
    /**
     * Selects the first instance of a class within this context. {@code null} if none is found.
     * This operation's time complexity is O(1) due to a map backing the context.
     * @param cls The class of the instance.
     * @param <T> The instance type.
     *
     * @return <b>possibly-null</b> instance of T.
     */
    @Nullable
    @CheckReturnValue
    <T> T get(@Nonnull final Class<T> cls);

    /**
     * Puts an instance of a class into this context.
     * Note: This will overwrite any instances of the same type.
     * @param obj An object.
     * @param <T> The type of the object.
     */
    @CheckReturnValue
    <T> void put(@Nonnull final T obj);
}