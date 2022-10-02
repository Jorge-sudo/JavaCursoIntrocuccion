
package Herencia;
//CLASE PADRE 

public class Persona {
    //Con protected las clases hijas podran acceder a esta clase no importa si esta en otro paquete
    protected String nombre;
    //tambien se puede con private pero las clases hijas solo podran acceder de manera indirecta con los set y get
    protected char genero;
    protected int edad;
    protected String direccion;
    
    //Agregamos nuestro constructor vacio 
    public Persona(){
        
    }
    //Agregamos nuestro constructor con argumentos 
    public Persona(String nombre){
        this.nombre=nombre;
    }     

    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder obj = new StringBuilder();
        //Utilizando el metodo append podemos concatenar informacion de la cadena 
        //pero de manera distinta y mas rapida
        obj.append(" Persona { nombre = ").append(this.nombre);
        obj.append(", genero = ").append(this.genero);
        obj.append(", edad = ").append(this.edad);
        obj.append(", direccion = ").append(this.direccion);
        obj.append(",  ").append(super.toString());//ESTO IMPRIMIRA LA DIRECCION DE MEMORIA DEL OBJETO
        obj.append("}");
        return obj.toString();//devolvemos el metodo toString para que se imprima la cadena 
    }
}
