
package Vectores;

public class testArreglos {
    public static void main(String[] args) {
        int edades[]=new int[3];//CREAMOS EL ARREGLO O VECTOR EN JAVA
        System.out.println(" memoria del vector = " + edades);//con esto se puede ver el lunar de la memoria del vector 
        
        //MODIFICAMOS EL INDICE 0 DEL VECTOR Y LE DAMOS EL VALOR DE 10
        edades[0]=10; 
        edades[1]=5;
        edades[2]=15;
        
        System.out.println("edades = " + edades[0]);
        
        //edades[3]=5;no nos marca error pero nos marcara error al ejecutar por que sobrepasamos el limite que es 2
      
                    //length=3  quiere decir que recorrera hasta el largo el maximo del vector
        for(int i=0;i<edades.length;i++){
            System.out.println("edades elemento "+i+" : "+edades[i]);
        }
        System.out.println("\n\n");
        
        
        
        //Tambien podemos agregar valores directamente al vector
        String frutas[]= {"naranja", "platano", " uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas = " + frutas[i]);
        }
        
        
       
  
        System.out.println("\n\n  \tVECTORES CON OBJETOS");
            //CREAMOS UN OBJETO PERSONA VAMOS A UTILIZARLO CON VECTORES
            
        //creamos este arreglo(vector) de objeto de tipo persona 
        PersonaVectorObjetos personas[]=new PersonaVectorObjetos[2]; 
        
        //Le damos valor a los elementos
        personas[0]= new PersonaVectorObjetos("Juan");
        personas[1]= new PersonaVectorObjetos("Karla");
        
        //AQUI SE EJECUTARA EL toString y mostrata sus valores y lugares de memoria
        System.out.println(" personas[0] = "+personas[0]);
        System.out.println(" personas[1] = "+personas[1]);
        
        System.out.println("\n\n");
        
        for(int i=0; i < personas.length;i++){
            //IMPRIMIMOS LOS NOMBRES DE LOS OBJETOS 
            System.out.println("personas  " + i +" = "+ personas[i].getNombre());
        }
        
    }
    
}
