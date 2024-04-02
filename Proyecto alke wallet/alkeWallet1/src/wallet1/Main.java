package wallet1;

import clases.CuentaBancaria;
import clases.Dolar;
import clases.Euro;

public class Main {
    public static void main(String[] args) {
        /**
         *  Crear instancias de Dolar y Euro con los factores de conversión
         */
        Dolar dolar = new Dolar("Dolar", 1078.27);
        Euro euro = new Euro("Euro", 926.90);

        /**
         *  Crear instancias de CuentaBancaria con diferentes monedas
         */
        CuentaBancaria cuentaDolar = new CuentaBancaria("Carlos Bravo", 4020, 10000.0, dolar);
        CuentaBancaria cuentaEuro = new CuentaBancaria("Carlos Bravo", 4050, 20000.0, euro);

        /**
         *  Mostrar información de las cuentas con los factores de conversión
         */
        System.out.println("\nInformación de la cuenta en Dólares:");
        cuentaDolar.obtenerInformacion();
        System.out.println("Factor de conversión a Euros: 1 Dólar = " + dolar.getTipoCambio() + " Euros");

        System.out.println("\nInformación de la cuenta en Euros:");
        cuentaEuro.obtenerInformacion();
        System.out.println("Factor de conversión a Dólares: 1 Euro = " + euro.getTipoCambio() + " Dólares");

        /**
         *  Realizar algunas operaciones en las cuentas
         */
        cuentaDolar.depositar(5000.0);
        cuentaEuro.retirar(1000.0);

        /**
         *  Mostrar información actualizada de las cuentas
         */
        System.out.println("\nInformación de la cuenta en Dólares después de operaciones:");
        cuentaDolar.obtenerInformacion();

        System.out.println("\nInformación de la cuenta en Euros después de operaciones:");
        cuentaEuro.obtenerInformacion();

        /**
         *  Convertir el saldo de la cuenta en Dólares a Euros
         */
        double saldoEnDolares = cuentaDolar.getSaldo();
        double saldoConvertidoAEuros = dolar.convertirADolares(saldoEnDolares);
        System.out.println("\nSaldo convertido a Euros: " + saldoConvertidoAEuros);
    }
}