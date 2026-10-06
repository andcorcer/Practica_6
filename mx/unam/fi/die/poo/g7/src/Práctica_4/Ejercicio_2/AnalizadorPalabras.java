// Importes
package mx.unam.fi.die.poo.g7.src.Práctica_4.Ejercicio_2;
import java.util.HashMap;

public class AnalizadorPalabras {
  
  private String oracion;
  private HashMap<String, Integer> frecuencias;

  public AnalizadorPalabras(String oracion) {
    this.oracion = oracion;
    this.frecuencias = new HashMap<>();
  }

  public int contarPalabras() {
    // Convertimos la oración a minúsculas, nos deshacemos de todos los caracteres que sean signos de puntuación, nos deshacemos de espacios innecesarios al inicio y al final y separamos cada palabra en distintos arreglos
    String[] palabras = oracion
      .toLowerCase()
      .replaceAll("[^a-záéíóúüñ0-9 ]", "") // Eliminamos todos los signos de puntuación
      .trim() // Eliminamos espacios extra al inicio y al final
      .split("\\s+"); // Separamos por espacios (funciona también si hay múltiples en sucesión)

    // Retornamos la longitud de las palabras
    return palabras.length;
  }

  public int obtenerNumeroPalabrasDuplicadas() {
    // Limpiamos el HashMap previo
    frecuencias.clear();

    // Convertimos la oración a minúsculas, nos deshacemos de todos los caracteres que sean signos e puntuación, nos deshacemos de espacios innecesarios al inicio y al final y separamos cada palabra en distintos arreglos
    String[] palabras = oracion
      .toLowerCase()
      .replaceAll("[^a-záéíóúüñ0-9 ]", "") // Eliminamos todos los signos de puntuación
      .trim() // Eliminamos espacios extra al inicio y al final
      .split("\\s+"); // Separamos poor espacios (funciona también s hay múltiples en sucesión)

    for (String palabra : palabras) {
      // Si ya agregamos la clave al Map, solo le sumamos 1 a su valor, y si no la hemos agregado, la inicializamos como 1
      if (frecuencias.containsKey(palabra)) {
        frecuencias.put(palabra, frecuencias.get(palabra) + 1);
      } else {
        frecuencias.put(palabra, 1);
      }
    }

    // Iteramos todas las claves y sus valores y vamos agregando 1 a contadorDuplicadas por cada clave cuyo valor sea más que 1
    int contadorDuplicadas = 0;
    for (int cantidad : frecuencias.values()) {
      if (cantidad > 1) {
        contadorDuplicadas++;
      }
    }

    // Retornamos la cantidad de duplicadas
    return contadorDuplicadas;
  }

  public void mostrarDuplicadas() {
    System.out.println("\nPalabras Duplicadas");

    // Declaramos una variable bool para mantener registro de si hay alguna duplicada
    boolean hayPalabrasDuplicadas = false;

    // Por cada clave, accedemos a su valor y si este es más que 1 (es decir que se repite), imprimimos la clave y el valor
    for (String clave : frecuencias.keySet()) {
      int valor = frecuencias.get(clave);
      if (valor > 1) {
        System.out.println(clave + ": " + valor + " veces");
        hayPalabrasDuplicadas = true;
      }
    }

    // Si no hay palabras duplicadas lo imprimimos a la pantalla
    if (!hayPalabrasDuplicadas) {
      System.out.println("No hay palabras duplicadas");
    }
  }
}
