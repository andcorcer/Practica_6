// Programa que en el que de una serie de 10 enteros ingresados por el usuario, se determina el mayor

// Importes
package mx.unam.fi.die.poo.g7.src.Práctica_2.Ejercicio_2;
import java.util.Scanner;

public class Ejercicio_2 {

  public static void main(String[] args) {
    // Declaramos e inicializamos el mayor como el valor mínimo posible de un entero
    int mayor = Integer.MIN_VALUE;

    // Declaramos el scanner
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bienvenido al Detector del mayor de 10 números");

    // Iteramos 10 veces pidíendole al usuario ingresar un número y comparandolo con el mayor
    for (int contador = 1; contador <= 10; contador++) {
      System.out.print("Ingrese el numero " + contador + ": ");
      int numero = scanner.nextInt();
      if (numero > mayor) {
        mayor = numero;
      }
    }

    // Se muestra el mayor de los números ingresados
    System.out.println("El mayor de los numeros ingresados es: " + mayor);

    scanner.close();
  }
}
