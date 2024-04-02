package Test;

import org.junit.jupiter.api.Test;

import wallet1.Main;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testMain() {
        /**
         *  Creamos un objeto de la clase Main
         */
        @SuppressWarnings("unused")
		Main main = new Main();

        /**
         *  Ejecutamos el método main y verificamos si arroja alguna excepción
         */
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
}