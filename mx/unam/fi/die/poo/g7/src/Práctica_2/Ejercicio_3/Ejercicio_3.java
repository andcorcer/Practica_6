// Programa que imprime los múltiplos por 10, 100 y 1000 de los primeros 5 números enteros

// Importes
package mx.unam.fi.die.poo.g7.src.Práctica_2.Ejercicio_3;

public class Ejercicio_3 {

  public static void main(String[] args) {
    // Primera línea de la tabla
    System.out.println("n\t|   n * 10\t|   n * 100\t|   n * 1000");

    // Imprimimos división de los encabezados de la tabla
    System.out.println("------------------------------------------------------");

    // Iteramos 5 veces por cada línea de la tabla
    for (int n = 1; n <= 5; n++) {
      System.out.println(n + "\t|     " + (n * 10) + "\t|     " + (n * 100) + "\t|     " + (n * 1000));
    }
  }
}
