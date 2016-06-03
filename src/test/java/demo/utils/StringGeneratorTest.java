package demo.utils;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringGeneratorTest {
	@Test
	public void testGetAddress() {
		StringGenerator generator = new StringGenerator();
		assertNotNull(generator.getAddress());
	}

	@Test
	public void testGetEmailAddress() {
		StringGenerator generator = new StringGenerator();
		assertNotNull(generator.getEmail());
		assertTrue(generator.getEmail().contains("@"));
	}
}
