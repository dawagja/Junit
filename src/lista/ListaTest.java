package lista;

import org.junit.*;


public class ListaTest {

	private Lista<Cancion> mimusica;
	Cancion cancion1 = new Cancion("Blue moon", "Frank Sinatra", "2017");
	Cancion cancion2 = new Cancion("Centipede", "Knife Party", "2007");

	@Before
	public void iniciarLista() {
		mimusica = new Lista<Cancion>();
	}

	@After
	public void limpiarLista() {
		mimusica = null;
	}

	@Test
	public void introducirElemento() {
		mimusica.annadir(cancion1);
		mimusica.annadir(cancion2);
		mimusica.annadir(2, new Cancion());
		Assert.assertEquals(cancion1, mimusica.buscar(0));
		Assert.assertEquals(cancion2, mimusica.buscar(1));
		Assert.assertEquals("\nCancion []", mimusica.buscar(2).toString());
	}

	@Test
	public void introducirElementoConIndice() {
		mimusica.annadir(0, cancion1);
		mimusica.annadir(1, cancion2);
		Assert.assertEquals(cancion1, mimusica.buscar(0));
		Assert.assertEquals(cancion2, mimusica.buscar(1));
	}

	@Test
	public void modificarElemento() {
		mimusica.annadir(cancion1);
		Assert.assertTrue(mimusica.modificar(0, cancion2));
	}

	@Test
	public void comprobarTamanno() {
		mimusica.annadir(cancion1);
		mimusica.annadir(cancion2);
		Assert.assertEquals(2, mimusica.tamanno());
	}

	@Test
	public void borrarElemento() {
		mimusica.annadir(cancion1);
		mimusica.annadir(cancion2);
		Assert.assertTrue(mimusica.borrar(1));
		Assert.assertTrue(mimusica.borrar(0));
	}

	@Test
	public void buscarElementoPosicion() {
		mimusica.annadir(cancion1);
		mimusica.annadir(cancion2);
		Assert.assertEquals(cancion1, mimusica.buscar(0));
		Assert.assertEquals(cancion2, mimusica.buscar(1));
	}

	@Test
	public void buscarElemento() {
		mimusica.annadir(cancion1);
		mimusica.annadir(cancion2);
		Assert.assertEquals(cancion1, mimusica.buscar(0));
	}

	@Test
	public void listaVacia() {
		mimusica.annadir(cancion1);
		Assert.assertFalse(mimusica.estaVacia());
		mimusica.borrar(cancion1);
		Assert.assertTrue(mimusica.estaVacia());
	}

}
