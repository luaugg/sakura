package io.github.samophis.sakura;

import com.mewna.catnip.entity.util.Permission;

import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.lang.reflect.Method;
import java.util.Set;

/**
 * Immutable data class containing all the information associated with a command.
 *
 * @author Sam Pritchard
 * @since 2020/10/31; 0.1
 */
public interface CommandInfo {
    /**
     * @return <b>non-null</b> name of the command.
     */
    @Nonnull
    @CheckReturnValue
    String name();

    /**
     * @return <b>possibly-null</b> command description.
     */
    @Nullable
    @CheckReturnValue
    String description();

    /**
     * @return <b>possibly-null</b> command usage.
     */
    @Nullable
    @CheckReturnValue
    String usage();

    /**
     * @return <b>non-null</b> set containing permissions the bot requires - empty if none.
     */
    @Nonnull
    @CheckReturnValue
    Set<Permission> requiredBotPermissions();

    /**
     * @return <b>non-null</b> set containing permissions the message author requires - empty if none.
     */
    @Nonnull
    @CheckReturnValue
    Set<Permission> requiredUserPermissions();

    /**
     * @return <b>non-null</b> command method; this is the method a command will execute.
     */
    @Nonnull
    @CheckReturnValue
    Method method();
}