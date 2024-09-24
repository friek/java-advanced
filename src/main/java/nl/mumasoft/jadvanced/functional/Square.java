package nl.mumasoft.jadvanced.functional;

import java.util.function.Function;

/**
 * Functional interface to square an integer
 */
@FunctionalInterface
public interface Square extends Function<Integer, Integer>
{
}
