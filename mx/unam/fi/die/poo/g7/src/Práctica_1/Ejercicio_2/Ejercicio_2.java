// Programa que tiene una calculadora básica con operaciones 1. suma, 2. resta, 3. multiplicación, 4. división, 5. potencia, 6. raíz y 7. módulo

// Importes
package mx.unam.fi.die.poo.g7.src.Práctica_1.Ejercicio_2;
import java.util.Scanner;

public class Ejercicio_2 {

  public static void main(String[] args) {
    // Declaramos opcion fuera del while
    int opcion;

    // Declaramos el scanner
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bienvenido a la Calculadora Básica");

    System.out.print("Ingrese el primer número: ");
    double num1 = scanner.nextDouble();

    System.out.print("Ingrese el segundo número: ");
    double num2 = scanner.nextDouble();

    do {
      System.out.println("\n- Seleccione una operación -");
      System.out.println("0. Salir");
      System.out.println("1. Suma (num1 + num2)");
      System.out.println("2. Resta (num1 - num2)");
      System.out.println("3. Multiplicación (num1 * num2)");
      System.out.println("4. División (num1 / num2)");
      System.out.println("5. Potencia (num1 ^ num2)");
      System.out.println("6. Raíz (raíz num2 de num1)");
      System.out.println("7. Módulo (num1 % num2)");
      System.out.print("Opción: ");
      opcion = scanner.nextInt();

      System.out.println();

      switch (opcion) {
        // Salida
        case 0:
          System.out.println("Se salió exitosamente del programa");
          break;
        // Suma
        case 1:
          System.out.println(
            "El resultado de la suma de " +
              num1 +
              " mas " +
              num2 +
              " = " +
              (num1 + num2)
          );
          break;
        // Resta
        case 2:
          System.out.println(
            "El resultado de la resta de " +
              num1 +
              " menos " +
              num2 +
              " = " +
              (num1 - num2)
          );
          break;
        // Multiplicación
        case 3:
          System.out.println(
            "El resultado del producto de " +
              num1 +
              " por " +
              num2 +
              " = " +
              num1 * num2
          );
          break;
        // División
        case 4:
          if (num2 != 0) {
            System.out.println(
              "El resultado de la división de " +
                num1 +
                " entre " +
                num2 +
                " = " +
                num1 / num2
            );
          } else {
            // Edge Case para la división entre 0
            System.out.println(
              "Error: No se puede realizar una división entre 0"
            );
          }
          break;
        // Potencia
        case 5:
          System.out.println(
            "El resultado del producto de " +
              num1 +
              " elevado a " +
              num2 +
              " = " +
              Math.pow(num1, num2)
          );
          break;
        // Raíz
        case 6:
          if (num2 == 0) {
            // Edge Case para raíz 0 inexistente
            System.out.println(
              "Error: El índice de la raíz no puede ser cero."
            );
          } else if (num1 < 0 && num2 % 2 == 0) {
            // Edge Case para raíz par para números negativos
            System.out.println(
              "Error: No existe raíz con índice par para números negativos en los reales."
            );
          } else {
            // Obtenemos la raíz usando .pow con el recíproco de num2
            System.out.println(
              "El resultado de la raíz " +
                num2 +
                " de " +
                num1 +
                " = " +
                Math.pow(num1, 1 / num2)
            );
          }
          break;
        // Módulo
        case 7:
          if (num2 != 0) {
            System.out.println(
              "El resultado del módulo de " +
                num1 +
                " entre " +
                num2 +
                " = " +
                (num1 % num2)
            );
          } else {
            // Edge Case para la división entre 0
            System.out.println("Error: No se puede realizar un módulo entre 0");
          }
          break;
        // Casos no identificados
        default:
          System.out.println("Opción no válida. Ingresar valor entre 0 y 7");
          break;
      }
    } while (opcion != 0);

    scanner.close();
  }
}
