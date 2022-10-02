//PASO POR VALOR POR REFERENCIA 
package PasoPorValor;

import Clases.Persona;//IMPORTAMOS LA CLASE PERSONA DEL PAQUETE CLASES 

/**
 * @author JORGE
 */
public class pasoPorReferencia {
    public static void main(String[] args) {
        Persona obj = new Persona();//creamos el obejto "obj"
        obj.nombre = "juan";
        System.out.println("obj.nombre = " + obj.nombre);
        //INTENTAREMOS CAMBIAR EL VALOR DE NOMBRE 
        cambiaValor(obj);//estamos pasando el lugar donde se almacena los datos del objeto "obj" pasa a la variable 
        //creada llamada "persona " de la funcion de cambiarValor
        System.out.println("cambio de nombre = " + obj.nombre);
        
        //OTRA FORMA DE CAMBIAR EL VALOR DE NOMBRE 
        obj = cambiaValor2(obj);
        System.out.println("cambio de nombre = " + obj.nombre);
    }                            
    
                             //Definimos un argumento de tipo persona 
    public static void cambiaValor (Persona obj2){//"obj2" es una variable clonada de "obj"
        obj2.nombre="karla";//por lo tanto podemos cambiar los datos del nombre 
    }
    
    //OTRA FORMA DE CAMBIAR EL VALOR DEL NOMBRE ES 
                             //Definimos un argumento de tipo persona 
    public static Persona cambiaValor2 (Persona obj3){//"obj3" es una variable clonada de "obj"
        if (obj3 == null){//Este es un ejemplo de como podemos utilizar 2 return 
            System.out.println("Valor de persona invalido: null");
            return null;//este return se utilizara cuando persona = null 
        }
        obj3.nombre="jose";// cambiamos los datos del nombre
        return obj3;//retornamos el "obj3" y pasamos a "obj" para que se cambie el valor 
        //return tambien puede regresar referencias de objeto
        
    }
}
