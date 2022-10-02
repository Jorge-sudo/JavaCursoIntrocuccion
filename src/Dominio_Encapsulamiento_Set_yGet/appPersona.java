
package Dominio_Encapsulamiento_Set_yGet;

public class appPersona {
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
        
        //METODO TO-STRING
        System.out.println(" OBJ: " + obj);//Cuando ponemos obj y el toString 
                                           //esta en la clase de Persona se llama automaticamente
        //FUNCIONA CON CUALQUIERA DE LAS DOS FORMAS, CON TAL QUE EL toString EN LA CLASE PERSONA
        //LO LLAMA COMO EL "prinln" COMO TAMBIEN EL "print" CUALQUIERA DE LOS DOS 
        System.out.println(" OBJ: " + obj.toString());//pero tambien se le puede llamar asi 
    }
}
