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
		assertEquals(1, array.size());
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
		assertEquals(2, array.size());
	}

	@Test
	public void testAddMany() {
		for (int i = 0; i < 10; i++) {
			array.add(new Integer(i));

			assertEquals(i + 1, array.size());
			assertFalse(array.isEmpty());
			assertEquals(i, array.get(i));
			assertEquals(i, array.indexOf(i));
			assertTrue(array.contains(i));
			assertEquals(i+1, array.size());
		}
	}

	@Test
	public void insertSomeElements() {
		for (int i = 0; i < 10; i++) {
			array.add(new Integer(i));
		}

		array.add(0, new Integer(111));
		assertEquals(111, array.get(0));
		assertEquals(0, array.get(1));

		array.add(3, new Integer(333));
		assertEquals(333, array.get(3));
		assertEquals(2, array.get(4));

		assertEquals(-1, array.indexOf(new Integer(81)));
	}

	@Test
	public void clearElements() {
		for (int i = 0; i < 10; i++) {
			array.add(new Integer(i));
		}
	}

	@Test
	public void removeSomeElements() {
		for (int i = 0; i < 10; i++) {
			array.add(new Integer(i));
		}

		array.remove(0);
		assertEquals(9, array.size());
		array.remove(8);
		assertEquals(8, array.size());
		array.remove(0);
		assertEquals(7, array.size());
	}
}
