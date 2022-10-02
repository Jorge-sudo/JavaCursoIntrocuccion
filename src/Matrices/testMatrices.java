
package Matrices;

public class testMatrices {
    public static void main(String[] args) {
        // una matriz funciona asi Matriz[reglones=recto][columnas=abajo]
        
        //definimos variable e instanciamos que es de tipo matriz
        int edades[][] = new int [3][2];
        System.out.println("edades = " + edades);
        
        //ASIGNAMOS VALORES A NUESTRA MATRIZ
        edades[0][0]= 5;
        edades[0][1]= 7;
        edades[1][0]= 8;
        edades[1][1]= 4;
        
        //IMPRIMIMOS
        System.out.println(" edades 0-0 = "+ edades[0][0]);
        System.out.println(" edades 0-1 = "+ edades[0][1]);
        System.out.println("\n");
        
        //IMPRIMIMOS POR EL CICLO FOR 
                         //Aqui nos regresa el largo de los reglones
        for (int ren = 0; ren < edades.length; ren++) {
                        //Aqui nos regresa el largo de las columnas
            for (int col = 0; col < edades[ren].length; col++) {
                              //ren=0 entonces length quiere decir el maximo del reglon 0 que es 1
                System.out.println(" edades " + ren + "-"+col+ " "+ edades[ren][col]);
                //el bucle solo terminara cuando sea false osea 2<2=false osea que imprimira 2 veces
                //por que comienza desde 0 y luego se aumenta a 1 y sigue hasta que llega a 2 y ahi acaba el bucle 
                //por lo tanto recien la variable "ren" se aumentara mas 1 y asi sucesibamente 
            }
            
        }
        System.out.println("\n");
        
        //AHORA MATRICES CON TIPO STRING
        String frutas[][]= {{"naranja", "limon"},{"fresa", "zarzamora", "mora"}};
        for (int ren = 0; ren < frutas.length ; ren++) {
            for (int col = 0; col < frutas[ren].length; col++) {
                System.out.println(" frutas "+ren+"-"+col+" = "+ frutas[ren][col]);
            }
            
        }
        //TRABAJAMOS CON OBJETOS
        PersonaMatricesObjetos personas[][]=new PersonaMatricesObjetos[2][3];
        personas[0][0]=new PersonaMatricesObjetos("juan");
        personas[0][1]=new PersonaMatricesObjetos("karla");
        personas[0][2]=new PersonaMatricesObjetos("maria");
        personas[1][0]=new PersonaMatricesObjetos("antoni");
        personas[1][1]=new PersonaMatricesObjetos("jose");
        personas[1][2]=new PersonaMatricesObjetos("carla");
        System.out.println("\n");
        
        //UTILIZANDO UN METODO PARA IMPRIMIR LA MATRIZ
        imprimir(personas);
    }
    
    //CREAMOS ESTE METODO PARA NO HACER MUCHO CODIGO
    public static void imprimir(Object matriz[][]){
        for (int ren = 0; ren < matriz.length ; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println(" frutas "+ren+"-"+col+" = "+ matriz[ren][col]);
            }
        }    
    }
}
