package dojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyArrayListTest {

	MyArrayList array = new MyArrayList();

	@Test
	public void testEmptyArray() {
		assertEquals(0, array.size());
		assertTrue(array.isEmpty());
	}

	@Test
	public void testAddFirst() {
		array.add("first");

		assertEquals(1, array.size());
		assertFalse(array.isEmpty());
		assertEquals("first", array.get(0));
		assertEquals(0, array.indexOf("first"));
		assertTrue(array.contains("first"));
	}

	@Test
	public void testAddSecond() {
		array.add("first");
		array.add("second");

		assertEquals(2, array.size());
		assertFalse(array.isEmpty());
		assertEquals("second", array.get(1));
		assertEquals(1, array.indexOf("second"));
		assertTrue(array.contains("second"));
	}

	@Test
	public void testAddMany() {
		for (int i = 0; i < 10; i++) {
			array.add("element" + i);

			assertEquals(i +1, array.size());
			assertFalse(array.isEmpty());
			assertEquals("element" + i, array.get(i));
			assertEquals(i, array.indexOf("element" + i));
			assertTrue(array.contains("element" + i));
		}
	}
}
