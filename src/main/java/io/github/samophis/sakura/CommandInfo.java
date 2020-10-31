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
     * Name of the command; this is what users type when invoking a command.
     *
     * @return <b>non-null</b> name of the command.
     */
    @Nonnull
    @CheckReturnValue
    String name();

    /**
     * Description of the command.
     *
     * @return <b>possibly-null</b> command description.
     */
    @Nullable
    @CheckReturnValue
    String description();

    /**
     * Usage of the command.
     *
     * @return <b>possibly-null</b> command usage.
     */
    @Nullable
    @CheckReturnValue
    String usage();

    /**
     * Immutable set reflecting the permissions the bot needs to execute this command - empty if none.
     *
     * @return <b>non-null</b> bot permissions set.
     */
    @Nonnull
    @CheckReturnValue
    Set<Permission> requiredBotPermissions();

    /**
     * Immutable set reflecting the permissions the user needs to invoke this command - empty if none.
     *
     * @return <b>non-null</b> user permissions set.
     */
    @Nonnull
    @CheckReturnValue
    Set<Permission> requiredUserPermissions();

    /**
     * The method a command invokes when executed. Should ideally not be touched outside of the command handler.
     *
     * @return <b>non-null</b> command method; this is the method a command will invoke.
     */
    @Nonnull
    @CheckReturnValue
    Method method();
}