package Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import clases.Dolar;
import clases.Euro;

public class DolarTest {

    @Test
    public void testConvertirADolares() {
        /**
         *  Crear una instancia de Euro con un valor de 100 euros
         */
        @SuppressWarnings("unused")
		Euro euro = new Euro("Euro", 1.0);
        double cantidadEuros = 100.0;

        /**
         * Crear una instancia de Dolar con un tipo de cambio de 0.86 dólares por euro
         */
        Dolar dolar = new Dolar("Dólar", 0.86);

        /**
         *  Convertir 100 euros a dólares utilizando el método convertirADolares()
         */
        double cantidadDolares = dolar.convertirADolares(cantidadEuros);

        /**
         *  El resultado esperado es 86 dólares (100 euros * 0.86)
         */
        double resultadoEsperado = 86.0;

        /**
         *  Verificar que la conversión se realizó correctamente
         */
        assertEquals(resultadoEsperado, cantidadDolares, 50);
    }
}
