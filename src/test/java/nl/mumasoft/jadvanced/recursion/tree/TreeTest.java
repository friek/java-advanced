package nl.mumasoft.jadvanced.recursion.tree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class TreeTest
{
	private List<Integer> items = List.of(10, 9, 5, 7);

	@Test
	void testPp()
	{
		var tree = initTree();

		tree.pp();
	}

	@Test
	void testSize()
	{
		assertEquals(items.size(), initTree().size());
	}

	@Test
	void testToList()
	{
		var expected = new ArrayList<>(items);
		Collections.sort(expected);
		assertIterableEquals(expected, initTree().toList());
	}


	private Tree<Integer> initTree()
	{
		var tree = new Tree<Integer>();

		for (var i : items)
			tree.add(i);

		return tree;
	}

}
