
package SobreCargaDeMetodos;

public class pruebaOperaciones {
    public static void main(String[] args) {
        //DE TIPO INT 
        int resultado = Operaciones.sumar(5, 5);
        System.out.println("resultado = " + resultado);
        
        //DE TIPO DOUBLE 
        double resultado2 = Operaciones.sumar(2, 3);
        System.out.println("resultado2 = " + resultado2);
        
        //el 3L es de tipo long pero int no es compatbible pero si el double
        double resultado3 = Operaciones.sumar(2, 3L);
        System.out.println("resultado3 = " + resultado3);
        
    }
}
