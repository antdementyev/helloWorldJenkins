package jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testMain(){
		assertNotNull("it doesn't matter to have smthg hier");
	}
	
	@Test
	public void testGive1(){
		assertEquals(2, new HelloWorld().give1());
	}
}
