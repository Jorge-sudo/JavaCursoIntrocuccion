
package ContextoEstatico;

public class Persona {

    
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;//esta variable se asocia con la clase y no con el objeto
    
    public Persona(String nombre){
        this.nombre=nombre;
        
        //Con esto imcrementamos el contador por cada objeto nuevo que se cree
        //this.contadorPersonas++; //si es posible este codigo pero no es recomendable utilizar "this"
                                   //en una variable estatica
        //Esto es lo recomendado
        Persona.contadorPersonas++;
        
        //asignar el nuevo valor ala variable idPersona
        this.idPersona=Persona.contadorPersonas;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }

    @Override//esta es una anotacion debe estar antes del toString 
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    
    
}
