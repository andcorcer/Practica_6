// Importes
package mx.unam.fi.die.poo.g7.src.Práctica_5.Ejercicio_3;
import java.util.Scanner;

// Clase Main
public class MainFecha {

  public static void main(String[] args) {
    // Declaramos el scanner
    Scanner scanner = new Scanner(System.in);

    
    String entradaDia, entradaMes, entradaAño;
    int dia, mes, año;

    // Solicitamos al usuario proveer una fecha para inicializar la clase Fecha
    do {
      System.out.print("\nIngresa un dia: ");
      entradaDia = scanner.nextLine();

      if (entradaDia.isEmpty()) {
        System.out.println("ERROR: no se ingresó nada, intenta de nuevo");
      }
    } while (entradaDia.isEmpty());
    dia = Integer.parseInt(entradaDia);

    do {
      System.out.print("\nIngresa un mes: ");
      entradaMes = scanner.nextLine();

      if (entradaMes.isEmpty()) {
        System.out.println("ERROR: no se ingresó nada, intenta de nuevo");
      }
    } while (entradaMes.isEmpty());
    mes = Integer.parseInt(entradaMes);

    do {
      System.out.print("\nIngresa un año: ");
      entradaAño = scanner.nextLine();

      if (entradaAño.isEmpty()) {
        System.out.println("ERROR: no se ingresó nada, intenta de nuevo");
      }
    } while (entradaAño.isEmpty());
    año = Integer.parseInt(entradaAño);

    // Instanciamos la clase
    Fecha fecha = new Fecha(dia, mes, año);

    // Getters
    int dia1 = fecha.getDia();
    System.out.println(dia1);
    int mes1 = fecha.getMes();
    System.out.println(mes1);
    int año1 = fecha.getAño();
    System.out.println(año1);

    fecha.mostrarFecha();

    // Setters
    fecha.setDia(31);
    fecha.setMes(07);
    fecha.setAño(2019);

    // Getters
    int dia2 = fecha.getDia();
    System.out.println(dia2);
    int mes2 = fecha.getMes();
    System.out.println(mes2);
    int año2 = fecha.getAño();
    System.out.println(año2);

    fecha.mostrarFecha();

    // Cerramos el scanner
    scanner.close();
  }
}
