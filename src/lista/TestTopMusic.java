package lista;
import utiles.Teclado;


public class TestTopMusic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lista<Cancion> listaTopMusic = new Lista<Cancion>();
		int opcion;
		do {
			menu();
			opcion = recogeEntero(1, 7);
			switch (opcion) {
			case 1:// a�adir
				annadir(listaTopMusic);
				break;
			case 2:// sacar
				if (listaTopMusic.estaVacia()) {
					System.out.println("ERROR. La lista est� vac�a.");
					break;
				}
				sacar(listaTopMusic);
				break;
			case 3:// subir
				if (listaTopMusic.tamanno() < 2) {
					System.out
							.println("ERROR. Ning�n elemento de la lista puede subir.");
					break;
				}
				subir(listaTopMusic);
				break;
			case 4:// bajar
				if (listaTopMusic.tamanno() < 2) {
					System.out
							.println("ERROR. Ning�n elemento de la lista puede bajar.");
					break;
				}
				bajar(listaTopMusic);
				break;
			case 5:// mostrar lista
				listaTopMusic.mostrar();
				break;
			case 6:// mostrar top
				System.out.println(listaTopMusic.buscar(0));
				break;
			}
		} while (opcion != 7);
		System.out.println("Aaaaaaaaaadios.");

	}

	/**
	 * @param listaTopMusic
	 * @return
	 */
	private static void bajar(Lista<Cancion> listaTopMusic) {
		int i;
		i = recogeEntero(1, listaTopMusic.tamanno() - 1,
				"Introduce la posici�n del elemento a bajar, [" + 1 + ","
						+ (listaTopMusic.tamanno() - 1) + "]");

		listaTopMusic.annadir(i + 1, listaTopMusic.buscar(i - 1));
		listaTopMusic.borrar(i - 1);
	}

	/**
	 * @param listaTopMusic
	 * @return
	 */
	private static void subir(Lista<Cancion> listaTopMusic) {
		int i;
		i = recogeEntero(2, listaTopMusic.tamanno(),
				"Introduce la posici�n del elemento a subir, [" + 2 + ","
						+ (listaTopMusic.tamanno()) + "]");

		listaTopMusic.annadir(i - 2, listaTopMusic.buscar(i - 1));
		listaTopMusic.borrar(i);
	}

	/**
	 * @param listaTopMusic
	 * @return
	 */
	private static void sacar(Lista<Cancion> listaTopMusic) {
		int i;
		i = recogeEntero(1, listaTopMusic.tamanno(),
				"Introduce la posici�n del elemento a sacar, [" + 1 + ","
						+ listaTopMusic.tamanno() + "]");
		listaTopMusic.borrar(--i);

	}

	/**
	 * @param listaTopMusic
	 * @return
	 */
	private static void annadir(Lista<Cancion> listaTopMusic) {
		int i;
		i = recogeEntero(1, listaTopMusic.tamanno() + 1,
				"Introduce la posici�n del elemento a introducir, [" + 1 + ","
						+ (listaTopMusic.tamanno() + 1) + "]");

		listaTopMusic.annadir(i - 1, Cancion.pedirDatosCancion());

	}

	static void menu() {
		System.out
				.println("************************************************************");
		System.out
				.println("1. A�adir una canci�n (en una posici�n) al TopMusic.");
		System.out.println("2. Sacar un elemento del TopMusic.");
		System.out.println("3. Subir un puesto en el TopMusic.");
		System.out.println("4. Bajar un puesto en el TopMusic.");
		System.out.println("5. Mostrar la lista TopMusic.");
		System.out.println("6. Mostrar la canci�n m�s escuchada.");
		System.out.println("7. Salir.");

	}

	/**
	 * Recoge un entero por teclado dentro de un rango permitido
	 * 
	 * @param min
	 *            valor m�nimo del rango
	 * @param max
	 *            valor m�ximo del rango
	 * @return entero v�lido introducido por el usuario
	 */
	static int recogeEntero(int min, int max) {
		int i;
		do {
			i = Teclado.leerEntero();
		} while (i < min || i > max);

		return i;
	}

	/**
	 * Recoge un entero por teclado dentro de un rango permitido
	 * 
	 * @param min
	 *            valor m�nimo del rango
	 * @param max
	 *            valor m�ximo del rango
	 * @param msj
	 *            mensaje que se muestra al usuario
	 * 
	 * @return entero v�lido introducido por el usuario
	 */
	static int recogeEntero(int min, int max, String msj) {
		System.out.println(msj);
		return recogeEntero(min, max);

	}

}
