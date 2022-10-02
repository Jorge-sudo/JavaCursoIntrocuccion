//PRUEBA PERSONA
package ContextoEstatico;

public class appPersona {
    private int contador;
    
    public static void main(String[] args) {
        Persona obj=new Persona("Juan");
        System.out.println("obj = " + obj);//como tenemos el toString se imprimira todos los datos 
                                           //con solo llammar al "obj"
        Persona obj2=new Persona("Karla");//como creamos el objeto 2 el contador idPersona sera 2 
        System.out.println("obj2 = " + obj2);//La variable static es quien logra esto porque se
                        //se asocia con la clase y no con los objetos pero si no es static el contador se queda en 1
        System.out.println("");      
        //imprimiremos utilizando el metodo imprimir 
        imprimir(obj);//recordar que en un contexto statico no se puede utilizar this 
        imprimir(obj2);
        
        //imprimir getContador
        appPersona obj3=new appPersona();
        System.out.println(obj3.getContador());
    }
    //EL METODO IMPRIMIR DEBE SER STATIC PARA QUE SE LE PUEDA LLAMAR DESDE EL METODO MAIN
    public static void imprimir(Persona obj){
        System.out.println("Desde imprimir = " + obj);
    }
    
    //Asi es como se puede accederde un metodo dinamico a un metodo statico 
    public int getContador(){
        imprimir(new Persona("antonio"));//con esto podemos cambiar la variable de nombre = antonio 
        return this.contador;
    }
}
