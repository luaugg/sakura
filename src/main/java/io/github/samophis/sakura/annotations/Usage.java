package io.github.samophis.sakura.annotations;

import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnull;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Usageannotation that tells a user how to use a command.
 *
 * @author Sam Pritchard
 * @since 2020-10-31; 0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Usage {
    /**
     * The usage of this command.
     * @return Command usage.
     */
    @CheckReturnValue
    @Nonnull
    String value();
}
