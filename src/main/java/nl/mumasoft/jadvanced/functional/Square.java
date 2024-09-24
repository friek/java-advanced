package nl.mumasoft.jadvanced.functional;

import java.util.function.Function;

/**
 * Functional interface to square an integer
 * <p>Basically the same as IntUnaryOperator</p>
 */
@FunctionalInterface
public interface Square extends Function<Integer, Integer>
{
}
