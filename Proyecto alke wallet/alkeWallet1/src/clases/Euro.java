package clases;

/**
 *  Importamos la interfaz Moneda
 */
import wallet.Moneda;

/**
 * Clase Euro implementa la interfaz Moneda
 */
public class Euro implements Moneda {

	/**
	 * Atributos de la clase Euro
	 */
	private String nombre;
	private double tipoCambio;

	/**
	 * Constructor vacío de la clase Euro
	 */
	public Euro() {
	}

	/**
	 * Constructor con parámetros de la clase Euro
	 * 
	 * @param nombre
	 * @param tipoCambio
	 */
	public Euro(String nombre, double tipoCambio) {
		this.nombre = nombre;
		this.tipoCambio = tipoCambio;
	}

	/**
	 * Implementación de los métodos de la interfaz Moneda
	 */
	@Override
	public double getTipoCambio() {
		return tipoCambio;
	}

	@Override
	public void setTipoCambio(double tipoCambio) {
		/**
		 * establece el tipo de cambio
		 */
		this.tipoCambio = tipoCambio;
	}

	@Override
	public double convertir(double cantidad, Moneda otraMoneda) {
		/**
		 * Implementa la conversión a otra moneda según el tipo de cambio
		 */
		return cantidad * otraMoneda.getTipoCambio();
	}

	@Override
	public double convertirAEuros(double cantidad) {
		/**
		 * No es necesario convertir los euros a euros, solo devuelve la cantidad
		 */
		return cantidad;
	}

	@Override
	public double convertirADolares(double cantidad) {
		/**
		 * Implementa la conversión a dólares usando el tipo de cambio del euro a
		 * dólares
		 */
		return cantidad * tipoCambio;
	}

	@Override
	public String nombreMoneda() {
		/**
		 * Devuelve el nombre de la moneda
		 */
		return "Euro";
	}

	/**
	 * Getter para el nombre del Euro
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter para el nombre del Euro
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
