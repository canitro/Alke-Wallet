package wallet;

/**
 *  Interfaz Moneda
 */
public interface Moneda {

	/**
	 * Método para obtener el tipo de cambio de la moneda
	 * 
	 * @return
	 */
	double getTipoCambio();

	/**
	 * Método para establecer el tipo de cambio de la moneda
	 * 
	 * @param tipoCambio
	 */
	void setTipoCambio(double tipoCambio);

	/**
	 * Método para convertir una cantidad de la moneda a otra moneda
	 * 
	 * @param cantidad
	 * @param otraMoneda
	 * @return
	 */
	double convertir(double cantidad, Moneda otraMoneda);

	/**
     * Método para convertir la moneda actual a euros con su factor de conversión
     * 
     * @param cantidad
     * @return
     */
    double convertirAEuros(double cantidad);

    /**
     * Método para convertir la moneda actual a dólares con su factor de conversión
     * 
     * @param cantidad
     * @return
     */
    double convertirADolares(double cantidad);

	
	/**
	 * metodo para obtener el nombre de la moneda
	 * 
	 * @return
	 */
	String nombreMoneda();

}