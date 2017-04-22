package pila;

import org.junit.*;
import org.junit.Test;

public class PilaTest {
	Pila<Persona> p = new Pila<Persona>();
	
	@After
	public void testStart() {
		p = null;
	}
	
	@Before
	public void testEnd() {
		p = new Pila<Persona>();
	}	
	
	
	@Test
	public void testPush() {
		p.push(new Persona("Fran", "Budau"));
		Assert.assertFalse(p.IsEmpty());
	}

	@Test
	public void testPop() {
		p.pop();
		Assert.assertTrue(p.IsEmpty());
	}

	@Test
	public void testShow() {
		p.show();
	}

	@Test
	public void testIsEmpty() {
	}

}
