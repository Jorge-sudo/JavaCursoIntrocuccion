
package Matrices;


public class PersonaMatricesObjetos {

    
    //CREAMOS ATRIBUTO
    private String nombre;
    
    //CREAMOS CONSTRUCTOR
    public PersonaMatricesObjetos(String nombre) {
        this.nombre = nombre;
    }
    
    //SET Y GET DEL ATRIBUTO
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "PersonaVectorObjetos{" + "nombre=" + nombre + '}'+ ", " + super.toString();
    }
    
}
