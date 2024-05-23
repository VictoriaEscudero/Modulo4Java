package alkewallet;


import java.util.LinkedList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String apellido;
    private String rut;
    private String password;
    private List<Cuenta> cuentas;

    public Cliente(String nombre, String apellido, String rut, String password) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.password = password;
        cuentas = new LinkedList<Cuenta>(){
            @Override
            public String toString() {
                String result = new String();
                for(int i = 0;i < cuentas.size(); i++){
                    result += cuentas.get(i);
                }
                return result;
            }
        };
    }

    //metodo para agregar cuentas al cliente
    public void addCuenta(Cuenta cuenta){
        cuentas.add(cuenta);
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    @Override
    public String toString() {
        return String.format("********************************************************\n"+
                "****%12s%-12s%12s%-12s****\n", "Nombre: ", nombre, "Apellido: ", apellido)+
                String.format("****%12s%-12s%12s%-12s****\n", "Rut: ", rut, "Password: ", password)+
                "********************************************************\n"+
                cuentas +
                "********************************************************\n";
    }
}
