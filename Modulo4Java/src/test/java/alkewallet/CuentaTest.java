package alkewallet;

import org.junit.Test;

import static org.junit.Assert.*;

public class CuentaTest {
    private final Cuenta cuenta = new Cuenta() {
        //Se implementan los métodos por ser una clase abstracta
        @Override
        public boolean depositar(double deposito) {
            return false;
        }

        @Override
        public boolean retirar(double retiro) {
            return false;
        }
    };
    @Test //Testeo para saber si el balance se inicializa en $0.0
    public void testCliente() {
        Cliente cliente = new Cliente("Victoria", "Escudero", "12345678-9","asdf1234");
        double balance = cuenta.getBalance();
        assertEquals(0.0, balance, 1);
    }
}
