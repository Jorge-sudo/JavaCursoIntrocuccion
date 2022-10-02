
package Laboratorio1_objetos;

/**
 * @author JORGE
 */
public class appCaja {
    public static void main(String[] args) {
        //OBJETO VACIO, AÑADIMOS DATOS
        Caja obj=new Caja();
        obj.alto = 2;
        obj.ancho = 3;
        obj.profundo = 6;
        obj.calcularVolumen();
        //OBJETOS CON PARAMETROS 
        Caja obj2=new Caja(3, 2, 6);
        obj2.calcularVolumen();
    }
    
}
