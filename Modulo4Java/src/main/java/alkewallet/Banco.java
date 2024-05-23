package alkewallet;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        var cliente = new Cliente("Victoria", "Escudero", "12345678-9", "asdf1234");
        var cuentaPeso = new CuentaPeso();

        //Se agregan las cuentas
        cliente.addCuenta(cuentaPeso);

        String bienvenida = """
                ********************************************************
                ****   Bienvenida a Billetera Digital ALKEWALLET    ****""";
        String menu = """
                ********************************************************
                **** Por favor, seleccione opción:                  ****
                ****                                                ****
                ****      (1) Balance                               ****
                ****      (2) Depositar                             ****
                ****      (3) Retirar                               ****
                ****      (4) Convertir divisas                     ****
                ****      (0) Salir                                 ****
                ********************************************************""";
        String moneda = """
                ********************************************************
                **** Seleccione tipo de moneda:                     ****
                ****                                                ****
                ****      (1) Dólares                               ****
                ****      (2) Euros                                 ****
                ********************************************************""";

        System.out.println(bienvenida);
        boolean continuar = true;
        while (continuar) {
            System.out.println(menu);
            Scanner leer = new Scanner(System.in);
            int opcion = leer.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("Sesión cerrada");
                    continuar = false;
                    break;
                case 1:
                    System.out.println(cliente);
                    break;
                case 2:
                    System.out.println("Ingrese monto a depositar");
                    Scanner deposito = new Scanner(System.in);
                    double montoDeposito = deposito.nextDouble();
                    cuentaPeso.depositar(montoDeposito);
                    break;
                case 3:
                    System.out.println("Ingrese monto a retirar");
                    Scanner retiro = new Scanner(System.in);
                    double montoRetiro = retiro.nextDouble();
                    cuentaPeso.retirar(montoRetiro);
                    break;
                case 4:
                    System.out.println("Ingrese monto a convertir");
                    Scanner convertir = new Scanner(System.in);
                    double montoConversion = convertir.nextDouble();
                    System.out.println(moneda);
                    Scanner monedaFinal = new Scanner(System.in);
                    int monedaResultante = monedaFinal.nextInt();
                    if (monedaResultante == 1) {
                        montoConversion /= 888;
                        System.out.printf("La cantidad en dólares es de: $%.2f USD\n", montoConversion);
                    } else if (monedaResultante == 2) {
                        montoConversion /= 964;
                        System.out.printf("La cantidad en Euros es de: $%.2f EUR\n", montoConversion);
                    } else {
                        System.out.println("Ingrese un tipo de moneda válido");
                    }
                    break;
                default:
                    System.out.println("Has ingresado un valor inválido");
                    break;
            }
        }
    }
}