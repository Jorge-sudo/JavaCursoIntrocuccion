
package ManipulacionDePaquetes;

//import mx.com.globalmentoring.*; //Con el * importamos toas la clases del paquete 
//import mx.com.globalmentoring.Utileria; //Pero tambien se puede importar la clase en especifico

//import mx.com.globalmentoring.Utileria.imprimir;//Recordar tambien que se puede llamar el metodo imprimir

public class testUtileria {
    public static void main(String[] args) {
        //si llamamos al metodo imprimir de la clase Utileria 
        // imprimir (" Adios");  // Solo se le imprime haci.
        
        //tambien se puede imprimir de la siguiente forma
        ManipulacionDePaquetes.Utileria.imprimir(" Hello"); //pero no es recomendable 
        
        Utileria.imprimir(" Hola ");
    }
}
