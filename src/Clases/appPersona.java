
package Clases;

/**
 * @author JORGE
 */
public class appPersona {
    public static void main(String[] args) {
        Persona persona1=new Persona();//creamos el objeto persona y añadimos a la variable persona1
        persona1.nombre = "JUAN";//ASIGNAMOS NOMBRE
        persona1.apellido = "PEREZ";
        persona1.desplegarInformacion();//IMPRIMIMOS LOS DATOS 
        System.out.println("\n");
        
        Persona persona2 = new Persona();
        //CON ESTO MUESTRA EL LUGAR DE LA MEMORIA EN LA CUAL SE ALMACENA LOS OBJETOS
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);
        System.out.println("\n");
        
        //AL IMPRIMIR NOS DARA NULL POR QUE NO DIMOS DATOS A LA VARIABLE PERSONA2
        persona2.desplegarInformacion();
        System.out.println("\n");
        
        
        //ASIGNAMOS VALORES A persona2 
        persona2.nombre = "KARLA";
        persona2.apellido = "LARA";
        persona2.desplegarInformacion();
    }
}
