package cola;

import java.util.ArrayList;

public class Cola<T> {

	private ArrayList<T> cola = null;

	Cola() {
		cola = new ArrayList<T>();
	}

	/**
	 * A�ade un elemento a la cola
	 * 
	 * @param element
	 *            elemento a a�adir
	 */
	void enqueue(T element) {
		cola.add(element);
	}

	/**
	 * Retira/elimina la cabeza de la cola
	 * 
	 * @return cabeza de la cola
	 */
	T dequeue() {
		/*
		 * if (cola.size() == 0) return null;
		 */
		return cola.remove(0);
	}

	/**
	 * Devuelve la cabeza de la cola
	 * 
	 * @return cima de la cola
	 */
	T front() {
		/*
		 * if (cola.size() == 0) return null;
		 */
		return cola.get(0);

	}

	/**
	 * Muestra la cola
	 */
	
	/*void show() {
		System.out.println(cola);
	}
	*/
	
	/* Muestra la lista para la prueba de caja negra*/
	String show() {
		return cola.toString();
	}

	/**
	 * Devuelve si la cola est� vac�a
	 * 
	 * @return true si la cola est� vac�a
	 */
	boolean IsEmpty() {
		if (cola.size() == 0)
			return true;
		return false;
	}
}
