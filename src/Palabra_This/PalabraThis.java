
package Palabra_This;

/**
 * @author JORGE
 */
public class PalabraThis {
    public static void main(String[] args) {
        Persona obj=new Persona("Juan", "Perez");
        System.out.println("obj = " + obj);
        System.out.println("obj.nombre = " + obj.nombre);
        System.out.println("obj.apellido = " + obj.apellido);
    }
}
//ESTA CLASE Y SU CONSTRUCTOR NO SE PODRA UTILIZAR DESDE OTRO PAQUETE YA QUE ESTA FUERA DE 
//public class  POR LO TANTO ES COMO SI ESTARIA FUERA DEL PAQUETE PALABRA THIS
class Persona{
    String nombre;
    String apellido;
    //COMO ESTAMOS FUERA DE MAIN EL CONSTRUCTOR VACIO NO SE AGREGA 
    
    //CONSTRUCTOR CON ARGUMENTOS
    Persona(String nombre, String apellido){
        //super(); llamada implicita de la clase padre (objet)
        
        this.nombre=nombre;
        this.apellido=apellido;
        
        System.out.println("objeto persona usando this: "+this);
        //con this podemos imprimir la rteferencia de donde esta almacenada el objeto posicion de memoria
        
        //ya no usaremos Imprimir obj=new Imprimir();
        new Imprimir().imprimir(this);
    }
}

class Imprimir{
    public Imprimir(){
        super();//Este es el constructor vacio no es necesario 
        //es de la clase objet (padre)para reservar memoria
    }
    public void imprimir(Persona obj){
        System.out.println("imprimir desde imprimir: "+ obj);
        System.out.println("imprimir del objeto actual (this)"+this);
        //el operador this va apuntando segun al objeto que se esta ejecutando en el momento 
        //Si el this se cambia de clase cambia de objeto el "this" 
    }
}
