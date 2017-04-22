package cola;

import org.junit.*;


public class ColaTest {

	private Cola<Paciente> c;

	@Before
	public void iniciarCola() {
		c = new Cola<Paciente>();
	}
	
	@After
	public void limpiarCola() {
		c = null;
	}

	@Test
	public void pruebaEnqueue() { 
		c.enqueue(new Paciente("Jose", "Aguilar Granados"));
		c.enqueue(new Paciente("Manolo","Sanchez Cruz"));
		Assert.assertEquals("Jose Aguilar Granados", c.front().toString());
	}

	@Test
	public void pruebaDequeue() {
		c.enqueue(new Paciente("Jose", "Aguilar Granados"));
		c.enqueue(new Paciente("Manolo","Sanchez Cruz"));
		c.enqueue(new Paciente("Andrei","Budau Alexandru"));
		c.dequeue();
		Assert.assertEquals("Manolo Sanchez Cruz",c.front().toString());
	}
	
	@Test
	public void pruebaFront() {
		c.enqueue(new Paciente("Jose", "Aguilar Granados"));
		c.enqueue(new Paciente("Manolo","Sanchez Cruz"));
		c.enqueue(new Paciente("Andrei","Budau Alexandru"));
		Assert.assertEquals("Jose Aguilar Granados", c.front().toString());
	}
	
	@Test
	public void pruebaVacia() {
		Assert.assertTrue(c.IsEmpty());
		c.enqueue(new Paciente("Jose", "Aguilar Granados"));
		c.enqueue(new Paciente("Manolo","Sanchez Cruz"));
		c.enqueue(new Paciente("Andrei","Budau Alexandru"));
		Assert.assertFalse(c.IsEmpty());
		c.dequeue();
		Assert.assertFalse(c.IsEmpty());
		c.dequeue();
		Assert.assertFalse(c.IsEmpty());
		c.dequeue();
		Assert.assertTrue(c.IsEmpty());
	}
	
	@Test
	public void pruebaMostrarCola(){
		c.enqueue(new Paciente("Jose", "Aguilar Granados"));
		c.enqueue(new Paciente("Manolo","Sanchez Cruz"));
		c.enqueue(new Paciente("Andrei","Budau Alexandru"));
		Assert.assertEquals("[Jose Aguilar Granados, Manolo Sanchez Cruz, Andrei Budau Alexandru]",c.show().toString());
	}
	
}