
package app_Dominio;
import Dominio_Encapsulamiento_Set_yGet.Persona;//CON ESTO SOLO ESTAMOS IMPORTANDO LA CLASE PERSONA 
//PERO SI PONEMOS "*" IMPORTAREMOS TODAS LAS CLASES DEL PAQUETE

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona obj=new Persona("jose", 5000.0, false);
        System.out.println(" Nombre : " + obj.getNombre());
        
        
        //obj.nombre="jose";  //COMO TENEMOS SET Y GET YA NO SE PUEDE MODIFICAR DE ESTA FORMA POR QUE SON PRIVADOS 
         
        //PERO ES LA FORMA LA CUAL SI SE PUEDE MODIFICAR LOS DATOS CON EL SET
        obj.setNombre("juan carlos");
        
        //COMO SE PUEDE VER TAMPOCO SE PUEDE IMPRIMIR DE ESTA FORMA POR QUE ES PRIVADO 
        //System.out.println("obj.nombre = " + obj.nombre); 
        
        //PERO ESTA ES LA FORMA ADECUADA PARA HACERLO CON EL GET 
        System.out.println(" Nombre con cambio: " + obj.getNombre());
        System.out.println(" Sueldo : " + obj.getSueldo());
        System.out.println(" Eliminado : " + obj.isElimindo());
    }
}
