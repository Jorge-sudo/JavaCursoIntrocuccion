
package Herencia;
import java.util.Date;

public class ClienteHija extends Persona{

    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;
    

    public ClienteHija( Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);//La clase padre debe ser inicializada primero si o si 
        this.idCliente = ++ClienteHija.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }
    
    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    
    @Override
    public String toString() {
        StringBuilder obj = new StringBuilder();
        //Utilizando el metodo append podemos concatenar informacion de la cadena 
        //pero de manera distinta y mas rapida
        obj.append(" Cliente { idCliente = ").append(this.idCliente);
        obj.append(", fechaRegistro = ").append(this.fechaRegistro);
        obj.append(", vip = ").append(this.vip);
        //con super.toString podemos ingresar a los atributos de la clase padre
        obj.append(", ").append(super.toString());
        obj.append("}");
        return obj.toString();//devolvemos el metodo toString para que se imprima la cadena 
    }
 
}
