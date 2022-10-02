
package PalabraFinal;
 
//CUANDO UNA CLASE TIENE FINAL NO PUEDE TENER SUB CLASES OSEA NO PUEDE TENER CLASES HIJAS
public /*final*/ class FinalEnMetodosPersona {
    //TAMBIEN SE PUEDEN CREAR ATRIBUTOS PERO CON LA PALABRA FINAL NO SE PODRAN MODIFICAR 
    public final static int MI_CONSTANTE = 1;
    
    
    private String nombre;
    
    //RECORDAR QUE EN LOS METODOS TAMBIEN FUNCIONA DE LA MISMA MANERA LA PALABRA FINAL 
    //OSEA QUE YA NO SE PODRA MODIFICAR 
    public /*final*/ void imprimir(){
        System.out.println("Metodo imprimir desde clase padre");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
