package alkewallet;


import java.util.Random;
/**
 * @author Victoria
 */
public abstract class Cuenta {
    protected int numero;
    protected double balance;

    public Cuenta() {
        super();
        this.numero = new Random().nextInt(100000000)+1000000;
        this.balance = 0;
    }

    /**
     *
     * @param deposito
     * @return boolean
     */
// Dos métodos principales de la clase abstracta
    public abstract boolean depositar(double deposito);
    public abstract boolean retirar(double retiro);

    @Override
    public String toString() {
        return String.format("****%12s%-12s%12s%-12s****\n", "N° Cta: ",
                Integer.toString(numero), "Balance: ", Double.toString(balance));
    }

    /**
     *
     * @return int
     */
    public int getNumero() {
        return numero;
    }

    /**
     *
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     *
     * @return double
     */
    public double getBalance() {
        return balance;
    }

    /**
     *
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
