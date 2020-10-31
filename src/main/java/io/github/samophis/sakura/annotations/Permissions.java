package io.github.samophis.sakura.annotations;

import com.mewna.catnip.entity.util.Permission;

import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnull;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Permission annotation that tells Sakura (and a user) what permissions both they and the bot need.
 *
 * @author Sam Pritchard
 * @since 2020-10-31; 0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Permissions {
    /**
     * An array of permissions the bot requires to execute a command. Defaults to an empty array.
     * @return Bot permissions array.
     */
    @Nonnull
    @CheckReturnValue
    Permission[] botPermissions() default { };

    /**
     * An array of permissions the message author requires to execute a command. Defaults to an empty array.
     * @return Message author permissions array.
     */
    @Nonnull
    @CheckReturnValue
    Permission[] userPermissions() default { };
}
