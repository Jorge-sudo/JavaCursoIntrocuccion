
package PalabraFinal;

public class FinalVariables {
    public static void main(String[] args) {
        //Cuando se le pone final quiere decir que esa varibale no se le puede modificar 
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        //miaVaribale = 5; no nos permite modificarlo por el FINAL 
        
                        //OBJETOS Y CLASES PRUEBA 
        
        //TAMPOCO SE PUEDE MODIFICAR EL ATRIBUTO POR QUE ESTA MARCADO COMO FINAL 
        //FinalEnMetodosPersona.MI_CONSTANTE = 5;
        System.out.println(" Mi constante = " + FinalEnMetodosPersona.MI_CONSTANTE);
        
        final FinalEnMetodosPersona obj=new FinalEnMetodosPersona();
        //esto no se puede hacer por la palabra final en la variable obj
        //obj = new FinalEnMetodosPersona();
        
        //Sin embargo si se puede modificar los datos del objeto
        obj.setNombre(" Juan");
        System.out.println(" nombre = " + obj.getNombre());
        obj.setNombre(" Carlos");
        System.out.println(" nombre = " + obj.getNombre());
    }
}
