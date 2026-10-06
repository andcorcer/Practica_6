// Importes
package mx.unam.fi.die.poo.g7.src.Práctica_5.Ejercicio_2;

class Empleado {
    private String nombre;
    private String apellido;
    private double salarioMensual;
    
    // Constructor
    public Empleado(String nombre, String apellido, double salarioMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioMensual = salarioMensual;     
    }

    // Getters
    public String getNombre() {
        return nombre;    
    }

    public String getApellido() {
        return apellido;    
    }
    
    public double getSalarioMensual() {
        return salarioMensual;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;    
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        } else {
            System.out.println("No se puede ingresar un salario negativo");
        }
    }

    // Métodos
    public void aumentarSalario() {
        salarioMensual = salarioMensual + (salarioMensual * 0.10);
    }
    
    public void mostrar() {
        System.out.println("Empleado: " + nombre + " " + apellido + " salario anual $ " + (salarioMensual * 12)); 
    }
}