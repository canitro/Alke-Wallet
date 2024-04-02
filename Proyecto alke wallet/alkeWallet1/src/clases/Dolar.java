package clases;

/**
 *  Importa la interfaz Moneda
 */
import wallet.Moneda;

/**
 *  Clase Dolar implementa la interfaz Moneda
 */
public class Dolar implements Moneda {
    /**
     *  Atributos de la clase Dolar
     */
    private String nombre;
    private double tipoCambio;

    /**
     *  Constructor vacío de la clase Dolar
     */
    public Dolar() {
    }

    /**
     *  Constructor con parámetros de la clase Dolar
     * @param nombre
     * @param tipoCambio
     */
    public Dolar(String nombre, double tipoCambio) {
        this.nombre = nombre;
        this.tipoCambio = tipoCambio;
    }

    /**
     *  Implementación de los métodos de la interfaz Moneda
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
         *  Implementa la conversión a otra moneda según el tipo de cambio
         */
        return cantidad * otraMoneda.getTipoCambio();
    }
    @Override
    public double convertirAEuros(double cantidad) {
        /**
         *  Implementa la conversión a euros usando el tipo de cambio del dólar a euros
         */
        return cantidad * (1 / tipoCambio);
    }
    @Override
    public double convertirADolares(double cantidad) {
        /**
         *  No es necesario convertir los dólares a dólares, solo devuelve la cantidad
         */
        return cantidad;
    }

    @Override
    public String nombreMoneda() {
        /**
         *  Devuelve el nombre de la moneda
         */
        return "Dólar";
    }

    /**
     *  Getter para el nombre del Dólar
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *  Setter para el nombre del Dólar
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

 





