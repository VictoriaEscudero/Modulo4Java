package alkewallet;


public class CuentaPeso extends Cuenta{

    private double maxDeposito;
    private double depositoActual;

    public CuentaPeso() {
        super();
        this.maxDeposito = 7000000;
        this.depositoActual = 0;
    }

    @Override
    public boolean depositar(double deposito) {
        if (maxDeposito < (depositoActual+deposito)){
            System.out.println("Depósito fallido, intente nuevamente con un monto menor");
            return false;
        }
        balance += deposito;
        depositoActual += deposito;
        System.out.println("Depósito realizado con éxito");
        return true;
    }

    @Override
    public boolean retirar(double retiro) {
        if (balance < retiro){
            System.out.println("Retiro fallido, intente nuevamente con un monto menor");
            return false;
        }
        balance -= retiro; //Se realiza un cobro de $200 por retirar dinero
        System.out.println("Retiro realizado con éxito");
        return true;
    }

    public void resetSaldo(){
        depositoActual = 0;
    }
}