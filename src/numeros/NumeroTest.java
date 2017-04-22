package numeros;

import org.junit.*;


public class NumeroTest {
	Numeros numero;
	
	@Before
	public void iniciarNumero() {
		numero = new Numeros();
	}
	
	@After
	public void limpiarNumero() {
		numero = null;
	}
	

	public void pruebaPrimo() {
		Assert.assertTrue(numero.primo((3)));
		Assert.assertTrue(numero.primo((11)));
		Assert.assertTrue(numero.primo((6)));
		Assert.assertTrue(numero.primo((9)));
		Assert.assertTrue(numero.primo((5)));
		Assert.assertTrue(numero.primo((97)));
		Assert.assertTrue(numero.primo((12721)));
	}

	@Test
	public void pruebaPotencia() {
		Assert.assertEquals("4", numero.potencia(2, 2));
		Assert.assertEquals("27", numero.potencia(3, 3));
		Assert.assertEquals("1", numero.potencia(1, 1));
		Assert.assertEquals("8", numero.potencia(2, 3));
		Assert.assertEquals("Indeterminacion", numero.potencia(0, 0));
	}

	@Test
	public void testPotencia() {
		Assert.assertEquals("4", numero.potencia(2, 2));
		Assert.assertEquals("8", numero.potencia(2, 3));
		Assert.assertEquals("9", numero.potencia(3, 2));
		Assert.assertEquals("Indeterminación", numero.potencia(0, 0));
	}

	@Test
	public void testFibonacci() {
		Assert.assertEquals(1, numero.Fibonacci(1));
		Assert.assertEquals(0, numero.Fibonacci(0));
		Assert.assertEquals(1, numero.Fibonacci(2));
		Assert.assertEquals(13, numero.Fibonacci(7));
	}

	@Test
	public void testPerfecto() {
		numero.perfecto(6);
		Assert.assertEquals(true, 6);
		numero.perfecto(7);
		Assert.assertEquals(false, 7);
	}
	
}