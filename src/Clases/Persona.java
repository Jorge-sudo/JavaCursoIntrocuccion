
package Clases;
//ATRIBUTOS Y METODOS DE UNA CLASE EN JAVA 
/**
 * @author JORGE
 */
public class Persona {
    //definimos los atributos de la clase
    public String nombre;
    public String apellido;//en este caso estamos poniendo public para que sea publico
    //y se pueda modoficar desde otra clase de otro paquete 
    
    public void desplegarInformacion(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
    }
    
}
