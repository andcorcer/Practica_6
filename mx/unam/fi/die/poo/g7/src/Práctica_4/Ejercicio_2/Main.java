// Importes
package mx.unam.fi.die.poo.g7.src.Práctica_4.Ejercicio_2;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Declaramos el scanner
    Scanner scanner = new Scanner(System.in);

    String textoIngresado = "";

    // Solicitamos al usuario proveer una oración para inicializar la clase AnalizadorPalabras
    do {
      System.out.print("\nIngresa una oración para analizar: ");
      textoIngresado = scanner.nextLine();

      if (textoIngresado.isEmpty()) {
        System.out.println("ERROR: no se ingresó nada, intenta de nuevo");
      }
    } while (textoIngresado.isEmpty());

    // Instanciamos la clase
    AnalizadorPalabras analizador = new AnalizadorPalabras(textoIngresado);

    System.out.println("\nResultados Retornados por el Analizador");

    // Contar palabras
    int total = analizador.contarPalabras();
    System.out.println("\nTotal de palabras: " + total);

    // Retornar la cantidad de palabras duplicadas
    int cantidadDuplicadas = analizador.obtenerNumeroPalabrasDuplicadas();
    System.out.println("\nPalabras duplicadas: " + cantidadDuplicadas);

    // Mostrar las palabras que se repiten
    analizador.mostrarDuplicadas();

    // Cerramos el scanner
    scanner.close();
  }
}
