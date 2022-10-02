
package PalabraFinal;
//En este caso si se puede utilizar extends pero estaria la palabra final en la clase de persona no se podria 
public class FinalEnMetodosEmpleado extends FinalEnMetodosPersona{
    
    @Override //Con esto antes del metodo podemos modificar el metodo imprimir 
    //no se puede modificar por que en metodo imprimir de la clase persona tiene la palabra final
    public void imprimir(){
        System.out.println("Metodo imprimir desde la clase hija ");
    }
    
    
}
