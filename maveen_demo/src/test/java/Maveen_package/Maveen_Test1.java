package Maveen_package;

import static org.junit.Assert.*;

import org.junit.Test;

public class Maveen_Test1 {

	@Test
	public void testconcat() {
		Maveen_class test = new Maveen_class();
		String result = test.concatenate("one","two");
		assertEquals("onetwo", result);
	
	}

}
