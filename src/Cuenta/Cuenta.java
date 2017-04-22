package Cuenta;

public class Cuenta {

	/**
	 * último código de cuenta asignado. Común a todas las cuentas
	 */
	static int ultimoCodigo;
	/**
	 * Identificador único de cada cuenta. Se genera en el constructor
	 * automáticamente a partir del contado ultimoCodigo
	 */
	int codigo;
	int saldo = 100;

	Cuenta(int saldoInicial) {
		codigo = ++ultimoCodigo;
		this.saldo = saldoInicial;
	}

	public void reintegro(int cantidad) {
		if (cantidad > saldo) {
			System.out.println("\tERROR. No se ha podido realizar el reintegro");
			return;
		}
		saldo -= cantidad;
	}

	public void ingreso(int cantidad) {
		saldo += cantidad;
	}

	public int getSaldo() {
		return saldo;
	}

	void transferencia(int dinero, Cuenta cuenta) {
		if (saldo < dinero) {
			System.out.println("\tERROR. No se ha podido realizar la transferencia.");
			return;
		}
		setSaldo(this.saldo - dinero);
		cuenta.setSaldo(cuenta.getSaldo() + dinero);

	}

	private void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	void mostrar() {
		System.out.println("Cuenta: " + codigo + ", " + saldo + ", ");
	}

	void mostrar(String mensaje) {
		System.out.println(mensaje + "Cuenta: " + codigo + ", " + saldo + ", ");
	}

}