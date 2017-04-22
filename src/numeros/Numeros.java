package numeros;


public class Numeros {

	Numeros() {
	}

	/*
	 * Comprueba si un numero es primo
	 */

	public boolean primo(int num) {
		boolean bandera = true;
		for (int i = 2; i < num / 2 + 1; i++) {
			if (num % i == 0)
				bandera = false;
		}
		return bandera;
	}

	/*
	 * Devuelve el resultado de elevar un número a un exponente
	 */

	public String potencia(int base, int exponente) {
		int total = 1;
		if (base == 0 && exponente == 0)
			return "Indeterminación";
		else {
			for (int i = 1; i <= exponente; i++)
				total = total * base;
			return total + "";
		}
	}

	/*
	 * Devuelve la secuencia de Fibonacci de un número
	 */

	public int Fibonacci(int num) {
		int ant1 = 1;
		int ant2 = 0;
		int actual = 0;
		if (num == 0 || num == 1)
			return num;
		for (int i = 2; i <= num; i++) {
			actual = ant1 + ant2;
			ant2 = ant1;
			ant1 = actual;
		}
		return actual;
	}

	/*
	 * Devuelve si un número es perfecto. Un número es perfecto cuando es igual
	 * a la suma de sus divisores propios positivos, sin incluirse él mismo Ej:
	 * 6 Es Perfecto, sus divisores 1,2,3. 6=1+2+3.
	 */

	public boolean perfecto(int num) {
		int suma = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0)
				suma = suma + i;
		}
		if (suma == num)
			return true;
		else
			return false;
	}

}
