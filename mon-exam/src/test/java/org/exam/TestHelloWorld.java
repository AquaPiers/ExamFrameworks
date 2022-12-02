package org.exam;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

public class TestHelloWorld {

	HelloWorld hw;
	HelloWorld mocked = Mockito.mock(HelloWorld.class);
	
	@Before
	public void setUp() throws Exception {
		this.hw = new HelloWorld("Hello World!");
	}

	@After
	public void tearDown() throws Exception {
		this.hw = null;
	}

	@Test
	public void testHelloWolrd() {
		assertEquals("Hello World!", hw.helloWorld());
	}
	
	@Test
	public void testThenReturn() {
		when(mocked.helloWorld()).thenReturn("Za Warudo!");
		assertEquals("Za Warudo!", mocked.helloWorld());
	}
	
	@Test
	public void testCheckMocked() {
		when(mocked.helloWorld()).thenReturn("Za Warudo!");
		assertNotEquals("Hello World!", mocked.helloWorld());
	}
		
	@Test
	public void testVerify() {
		mocked.helloWorld();
		verify(mocked).helloWorld();
	}
	
	@Test
	public void testVerifyTimes() {
		mocked.helloWorld();
		verify(mocked, times(1)).helloWorld();
	}
}