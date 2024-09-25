package nl.mumasoft.jadvanced.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CollectTest
{
	@Test
	void testCollect()
	{
		var result = IntStream.of(1, 2, 3)
				.collect(
						// Supplier
						() -> new Holder<>(0),
						// Accumulator
						(holder, value) -> holder.value += value,
						// Only used when calling collect with a parallel stream to combine multiple instances as
						// created by the supplier, so now a no-op
						(_, _) -> {
						});

		assertEquals(6, result.value);
	}

	@Test
	void testCollectParallel()
	{
		var result = IntStream.of(1, 2, 3)
				.parallel()
				.collect(
						// Supplier
						() -> new Holder<>(0),
						// Accumulator
						(holder, value) -> holder.value += value,
						// Combiner
						(holder1, holder2) -> holder1.value += holder2.value);

		assertEquals(6, result.value);

	}

	static class Holder<T>
	{
		T value;

		Holder(T value)
		{
			this.value = value;
		}
	}
}
