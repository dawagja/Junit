package Cuenta;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class CuentaTest {
	
	private Cuenta cuenta;

	/*
	 * Este metodo se ejecuta para cada prueba DESPUES de invocar el codigo de cada prueba 
	 */
	@After
	public void testStart() {
		cuenta = new Cuenta(100);
	}
	
	@After
	public void testEnd() {
		cuenta = null;
	}


	@Test
	public void testSaldoInicial() {
		Assert.assertEquals(cuenta.saldo, cuenta.getSaldo());
	}

	@Test
	public void testReintegro() {
		
	}

	@Test
	public void testIngreso() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSaldo() {
		fail("Not yet implemented");
	}

	@Test
	public void testTransferencia() {
		fail("Not yet implemented");
	}

	@Test
	public void testMostrar() {
		fail("Not yet implemented");
	}

	@Test
	public void testMostrarString() {
		fail("Not yet implemented");
	}

}
