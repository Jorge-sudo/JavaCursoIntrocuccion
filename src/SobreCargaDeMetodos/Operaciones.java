
package SobreCargaDeMetodos;

public class Operaciones {
    
    //CREMOS METODO SUMAR 
    public static int sumar(int a, int b){
        System.out.println("sumar(int a, int b)");
        return a + b; 
    }
    //Y ESTO SERIA LA SOBRE CARGA DEL METODO SUMAR
    public static double sumar(double a, double b){
        System.out.println("sumar(double a, double b)");
        return a + b;
    }
}
