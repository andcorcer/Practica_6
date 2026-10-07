// Programa que recibe un número entero de 5 dígitos y verifica si es un palíndromo

// Importes
package mx.unam.fi.die.poo.g7.src.Práctica_3.Ejercicio_2;
import java.util.Scanner;

public class Ejercicio_2 {

  // Función 'boolean' (ya que el resultado retornado es un boolean) que verifica si un número ingresado es un palíndromo
  public static boolean esPalindromo(int numero) {
    // Guadamos la variable numero en otra ya que la vamos a modificar para sacar el invertido
    int original = numero;
    int invertido = 0;

    // Ciclo que va iterando cada dígito empezando por el último
    while (numero > 0) {
      // Obtenemos el último dígito usando un módulo de 10
      int ultimoDigito = numero % 10;
      // Recorremos los números que ya han sido agregados una posición a la izquierda y agregamos el último dígito al final
      invertido = invertido * 10 + ultimoDigito;
      // Vamos recorriendo los dígitos del número original y tras cada vuelta recorremos un dígito a la izquierda
      numero /= 10;
    }

    // Retornamos un bool comparando el número original y el invertido
    return original == invertido;
  }

  public static void main(String[] args) {
    // Declaramos el número a ingresar
    int numero;

    // Declaramos el scanner
    Scanner scanner = new Scanner(System.in);

    System.out.println(
      "Bienvenido al Detector de Palíndromos para números de 5 dígitos"
    );

    do {
      System.out.print("Ingrese el número: ");
      numero = scanner.nextInt();
      if (numero < 10000 || numero > 99999) {
        System.out.println(
          "ERROR: El número ingresado debe de ser de 5 dígitos y positivo"
        );
      }
    } while (numero < 10000 || numero > 99999);

    if (esPalindromo(numero)) {
      System.out.println(
        "El numero ingresado (" + numero + ") es un palíndromo"
      );
    } else {
      System.out.println(
        "El numero ingresado (" + numero + ") no es un palíndromo"
      );
    }

    scanner.close();
  }
}
