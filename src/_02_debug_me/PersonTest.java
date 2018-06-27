package _02_debug_me;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {
	Person p = new Person("bob", 11);

	@Test
	public void personTest() {
		assertEquals("bob", p.getName());
		assertEquals(11, p.getAge());
	}

}
