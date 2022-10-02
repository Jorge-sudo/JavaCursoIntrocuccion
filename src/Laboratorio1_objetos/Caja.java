
package Laboratorio1_objetos;

/**
 * @author JORGE
 */
public class Caja {
    //CREAMOS LOS ATRIBUTOS
    int ancho;
    int alto;
    int profundo;
    
    //CREAMOS CONSTRUCTOR VACIO 
    public Caja(){

    }
    //CREAMOS CONSTRUCTOR CON ARGUMENTOS
    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    //CREAMOS EL METODO QUE NOS AYUDARA A CALCULAR EL VOLUMEN DE LA CAJA
    public void calcularVolumen(){
        int volumen = alto * ancho * profundo;
        System.out.println("volumen = " + volumen);
    }
    
}
