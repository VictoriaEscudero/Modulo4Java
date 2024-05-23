package alkewallet;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CuentaPesoTest {
    private final CuentaPeso cuentaPeso = new CuentaPeso();
    @Test //testeo para saber si el depósito se realiza con éxito con un monto de 1000000
    public void testDepositar() {
        Cuenta cuenta = new Cuenta() {
            @Override
            public boolean depositar(double deposito) {
                return false;
            }

            @Override
            public boolean retirar(double retiro) {
                return false;
            }
        };
        double montoTest = 1000000;
        boolean deposito = cuentaPeso.depositar(montoTest);
        assertEquals(true, deposito);

    }
}