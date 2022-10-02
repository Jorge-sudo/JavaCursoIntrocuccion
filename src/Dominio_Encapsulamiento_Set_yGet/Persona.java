
package Dominio_Encapsulamiento_Set_yGet;

public class Persona {
    private String nombre;//CON EL PRIVATE PODEMOS ACCEDER A ESTE ATRIBUTO DESDE OTRO PACKAGE 
    private double sueldo;//PERO SI NO PONEMOS PRIVATE SOLO SE PUEDE AXEDER DE ESTE PACKAGE
    private boolean elimindo;
    
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre=nombre;
        this.sueldo=sueldo;
        this.sueldo=sueldo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isElimindo() {
        return this.elimindo;
    }

    public void setElimindo(boolean elimindo) {
        this.elimindo = elimindo;
    }

    //METODO TO-STRING
    @Override //esta es una anotacion debe estar antes del toString 
    public String toString(){
        return "Persona [ nombre: "+this.nombre
                +", sueldo: "+this.sueldo+", Eliminado: "+this.elimindo+" ]";
    }
}
