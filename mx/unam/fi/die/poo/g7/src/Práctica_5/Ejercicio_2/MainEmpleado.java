// Importes
package mx.unam.fi.die.poo.g7.src.Práctica_5.Ejercicio_2;

class MainEmpleado {
    public static void main(String[] args){
        Empleado empleado1 = new Empleado("Valeria","Torres",1200);

        // Getters
        String nombre1 = empleado1.getNombre();
        System.out.println(nombre1);
        String apellido1 = empleado1.getApellido();
        System.out.println(apellido1);
        double salario1 = empleado1.getSalarioMensual();
        System.out.println(salario1);
        empleado1.mostrar();
        
        // Setters
        empleado1.setSalarioMensual(2000);
        empleado1.setNombre("Andrés");
        empleado1.setApellido("Hernández");

        String nombre2 = empleado1.getNombre();
        System.out.println(nombre2);
        String apellido2 = empleado1.getApellido();
        System.out.println(apellido2);
        double salario2 = empleado1.getSalarioMensual();
        System.out.println(salario2);
        empleado1.mostrar();

        // Métodos
        empleado1.aumentarSalario();
        System.out.println("Aumento Salario (10%)");
        empleado1.mostrar();
    }
}