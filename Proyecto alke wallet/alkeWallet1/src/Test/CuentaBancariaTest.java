package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import clases.CuentaBancaria;
import clases.Dolar;
import clases.Euro;

public class CuentaBancariaTest {

    private CuentaBancaria cuenta;

    @Before
    public void setUp() {
        /**
         *  Crear una cuenta bancaria con saldo inicial de 1000 dólares
         */
        Dolar dolar = new Dolar("Dólar", 1.0); // Tipo de cambio 1:1
        cuenta = new CuentaBancaria("Carlos bravo", 4050, 1000.0, dolar);
    }

    @Test
    public void testDepositar() {
        /**
         *  Realizar un depósito de 500 dólares
         */
        cuenta.depositar(500);

        /**
         *  Verificar que el saldo sea igual a 1500 dólares después del depósito
         */
        assertEquals(1500.0, cuenta.getSaldo(), 0.0);
    }

    @Test
    public void testRetirar() {
        /**
         *  Realizar un retiro de 200 dólares
         */
        cuenta.retirar(200);

        // Verificar que el saldo sea igual a 800 dólares después del retiro
        assertEquals(800.0, cuenta.getSaldo(), 0.0);
    }

    @Test
    public void testConvertirSaldo() {
        /**
         *  Crear una cuenta bancaria en euros
         */
        Euro euro = new Euro("Euro", 0.85); // Suponiendo un tipo de cambio de 1 dólar = 0.93 euros
        /**
         *  Convertir el saldo de la cuenta de dólares a euros
         */
        double saldoConvertido = cuenta.convertirSaldo(euro, euro.getTipoCambio());

        /**
         *  Verificar que el saldo convertido sea correcto (1000 dólares * 0.85 = 850 euros)
         */
        assertEquals(850.0, saldoConvertido, 0.0);
    }
}