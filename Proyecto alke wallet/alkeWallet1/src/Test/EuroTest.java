package Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import clases.Dolar;
import clases.Euro;

public class EuroTest {

    @SuppressWarnings("unused")
	@Test
    public void testConvertirADolares() {
        /**
         *  Crear una instancia de Euro con un valor de 100 euros
         */
        Euro euro = new Euro("Euro", 1.0);
        double cantidadEuros = 100.0;

        /**
         *  Crear una instancia de Dolar con un tipo de cambio de 1.15 dólares por euro
         */
        Dolar dolar = new Dolar("Dólar", 1.15);

        /**
         *  Convertir 100 euros a dólares utilizando el método convertirADolares()
         */
        double cantidadDolares = euro.convertirADolares(cantidadEuros);

        /**
         *  El resultado esperado es 115 dólares (100 euros * 1.15)
         */
        double resultadoEsperado = 115.0;

        /**
         *  Verificar que la conversión se realizó correctamente
         */
        assertEquals(resultadoEsperado, cantidadDolares, 30);
    }
}