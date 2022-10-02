
package CreacionDeMetodos;

/**
 *
 * @author JORGE
 */
public class appAritmetica {
    public static void main(String[] args) {
            //VARIABLES LOCALES 
        int a = 10;
        int b = 2;
        
        miMetodo();
        
        //CONSTRUCTOR VACIO 
        Aritmetica obj=new Aritmetica();
        System.out.println(" Aritmetica a: "+ obj.a);
        System.out.println(" Aritmetica b: "+ obj.b);
        
        //CONSTRUCTOR CON ARGUMENTOS
        Aritmetica obj2=new Aritmetica(5, 8);
        System.out.println("\n Aritmetica a: "+ obj2.a);
        System.out.println(" Aritmetica b: "+ obj2.b);
        
            // NULL ANULA EL OBJETO
        //obj = null;// ESTO ES PARA QUE EL RECOLENTOR DE BASURA LO BORRE (anulamos el obejto)
        //System.gc();//ESTE ES EL LIMPIADOR DE BASURA PERO NO FUNCIONA SOLO CON ESTE CODIGO
        
//        obj.a = 3;
//        obj.b = 2;
//        obj.sumar();
//        
//        int resultado = obj.sumarConRetorno();
//        System.out.println("resultado desde appAritmetica = " + resultado);
//        
//        resultado = obj.sumarConArgumentos(5,8);
//        System.out.println("Resultado usando argumentos = " + resultado );
        
    }
    public static void miMetodo(){
        //La variable se destruye en el metodo main es por eso que no se puede utilizar
        //a = 10;
        System.out.println("Otro metodo");
    }
}
