package io.github.samophis.sakura.annotations;

import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnull;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description annotation that tells Sakura (and a user) about the command.
 *
 * @author Sam Pritchard
 * @since 2020-10-31; 0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Description {
    /**
     * The description of this command.
     * @return Command description.
     */
    @CheckReturnValue
    @Nonnull
    String value();
}
