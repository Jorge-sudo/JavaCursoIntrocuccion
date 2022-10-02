//RECORDATORIO HAY MEMORIA "STACK" QUE ES DE VARIABLES LOCALES Y "HEAP" QUE SON VARIABLES DE TIPO OBJETO 
package CreacionDeMetodos;

/**
 * @author JORGE
 */
public class Aritmetica {
    //atributos de la clase 
    int a;
    int b;
    
    //CREAMOS CONTRUCTOR VACIO 
    public Aritmetica(){
        System.out.println("EJECUTANDO CONTRUCTOR");
    }
    
    //SOBRECARGA DE CONSTRUCTORES CREAMOS UN CONSTRUCTOR MAS 
    public Aritmetica(int a, int b){//var no esta permitido
        this.a = a;
        this.b = b;
        System.out.println(" Ejecutando constructor con argumentos");
    }
    
    //metodo
    public void sumar(){
        int resultado = a+b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno (){
//        int resultado = a+b;
//        return resultado;
        return this.a + this.b; 
    }
    public int sumarConArgumentos(int a, int b){
        this.a = a;//this nos hace saber que este atributo es de nuestra clase
        this.b = b;//si el argumento a se asigna al atributo this.a
        
//        return a + b;
        return this.sumarConRetorno();
    }
    
}
