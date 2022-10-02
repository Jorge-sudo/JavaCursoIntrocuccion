
package PasoPorValor;

/**
 * @author JORGE
 */
public class PasoPorValor {
    
    public static void main(String[] args) {
        int x =10;
        System.out.println("x = " + x);
        
        cambioValor(x);//LE ASIGNAMOS EL VALOR DE 10 A arg1
        x = cambioValor1(x);//LE ASIGNAMOS EL VALOR DE 15 A "X" POR EL RETURN
        System.out.println("x nuevo valor = " + x);
    }
    
    public static void cambioValor (int arg1){
        System.out.println("arg1 = " + arg1);
        //EN ESTE CASO arg1 = 15 no se hace cumplir y se destruye 
        arg1 = 15;
    }
    //PARA QUE arg1 SE VALIDE HACEMOS ESTE EJEMPLO
    public static int cambioValor1 (int arg1){
        System.out.println("arg1 1 = " + arg1);
        arg1 = 15;
        return arg1;//Al retornar le damos el valor de "arg1" a "X"
    }
}
