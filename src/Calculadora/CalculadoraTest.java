package Calculadora;

import org.junit.*;
import org.junit.Test;

public class CalculadoraTest {
	
	private Calculadora calculadora = new Calculadora();

	/*
	 * Este metodo se ejecuta para cada prueba ANTES de invocar el codigo de cada prueba 
	 */
	@Before
	public void testStart() {

	}
	
	/*
	 * Este metodo se ejecuta para cada prueba DESPUES de invocar el codigo de cada prueba 
	 */
	@After
	public void testEnd() {
		
	}

	@Test
	public void testSumar() {
		Assert.assertEquals(12, calculadora.sumar(12));
	}

	@Test
	public void testRestar() {
		Assert.assertEquals(-9, calculadora.restar(9));

	}

	@Test
	public void testGetResultado() {
		calculadora.sumar(78);
		calculadora.restar(8);
		Assert.assertEquals(70, calculadora.getResultado());
	}

}
