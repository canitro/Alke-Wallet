package clases;

import wallet.Moneda;

   /**
    * generamos los atributos CuentaBancaria
    */
    public class CuentaBancaria {
	private String titular;
	private int numeroCuenta;
	private double saldo;
	private Moneda moneda;

	/**
	* constructor vacio
	*/
	public CuentaBancaria() {
	}

    /**
     *  Constructor con parametros 
     * @param titular
     * @param numeroCuenta
     * @param saldo
     * @param moneda
     */
	public CuentaBancaria(String titular, int numeroCuenta, double saldo, Moneda moneda) {
		this.titular = titular;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.moneda = moneda;
	}
	

	public CuentaBancaria(String string, int i, double d) {
		
		
	}

	/**
	 * @return the titular
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * @param titular the titular to set
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * @return the numeroCuenta
	 */
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the moneda
	 */
	public Moneda getMoneda() {
		return moneda;
	}

	/**
	 * @param moneda the moneda to set
	 */
	public void setMoneda(Moneda moneda) {
		this.moneda = moneda;
	}
	/**
	 *  Métodos para depositar, retirar y obtener información de la cuenta
	 * @param cantidad
	 */

	public void depositar(double cantidad) {
		saldo += cantidad;
		System.out.println("Se han depositado " + cantidad + " " + moneda.nombreMoneda() + ". Nuevo saldo: " + saldo
				+ " " + moneda.nombreMoneda());
	}

	public void retirar(double cantidad) {
		if (cantidad <= saldo) {
			saldo -= cantidad;
			System.out.println("Se han retirado " + cantidad + " " + moneda.nombreMoneda() + ". Nuevo saldo: " + saldo
					+ " " + moneda.nombreMoneda());
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}

	public void obtenerInformacion() {
		System.out.println("Titular: " + titular);
		System.out.println("Número de cuenta: " + numeroCuenta);
		System.out.println("Saldo actual: " + saldo + " " + moneda.nombreMoneda());
	}

	/**
	 *  Método para convertir el saldo de la cuenta a otra moneda
	 * @param otraMoneda
	 * @param tipoCambio
	 * @return
	 */
	
	public double convertirSaldo(Moneda otraMoneda, double tipoCambio) {
		return saldo * tipoCambio;
		
	}
}
