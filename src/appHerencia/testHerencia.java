
package appHerencia;

import Herencia.ClienteHija;
import Herencia.EmpleadoHija;
import java.util.Date;


public class testHerencia {
    public static void main(String[] args) {
        //CLASE EMPLEADO
        EmpleadoHija empleado1=new EmpleadoHija("Juan", 5000.0);
        System.out.println("empleado1 = " + empleado1);
        //CLASE CLIENTE                     //new Date() NOS DARA LA HORA Y FECHA ACTUAL
        ClienteHija cliente1=new ClienteHija(new Date(), true, "juan", 'M', 28, "Achumani");
        System.out.println("cliente1 = " + cliente1);
    }
}
