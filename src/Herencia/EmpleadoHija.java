//CLASE HIJA
package Herencia;

public class EmpleadoHija extends Persona{
    //Como ya no tendremos sub clases pondremos private ya que protected se pone en la clase padre 
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
    public EmpleadoHija(){
      //  super(); no es necesario ponerlo por que java lo pone por default pero es necesario saberlo 
      //que llama a la clase padre
        this.idEmpleado = ++EmpleadoHija.contadorEmpleado;
    }

    public EmpleadoHija(String nombre, double sueldo) {
//        super(nombre);
        this();//la palabra this llama al constructor vacio para que se inicialize la variable contador empleado
        this.nombre=nombre;//podemos acceder a la clase padre gracias a que las variables son de tipo "protected"
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder obj = new StringBuilder();
        //Utilizando el metodo append podemos concatenar informacion de la cadena 
        //pero de manera distinta y mas rapida
        obj.append(" Empleado { idEmpleado = ").append(this.idEmpleado);
        obj.append(", sueldo = ").append(this.sueldo);
        //con super.toString podemos ingresar a los atributos de la clase padre
        obj.append(", ").append(super.toString());
        obj.append("}");
        return obj.toString();//devolvemos el metodo toString para que se imprima la cadena 
    }
}
